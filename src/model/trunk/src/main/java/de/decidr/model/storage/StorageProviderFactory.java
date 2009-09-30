/*
 * The DecidR Development Team licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package de.decidr.model.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import de.decidr.model.exceptions.IncompleteConfigurationException;
import de.decidr.model.logging.DefaultLogger;

/**
 * A factory that can be used to create a <code>{@link StorageProvider}</code>
 * according to a specified configuration.<br>
 * <em>WARNING: Files can only be retrieved by the <code>{@link StorageProvider}</code> they were stored by!</em>
 * <p>
 * Usage: new StorageProviderFactory().getStorageProvider();
 * 
 * @author Markus Fischer
 * @author Daniel Huss
 * @author Reinhold
 * @version 0.1
 */
public class StorageProviderFactory {

    /**
     * The default properties file.
     */
    private static final File DEFAULT_CONFIG_FILE = new File(
            "decidr-storage.xml");

    Logger log = DefaultLogger.getLogger(StorageProviderFactory.class);

    private List<Class<? extends StorageProvider>> knownProviders = new ArrayList<Class<? extends StorageProvider>>();

    /**
     * The configuration that needs to be applied to the
     * <code>{@link StorageProvider}</code>.
     * <p>
     * Contains a set of standard properties also settable through methods
     * provided by this class and some provider-specific properties, e.g.
     * authentification data. If a property is not set explicitly, all values
     * are considered acceptable.
     * <p>
     * see <code>{@link StorageProvider#isApplicable(Properties)}</code> for
     * default properties applicable to all
     * <code>{@link StorageProvider StorageProviders}</code>.
     * 
     * @see StorageProvider
     */
    private Properties config;

    private Class<? extends StorageProvider> selectedProvider;

    /**
     * Creates a new StorageProviderFactory using an empty configuration.
     */
    public StorageProviderFactory() {
        this(new Properties());
    }

    /**
     * Creates a new StorageProviderFactory using the given configuration file.
     * 
     * @param configFile
     *            configuration file to use
     * @throws IOException
     *             see <code>{@link #StorageProviderFactory(InputStream)}</code>
     * @throws FileNotFoundException
     *             thrown when the specified file can't be located/accessed on
     *             the file system.
     * @throws InvalidPropertiesFormatException
     *             see <code>{@link #StorageProviderFactory(InputStream)}</code>
     */
    public StorageProviderFactory(File configFile)
            throws InvalidPropertiesFormatException, FileNotFoundException,
            IOException {
        this(new FileInputStream(configFile));
    }

    /**
     * Creates a new StorageProviderFactory using the given configuration file.
     * 
     * @param configFile
     *            configuration file to use
     * @throws IOException
     *             see <code>{@link #configure(InputStream)}</code>
     * @throws InvalidPropertiesFormatException
     *             see <code>{@link #configure(InputStream)}</code>
     */
    public StorageProviderFactory(InputStream configFile)
            throws InvalidPropertiesFormatException, IOException {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + "(InputStream)");
        configure(configFile);
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + "(InputStream)");
    }

    /**
     * Creates a new StorageProviderFactory using the given configuration file.
     * 
     * @param config
     *            configuration <code>{@link Properties}</code> to use
     */
    public StorageProviderFactory(Properties config) {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".configure(Properties)");
        configure(config);
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".configure(Properties)");
    }

    /**
     * (Re-)applies the current configuration.
     * 
     * @return this object for method chaining.
     */
    public StorageProviderFactory configure() {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".configure()");
        log.debug("find available providers");
        discoverProviders();

        log.debug("find applicable provider");
        for (Class<? extends StorageProvider> candidate : knownProviders) {
            try {
                if (candidate.newInstance().isApplicable(config)) {
                    selectedProvider = candidate;
                    // found a usable class - use
                    break;
                }
            } catch (Exception e) {
                // can't properly instantiate - ignore
                continue;
            }
        }
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".configure()");
        return this;
    }

    /**
     * Applies a new configuration.
     * 
     * @param configFile
     *            configuration file to use
     * @return this object for method chaining.
     * @throws IOException
     *             thrown when an error occurs while reading the config file.
     * @throws InvalidPropertiesFormatException
     *             thrown when the specified file does not conform to the Java
     *             properties specification.
     */
    public StorageProviderFactory configure(InputStream configFile)
            throws InvalidPropertiesFormatException, IOException {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".configure(InputStream)");
        Properties config = new Properties();
        log.debug("loading config from InputStream");
        config.loadFromXML(configFile);
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".configure(InputStream)");
        return configure(config);
    }

    /**
     * Applies a new configuration.
     * 
     * @param config
     *            configuration <code>{@link Properties}</code> to use
     * @return this object for method chaining.
     */
    public StorageProviderFactory configure(Properties config) {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".configure(Properties)");
        this.config = config;
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".configure(Properties)");
        return configure();
    }

    /**
     * Applies the default configuration.
     * 
     * @throws IOException
     *             see <code>{@link #configure(InputStream)}</code>
     * @throws FileNotFoundException
     *             thrown when the default config file can't be located/accessed
     *             on the file system.
     * @throws InvalidPropertiesFormatException
     *             see <code>{@link #configure(InputStream)}</code>
     * @return this object for method chaining.
     */
    public static StorageProviderFactory getDefaultFactory()
            throws InvalidPropertiesFormatException, FileNotFoundException,
            IOException {
        return new StorageProviderFactory(new FileInputStream(
                DEFAULT_CONFIG_FILE));
    }

    /**
     * Tries to find available <code>{@link StorageProvider}</code>.
     */
    private void discoverProviders() {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".discoverProviders()");
        log.debug("manually creating new list "
                + "and filling it with all know providers");
        knownProviders = new ArrayList<Class<? extends StorageProvider>>();
        knownProviders.add(LocalStorageProvider.class);
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".discoverProviders()");
    }

    /**
     * Returns a configured storage provider.
     * 
     * @return <ul>
     *         <li value="-"><code>null</code>, if there is no
     *         <code>{@link StorageProvider}</code> available that is compatible
     *         with the specified configuration.</li> <li value="-">otherwise,
     *         an instance of a <code>{@link StorageProvider}</code> conforming
     *         to the specified configuration.</li>
     *         </ul>
     * @throws IncompleteConfigurationException
     *             see
     *             <code>{@link StorageProvider#applyConfig(Properties)}</code>
     */
    public StorageProvider getStorageProvider()
            throws IncompleteConfigurationException {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".getStorageProvider()");
        StorageProvider result = null;

        log.debug("creating & configuring new provider instance");
        if (selectedProvider != null) {
            try {
                result = selectedProvider.newInstance();
                result.applyConfig(config);
            } catch (InstantiationException e) {
                selectedProvider = null;
            } catch (IllegalAccessException e) {
                selectedProvider = null;
            }
        }

        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".getStorageProvider()");
        return result;
    }

    /**
     * Whether to use the Amazon S3 service for storage.
     * 
     * @param amazons3
     *            Whether to use the service or forbid usage.
     */
    public void setAmazonS3(Boolean amazons3) {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".setAmazonS3(Boolean)");
        log.debug("setting amazon S3 setting");
        config.setProperty(StorageProvider.AMAZON_S3_CONFIG_KEY, amazons3
                .toString());
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".setAmazonS3(Boolean)");
    }

    /**
     * Whether to use only local or only remote storage. Local storage is
     * available only locally, remote storage is also available remotely.
     * 
     * @param local
     *            Whether to force local or remote storage.
     */
    public void setLocalOnly(Boolean local) {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".setLoaclOnly(Boolean)");
        log.debug("setting local store setting");
        config.setProperty(StorageProvider.LOCAL_CONFIG_KEY, local.toString());
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".setLoaclOnly(Boolean)");
    }

    /**
     * Whether the storage should be forced to be persistent or volatile.
     * Volatile storage may be lost on system reboot/failure.
     * 
     * @param persistent
     *            Whether to force persistent or volatile storage.
     */
    public void setPersistent(Boolean persistent) {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".setPersistent(Boolean)");
        log.debug("setting persistency setting");
        config.setProperty(StorageProvider.PERSISTENT_CONFIG_KEY, persistent
                .toString());
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".setPersistent(Boolean)");
    }

    /**
     * Specifies the protocol that should be used.<br>
     * Examples: &quot;file&quot;, &quot;http&quot;, &quot;https&quot;
     * 
     * @param protocol
     *            The protocol that should be used to access the files.
     */
    public void setProtocol(String protocol) {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".setProtocol(String)");
        log.debug("setting protocol setting");
        config.setProperty(StorageProvider.PROTOCOL_CONFIG_KEY, protocol);
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".setProtocol(String)");
    }

    /**
     * Unsets the &quot;amazons3&quot; property, signalling that the property is
     * not important.
     */
    public void unsetAmazonS3() {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".unsetAmazonS3()");
        log.debug("removing amazon S3 setting");
        config.remove(StorageProvider.AMAZON_S3_CONFIG_KEY);
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".unsetAmazonS3()");
    }

    /**
     * Unsets the &quot;local&quot; property, signalling that the property is
     * not important.
     */
    public void unsetLocalOnly() {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".unsetLocalOnly()");
        log.debug("removing local store setting");
        config.remove(StorageProvider.LOCAL_CONFIG_KEY);
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".unsetLocalOnly()");
    }

    /**
     * Unsets the &quot;persistent&quot; property, signalling that the property
     * is not important.
     */
    public void unsetPersistent() {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".unsetPersistent()");
        log.debug("removing persistency setting");
        config.remove(StorageProvider.PERSISTENT_CONFIG_KEY);
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".unsetPersistent()");
    }

    /**
     * Unsets the &quot;protocol&quot; property, signalling that the property is
     * not important.
     */
    public void unsetProtocol() {
        log.trace("Entering " + StorageProviderFactory.class.getSimpleName()
                + ".unsetProtocol()");
        log.debug("removing protocol setting");
        config.remove(StorageProvider.PROTOCOL_CONFIG_KEY);
        log.trace("Leaving " + StorageProviderFactory.class.getSimpleName()
                + ".unsetProtocol()");
    }
}
