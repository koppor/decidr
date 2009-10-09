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
package de.decidr.model.logging;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 * Provides a common logging configuration for the DecidR components and
 * subsystems.
 * <p>
 * XXX use JDBC appender instead of or in addition to console appender, add
 * support for remotely triggered log level changes. See
 * http://www.dankomannhaupt.de/projects/index.html for an improved JDBC
 * appender.
 */
public class DefaultLogger {

    private static final String DEFAULT_LOGGER = "de.decidr";
    private static Appender defaultAppender = new ConsoleAppender(
            new PatternLayout("[%p] %m%n"), ConsoleAppender.SYSTEM_OUT);

    static {
        // run configurator - every new logger will inherit the defaultAppender
        BasicConfigurator.resetConfiguration();
        BasicConfigurator.configure(defaultAppender);

        Logger.getLogger(DEFAULT_LOGGER).addAppender(defaultAppender);
        // set default logging options
        Logger.getLogger(DEFAULT_LOGGER).setLevel(Level.DEBUG);
        // Don't pass messages to higher-level loggers
        Logger.getLogger(DEFAULT_LOGGER).setAdditivity(false);
    }

    public static Logger getLogger(Class<?> clazz) {
        return getLogger(clazz.getName());
    }

    public static Logger getLogger(String name) {
        return Logger.getLogger(name);
    }
}