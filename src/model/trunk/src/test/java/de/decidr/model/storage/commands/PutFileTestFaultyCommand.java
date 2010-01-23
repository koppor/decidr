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

package de.decidr.model.storage.commands;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import de.decidr.model.commands.AbstractTransactionalCommand;
import de.decidr.model.exceptions.StorageException;
import de.decidr.model.exceptions.TransactionException;
import de.decidr.model.storage.hibernate.HibernateEntityStorageProvider;
import de.decidr.model.transactions.TransactionStartedEvent;

public class PutFileTestFaultyCommand extends AbstractTransactionalCommand {

    java.io.File basicFile;
    Long fId;
    HibernateEntityStorageProvider storageProvider;
    boolean result;

    /**
     * Creates a new {@link PutFileTestFaultyCommand}
     */
    public PutFileTestFaultyCommand(Long fileId, File file,
            HibernateEntityStorageProvider provider) {

        basicFile = file;
        fId = fileId;
        storageProvider = provider;
    }

    public boolean getResult() {
        return result;
    }

    @Override
    public void transactionStarted(TransactionStartedEvent evt)
            throws TransactionException {
        result = true;

        try {
            storageProvider.putFile((FileInputStream) null, fId, basicFile
                    .length());
            result = false;
        } catch (IllegalArgumentException e) {
            // nothing to do
        } catch (StorageException e) {
            result = false;
        }

        try {
            storageProvider.putFile(new FileInputStream(basicFile
                    .getAbsolutePath()), (Long) null, basicFile.length());
            result = false;
        } catch (IllegalArgumentException e) {
            // nothing to do
        } catch (StorageException e) {
            result = false;
        } catch (FileNotFoundException e) {
            result = false;
        }

        try {
            storageProvider.putFile(new FileInputStream(basicFile
                    .getAbsolutePath()), fId, (Long) null);
            result = false;
        } catch (IllegalArgumentException e) {
            // nothing to do
        } catch (StorageException e) {
            result = false;
        } catch (FileNotFoundException e) {
            result = false;
        }
    }
}
