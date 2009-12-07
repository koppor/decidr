package de.decidr.model.entities;

// Generated 07.12.2009 17:47:57 by Hibernate Tools 3.2.4.GA

/**
 * WorkItemContainsFile generated by hbm2java
 */
public class WorkItemContainsFile implements java.io.Serializable {

    private WorkItemContainsFileId id;
    private WorkItem workItem;
    private File file;

    public WorkItemContainsFile() {
        //default empty JavaBean constructor
    }

    public WorkItemContainsFile(WorkItemContainsFileId id, WorkItem workItem,
            File file) {
        //generated full constructor
        this.id = id;
        this.workItem = workItem;
        this.file = file;
    }

    public WorkItemContainsFileId getId() {
        return this.id;
    }

    public void setId(WorkItemContainsFileId id) {
        this.id = id;
    }

    public WorkItem getWorkItem() {
        return this.workItem;
    }

    public void setWorkItem(WorkItem workItem) {
        this.workItem = workItem;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
