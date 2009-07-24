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

package de.decidr.modelingtool.client.ui;

import java.util.Collection;
import java.util.HashSet;

import com.allen_sauer.gwt.dnd.client.drop.DropController;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Widget;

import de.decidr.modelingtool.client.command.CommandList;
import de.decidr.modelingtool.client.command.RemoveConnectionCommand;
import de.decidr.modelingtool.client.command.UndoableCommand;
import de.decidr.modelingtool.client.ui.dnd.PortDropController;
import de.decidr.modelingtool.client.ui.selection.ConnectionDragBox;

/**
 * The super class of all ports.
 * 
 * @author Johannes Engelhardt
 */
public abstract class Port extends AbsolutePanel {

    /**
     * Indicates where the port is located on its parent node. TOP, BOTTOM,
     * LEFT and RIGHT indicate that the port is located at the according border
     * of the node. ABSOLUTE indicated that the port is located in an absolute
     * position on the node, offset origin is the upper left corner of the node.
     */
    public static enum Position {
        TOP, BOTTOM, LEFT, RIGHT, ABSOLUTE
    };

    /** The position of the port. */
    private Position position;
    
    /**
     * The x offset of the port in pixels. This value is added to the position
     * specified by the position attribute.
     */
    private int xOffset = 0;
    
    /**
     * The y offset of the port in pixels. This value is added to the position
     * specified by the position attribute.
     */
    private int yOffset = 0;

    /**
     * Flag, indicates if the port may be connected to multiple connections at
     * the same time or not. Default is false.
     */
    private boolean multipleConnectionsAllowed = false;

    /**  The node the port is assigned to. */
    private Node parentNode = null;

    /** The drop controller of the port. */
    private DropController dropController = new PortDropController(this);
    
    /** Indicates id a drop controller is registeres to the port. */
    protected boolean dropControllerRegistered = false;

    /**
     * The collection of the glued drag boxes currently glued to the port. If
     * multipleConnectionsAllowed = false, this collection has at most one item.
     */
    private Collection<ConnectionDragBox> gluedDragBoxes = new HashSet<ConnectionDragBox>();

    /** Indicates if a drop controller is registered or not.
    protected boolean dropControllerRegistered = false;

    /**
     * Dummy drag box for drawing a new connection. Has to be made draggable by
     * subclasses.
     */
    protected ConnectionDragBox singleDragBox;

    /**
     * Constructor.
     *
     * @param position The position of the port in the node
     */
    public Port(Position position) {
        this(position, 0, 0);
    }

    /**
     * Constructor.
     *
     * @param position The position of the port in the node
     * @param xOffset x direction offset in pixels
     * @param yOffset y direction offset in pixels
     */
    public Port(Position position, int xOffset, int yOffset) {
        this.position = position;
        this.xOffset = xOffset;
        this.yOffset = yOffset;

        // create connection drag box
        createSingleDragBox();
    }

    @Override
    public void add(Widget w) {
        super.add(w);
        setWidgetPosition(w, 0, 0);
        
        if (w instanceof ConnectionDragBox && w != singleDragBox) {
            gluedDragBoxes.add((ConnectionDragBox) w);
        }
    }
    
    /**
     * Adds a dragbox to the port. The drag box has to be part of a connection.
     * 
     * @param dragBox The dragbox to be added.
     */
    public void addConnectionDragBox(ConnectionDragBox dragBox) {
        assert dragBox.getConnection() != null;

        if (!multipleConnectionsAllowed) {
            //assert gluedDragBoxes.isEmpty();
            removeSingleDragBox();
        }

        add(dragBox);
    }

    /**
     * Creates a new single drag box, if the old one was used for drawing a
     * connection.
     */
    protected void createSingleDragBox() {
        // create drag box if drag box is not connected to a connection or not
        // present
        if (!(singleDragBox != null && singleDragBox.getConnection() == null)) {
            singleDragBox = new ConnectionDragBox(this);

            add(singleDragBox);
            //setWidgetPosition(singleDragBox, 0, 0);

            singleDragBox.setVisibleStyle(false);
            singleDragBox.makeDraggable();
        }
    }

    public DropController getDropController() {
        return dropController;
    }

    public Collection<ConnectionDragBox> getGluedDragBoxes() {
        return gluedDragBoxes;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public Position getPosition() {
        return position;
    }

    /**
     * Creates and returns a command which removes all connections connected to
     * this port.
     */
    public UndoableCommand getRemoveConnectionsCommand() {
        CommandList cmdList = new CommandList();

        for (ConnectionDragBox dragBox : gluedDragBoxes) {
            // check if drag box is not the drag box with out connection
            if (dragBox.getConnection() != null) {
                cmdList.addCommand(new RemoveConnectionCommand(dragBox
                        .getConnection()));
            }
        }

        return cmdList;
    }

    public int getXOffset() {
        return xOffset;
    }

    public int getYOffset() {
        return yOffset;
    }

    /**
     * Indicated if this port is a container port (instance of ContainerExitPort
     * or ContainerStartPort) or not. Has to be implemented by subclasses.
     *
     * @return True, if this port is a container port.
     */
    public abstract boolean isContainerPort();

    public boolean isDropControllerRegistered() {
        return dropControllerRegistered;
    }

    public boolean isMultipleConnectionsAllowed() {
        return multipleConnectionsAllowed;
    }

    /**
     * Redraws all connections connected to this port.
     */
    public void refreshConnections() {
        for (ConnectionDragBox dragBox : gluedDragBoxes) {
            if (dragBox.getConnection() != null) {
                dragBox.getConnection().draw();
            }
        }
    }

    /**
     * Registers the drop controller of this port to its according drag
     * controller. Has to be implemented by subclasses.
     */
    public abstract void registerDropController();

    @Override
    public boolean remove(Widget w) {
        boolean value = super.remove(w);

        if (w instanceof ConnectionDragBox) {
            ConnectionDragBox dragBox = (ConnectionDragBox) w;
            
            if (dragBox == singleDragBox) {
                singleDragBox = null;
            } else {
                // remove from glued dag boxes, if present
                gluedDragBoxes.remove(dragBox);
            }

            if (multipleConnectionsAllowed) {
                if (singleDragBox == null) {
                    createSingleDragBox();
                }
            } else {
                if (singleDragBox == null && gluedDragBoxes.isEmpty()) {
                    createSingleDragBox();
                }
            }

        }

        return value;
    }

    /**
     * Removes the single drag box from the port, if present.
     */
    protected void removeSingleDragBox() {
        if (singleDragBox != null && singleDragBox.getConnection() == null) {
            super.remove(singleDragBox);
            singleDragBox = null;
        }
    }

    public void setMultipleConnectionsAllowed(boolean mcAllowed) {
        this.multipleConnectionsAllowed = mcAllowed;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    public void setXOffset(int offset) {
        xOffset = offset;
    }

    public void setYOffset(int offset) {
        yOffset = offset;
    }

    /**
     * Unegisters the drop controller of this port from its according drag
     * controller. Has to be implemented by subclasses.
     */
    public abstract void unregisterDropController();

}
