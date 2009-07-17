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

package de.decidr.modelingtool.client.menu;

import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.MenuBar;

/**
 * TODO: add comment
 *
 * @author JE
 */
public interface MenuImageBundle extends MenuBar.MenuBarImages {

    @Resource("de/decidr/modelingtool/public/images/menu/undo.png")
    public AbstractImagePrototype undo();
    
    @Resource("de/decidr/modelingtool/public/images/menu/redo.png")
    public AbstractImagePrototype redo();
    
    @Resource("de/decidr/modelingtool/public/images/menu/save.png")
    public AbstractImagePrototype save();
    
    @Resource("de/decidr/modelingtool/public/images/menu/delete.png")
    public AbstractImagePrototype delete();
    
    @Resource("de/decidr/modelingtool/public/images/menu/email.png")
    public AbstractImagePrototype email();
    
    @Resource("de/decidr/modelingtool/public/images/menu/humantask.png")
    public AbstractImagePrototype humantask();
    
}
