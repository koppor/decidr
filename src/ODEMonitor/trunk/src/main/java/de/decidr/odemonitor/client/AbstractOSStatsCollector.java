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

package de.decidr.odemonitor.client;

import org.apache.log4j.Logger;

import de.decidr.model.logging.DefaultLogger;

/**
 * Implementations of this abstract class should provide some standard
 * statistics in an operating system-dependent manner.
 * 
 * @author Reinhold
 */
public abstract class AbstractOSStatsCollector {

    Logger log = DefaultLogger.getLogger(AbstractOSStatsCollector.class);

    /**
     * Extending classes should provide an OS-dependent CPU load, which should
     * be the percentage of time the CPU processed jobs over the last second.
     * 
     * @return The CPU load over the last second rounded to the nearest percent.
     *         <code>-1</code> means an error occurred.
     */
    public abstract int getCPULoad();

    /**
     * Extending classes should provide an OS-dependent memory load, which
     * should be the percentage of RAM + swap actually used by applications and
     * the kernel (not buffers and disk cache).<br>
     * TODO how does swap figure into this - weighed 0.5?
     * 
     * @return The amount of memory used as a percentage of the total available
     *         memory, rounded to the nearest percent. <code>-1</code> means an
     *         error occurred.
     */
    public abstract int getMemLoad();

    /**
     * Returns the system load depending on the return values of
     * <code>{@link #getCPULoad()}</code> and <code>{@link #getMemLoad()}</code>
     * . This method may not be overridden by extending classes to guarantee
     * that all system-dependent stats collectors provide a comparable system
     * load.
     * 
     * @return The system load. <code>-1</code> means an error occurred.
     */
    public final int getSystemLoad() {
        log.trace("Entering " + AbstractOSStatsCollector.class.getSimpleName()
                + ".getSystemLoad()");
        int mem = getMemLoad();
        int cpu = getCPULoad();
        int sysLoad;

        /*
         * Use the larger value as system load. This also means that errors are
         * ignored if only one value couldn't be retrieved.
         */
        if (mem > cpu) {
            log.debug("using memory as system load: " + mem);
            sysLoad = mem;
        } else {
            log.debug("using cpu as system load: " + cpu);
            sysLoad = cpu;
        }

        log.trace("Leaving " + AbstractOSStatsCollector.class.getSimpleName()
                + ".getSystemLoad()");
        return sysLoad;
    }
}
