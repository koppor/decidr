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

package de.decidr.ui.controller;

import de.decidr.ui.view.SiteFrame;
import de.decidr.ui.view.UIBuilder;

/**
 * TODO: add comment
 *
 * @author AT
 */
public class UIDirector {
    
    private UIBuilder uiBuilder = null;
    private static UIDirector uiDirector = null;
    
    /**
     * The default constructor
     *
     */
    private UIDirector() {
        
    }

    /**
     * TODO: add comment
     *
     * @return
     */
    public SiteFrame getTemplateView() {
        return uiBuilder.getView();
    }

    /**
     * TODO: add comment
     *
     * @param uiBuilder
     */
    public void setUiBuilder(UIBuilder uiBuilder) {
        this.uiBuilder = uiBuilder;
    }
    
    public void createNewView(){
        uiBuilder.createNewView();
    }
    
    /**
     * TODO: add comment
     *
     */
    public void constructView(){
        uiBuilder.buildHeader();
        uiBuilder.buildContent();
        uiBuilder.buildNavigation();
    }
    
    public static UIDirector getInstance(){
       if(uiDirector == null){
           uiDirector = new UIDirector();
       }
       return uiDirector;
        
    }
   
}
