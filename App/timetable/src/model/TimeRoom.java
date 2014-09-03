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
public class TimeRoom {
    private int TIME_ID;
    private String ROOM_ID;
    private int DAY;
    private int LESSION_START;
    private int LESSION_END;

    public TimeRoom() {
    }

    public TimeRoom(int TIME_ID, String ROOM_ID, int DAY, int LESSION_START, int LESSION_END) {
        this.TIME_ID = TIME_ID;
        this.ROOM_ID = ROOM_ID;
        this.DAY = DAY;
        this.LESSION_START = LESSION_START;
        this.LESSION_END = LESSION_END;
    }

    public void setTIME_ID(int TIME_ID) {
        this.TIME_ID = TIME_ID;
    }

    public void setROOM_ID(String ROOM_ID) {
        this.ROOM_ID = ROOM_ID;
    }

    public void setDAY(int DAY) {
        this.DAY = DAY;
    }

    public void setLESSION_START(int LESSION_START) {
        this.LESSION_START = LESSION_START;
    }

    public void setLESSION_END(int LESSION_END) {
        this.LESSION_END = LESSION_END;
    }

    public int getTIME_ID() {
        return TIME_ID;
    }

    public String getROOM_ID() {
        return ROOM_ID;
    }

    public int getDAY() {
        return DAY;
    }

    public int getLESSION_START() {
        return LESSION_START;
    }

    public int getLESSION_END() {
        return LESSION_END;
    }
    
    
}
