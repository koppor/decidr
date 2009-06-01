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

package de.decidr.model.exceptions;

/**
 * Thrown when a  Vaadin {@link Item} property has an unexpected or wrong type.
 * 
 * @author Daniel Huss
 * @version 0.1
 */
public class PropertyTypeException extends TransactionException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     * 
     * @param propertyId
     * @param cause
     */
    public PropertyTypeException(Object propertyId, Throwable cause) {
        super(String.format("Property %1$s is has an unexpected type.",
                propertyId == null ? "null" : propertyId.toString()), cause);
    }

    /**
     * Constructor
     * 
     * @param cause
     */
    public PropertyTypeException(Throwable cause) {
        this("<unknown>", cause);
    }

}
