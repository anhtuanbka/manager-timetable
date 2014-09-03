/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author VuDucCanh
 */
public class Room {
    private String ROOM_ID;
    private String TYPE_ID;
    private boolean STATUS;

    public Room() {
    }

    public Room(String ROOM_ID, String TYPE_ID, boolean STATUS) {
        this.ROOM_ID = ROOM_ID;
        this.TYPE_ID = TYPE_ID;
        this.STATUS = STATUS;
    }

    public void setROOM_ID(String ROOM_ID) {
        this.ROOM_ID = ROOM_ID;
    }

    public void setTYPE_ID(String TYPE_ID) {
        this.TYPE_ID = TYPE_ID;
    }

    public void setSTATUS(boolean STATUS) {
        this.STATUS = STATUS;
    }

    public String getROOM_ID() {
        return ROOM_ID;
    }

    public String getTYPE_ID() {
        return TYPE_ID;
    }

    public boolean isSTATUS() {
        return STATUS;
    }
    
    
}
