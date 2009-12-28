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
package de.decidr.model.entities;

// Generated 28.12.2009 10:39:25 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * InvitationView generated by hbm2java.
 */
public class InvitationView implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private long id;

    /** The sender id. */
    private long senderId;

    /** The receiver id. */
    private long receiverId;

    /** The participate in workflow instance id. */
    private Long participateInWorkflowInstanceId;

    /** The join tenant id. */
    private Long joinTenantId;

    /** The administrate workflow model id. */
    private Long administrateWorkflowModelId;

    /** The creation date. */
    private Date creationDate;

    /** The sender first name. */
    private String senderFirstName;

    /** The sender last name. */
    private String senderLastName;

    /** The receiver first name. */
    private String receiverFirstName;

    /** The receiver last name. */
    private String receiverLastName;

    /** The administrated workflow model name. */
    private String administratedWorkflowModelName;

    /** The participate worfkwlow model name. */
    private String participateWorfkwlowModelName;

    /** The join tenant name. */
    private String joinTenantName;

    /** The workflow model owning tenant name. */
    private String workflowModelOwningTenantName;

    /** The participate tenant name. */
    private String participateTenantName;

    /**
     * Instantiates a new invitation view.
     */
    public InvitationView() {
        // default empty JavaBean constructor
    }

    /**
     * Instantiates a new invitation view.
     * 
     * @param id
     *            the id
     * @param senderId
     *            the sender id
     * @param receiverId
     *            the receiver id
     * @param creationDate
     *            the creation date
     */
    public InvitationView(long id, long senderId, long receiverId,
            Date creationDate) {
        // generated minimal constructor
        this.id = id;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.creationDate = creationDate;
    }

    /**
     * Instantiates a new invitation view.
     * 
     * @param id
     *            the id
     * @param senderId
     *            the sender id
     * @param receiverId
     *            the receiver id
     * @param participateInWorkflowInstanceId
     *            the participate in workflow instance id
     * @param joinTenantId
     *            the join tenant id
     * @param administrateWorkflowModelId
     *            the administrate workflow model id
     * @param creationDate
     *            the creation date
     * @param senderFirstName
     *            the sender first name
     * @param senderLastName
     *            the sender last name
     * @param receiverFirstName
     *            the receiver first name
     * @param receiverLastName
     *            the receiver last name
     * @param administratedWorkflowModelName
     *            the administrated workflow model name
     * @param participateWorfkwlowModelName
     *            the participate worfkwlow model name
     * @param joinTenantName
     *            the join tenant name
     * @param workflowModelOwningTenantName
     *            the workflow model owning tenant name
     * @param participateTenantName
     *            the participate tenant name
     */
    public InvitationView(long id, long senderId, long receiverId,
            Long participateInWorkflowInstanceId, Long joinTenantId,
            Long administrateWorkflowModelId, Date creationDate,
            String senderFirstName, String senderLastName,
            String receiverFirstName, String receiverLastName,
            String administratedWorkflowModelName,
            String participateWorfkwlowModelName, String joinTenantName,
            String workflowModelOwningTenantName, String participateTenantName) {
        // generated full constructor
        this.id = id;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.participateInWorkflowInstanceId = participateInWorkflowInstanceId;
        this.joinTenantId = joinTenantId;
        this.administrateWorkflowModelId = administrateWorkflowModelId;
        this.creationDate = creationDate;
        this.senderFirstName = senderFirstName;
        this.senderLastName = senderLastName;
        this.receiverFirstName = receiverFirstName;
        this.receiverLastName = receiverLastName;
        this.administratedWorkflowModelName = administratedWorkflowModelName;
        this.participateWorfkwlowModelName = participateWorfkwlowModelName;
        this.joinTenantName = joinTenantName;
        this.workflowModelOwningTenantName = workflowModelOwningTenantName;
        this.participateTenantName = participateTenantName;
    }

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public long getId() {
        return this.id;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the sender id.
     * 
     * @return the sender id
     */
    public long getSenderId() {
        return this.senderId;
    }

    /**
     * Sets the sender id.
     * 
     * @param senderId
     *            the new sender id
     */
    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    /**
     * Gets the receiver id.
     * 
     * @return the receiver id
     */
    public long getReceiverId() {
        return this.receiverId;
    }

    /**
     * Sets the receiver id.
     * 
     * @param receiverId
     *            the new receiver id
     */
    public void setReceiverId(long receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * Gets the participate in workflow instance id.
     * 
     * @return the participate in workflow instance id
     */
    public Long getParticipateInWorkflowInstanceId() {
        return this.participateInWorkflowInstanceId;
    }

    /**
     * Sets the participate in workflow instance id.
     * 
     * @param participateInWorkflowInstanceId
     *            the new participate in workflow instance id
     */
    public void setParticipateInWorkflowInstanceId(
            Long participateInWorkflowInstanceId) {
        this.participateInWorkflowInstanceId = participateInWorkflowInstanceId;
    }

    /**
     * Gets the join tenant id.
     * 
     * @return the join tenant id
     */
    public Long getJoinTenantId() {
        return this.joinTenantId;
    }

    /**
     * Sets the join tenant id.
     * 
     * @param joinTenantId
     *            the new join tenant id
     */
    public void setJoinTenantId(Long joinTenantId) {
        this.joinTenantId = joinTenantId;
    }

    /**
     * Gets the administrate workflow model id.
     * 
     * @return the administrate workflow model id
     */
    public Long getAdministrateWorkflowModelId() {
        return this.administrateWorkflowModelId;
    }

    /**
     * Sets the administrate workflow model id.
     * 
     * @param administrateWorkflowModelId
     *            the new administrate workflow model id
     */
    public void setAdministrateWorkflowModelId(Long administrateWorkflowModelId) {
        this.administrateWorkflowModelId = administrateWorkflowModelId;
    }

    /**
     * Gets the creation date.
     * 
     * @return the creation date
     */
    public Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * Sets the creation date.
     * 
     * @param creationDate
     *            the new creation date
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Gets the sender first name.
     * 
     * @return the sender first name
     */
    public String getSenderFirstName() {
        return this.senderFirstName;
    }

    /**
     * Sets the sender first name.
     * 
     * @param senderFirstName
     *            the new sender first name
     */
    public void setSenderFirstName(String senderFirstName) {
        this.senderFirstName = senderFirstName;
    }

    /**
     * Gets the sender last name.
     * 
     * @return the sender last name
     */
    public String getSenderLastName() {
        return this.senderLastName;
    }

    /**
     * Sets the sender last name.
     * 
     * @param senderLastName
     *            the new sender last name
     */
    public void setSenderLastName(String senderLastName) {
        this.senderLastName = senderLastName;
    }

    /**
     * Gets the receiver first name.
     * 
     * @return the receiver first name
     */
    public String getReceiverFirstName() {
        return this.receiverFirstName;
    }

    /**
     * Sets the receiver first name.
     * 
     * @param receiverFirstName
     *            the new receiver first name
     */
    public void setReceiverFirstName(String receiverFirstName) {
        this.receiverFirstName = receiverFirstName;
    }

    /**
     * Gets the receiver last name.
     * 
     * @return the receiver last name
     */
    public String getReceiverLastName() {
        return this.receiverLastName;
    }

    /**
     * Sets the receiver last name.
     * 
     * @param receiverLastName
     *            the new receiver last name
     */
    public void setReceiverLastName(String receiverLastName) {
        this.receiverLastName = receiverLastName;
    }

    /**
     * Gets the administrated workflow model name.
     * 
     * @return the administrated workflow model name
     */
    public String getAdministratedWorkflowModelName() {
        return this.administratedWorkflowModelName;
    }

    /**
     * Sets the administrated workflow model name.
     * 
     * @param administratedWorkflowModelName
     *            the new administrated workflow model name
     */
    public void setAdministratedWorkflowModelName(
            String administratedWorkflowModelName) {
        this.administratedWorkflowModelName = administratedWorkflowModelName;
    }

    /**
     * Gets the participate worfkwlow model name.
     * 
     * @return the participate worfkwlow model name
     */
    public String getParticipateWorfkwlowModelName() {
        return this.participateWorfkwlowModelName;
    }

    /**
     * Sets the participate worfkwlow model name.
     * 
     * @param participateWorfkwlowModelName
     *            the new participate worfkwlow model name
     */
    public void setParticipateWorfkwlowModelName(
            String participateWorfkwlowModelName) {
        this.participateWorfkwlowModelName = participateWorfkwlowModelName;
    }

    /**
     * Gets the join tenant name.
     * 
     * @return the join tenant name
     */
    public String getJoinTenantName() {
        return this.joinTenantName;
    }

    /**
     * Sets the join tenant name.
     * 
     * @param joinTenantName
     *            the new join tenant name
     */
    public void setJoinTenantName(String joinTenantName) {
        this.joinTenantName = joinTenantName;
    }

    /**
     * Gets the workflow model owning tenant name.
     * 
     * @return the workflow model owning tenant name
     */
    public String getWorkflowModelOwningTenantName() {
        return this.workflowModelOwningTenantName;
    }

    /**
     * Sets the workflow model owning tenant name.
     * 
     * @param workflowModelOwningTenantName
     *            the new workflow model owning tenant name
     */
    public void setWorkflowModelOwningTenantName(
            String workflowModelOwningTenantName) {
        this.workflowModelOwningTenantName = workflowModelOwningTenantName;
    }

    /**
     * Gets the participate tenant name.
     * 
     * @return the participate tenant name
     */
    public String getParticipateTenantName() {
        return this.participateTenantName;
    }

    /**
     * Sets the participate tenant name.
     * 
     * @param participateTenantName
     *            the new participate tenant name
     */
    public void setParticipateTenantName(String participateTenantName) {
        this.participateTenantName = participateTenantName;
    }

}
