package de.decidr.ui.view;


import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

public class WorkItemComponent extends CustomComponent {
    
    /**
     * TODO: add comment
     */
    private static final long serialVersionUID = -2110748321898265548L;

    private static WorkItemComponent workItemComponent = null;
    
    private VerticalLayout verticalLayout = null;
    
    private SearchPanel searchPanel = null;
    private Panel tablePanel = null;
    
    private Label headerLabel = null;
    private Label showWorkItemLabel = null;
    
    private NativeSelect tenantNativeSelect = null;
    
    private static final String[] tenants = new String[]{"All tenants", "Current tenants"};
    
    private Table workItemTable = null;
    
    private WorkItemComponent(){
        init();
    }
    
    private void init(){
        verticalLayout = new VerticalLayout();

        searchPanel = new SearchPanel();
        tablePanel = new Panel();
        
        headerLabel = new Label(
                "<h2>My work items </h2>");
        headerLabel.setContentMode(Label.CONTENT_XHTML);
        showWorkItemLabel = new Label("Show work items from: ");
        
        tenantNativeSelect = new NativeSelect();
        for(int i = 0; i < tenants.length; i++){
            tenantNativeSelect.addItem(tenants[i]);
        }
        
        workItemTable = new Table();
        workItemTable.setSizeFull();
        workItemTable.addContainerProperty("Name", String.class, null);
        workItemTable.addContainerProperty("Tenant", String.class, null);
        workItemTable.addContainerProperty("Data received", String.class, null);
        workItemTable.addContainerProperty("Status", String.class, null);
        
        setCompositionRoot(verticalLayout);
        
        verticalLayout.addComponent(headerLabel);        
        verticalLayout.addComponent(searchPanel);
        verticalLayout.setSpacing(true);
        
        searchPanel.getSearchHorizontalLayout().addComponent(showWorkItemLabel);
        searchPanel.getSearchHorizontalLayout().addComponent(tenantNativeSelect);
        
        verticalLayout.addComponent(tablePanel);
        tablePanel.addComponent(workItemTable);
        
    }
    
    public static WorkItemComponent getInstance(){
        if(workItemComponent == null){
            workItemComponent = new WorkItemComponent();
        }
        return workItemComponent;
    }

}
