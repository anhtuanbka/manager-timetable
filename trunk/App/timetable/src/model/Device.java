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
public class Device {

    private String ROOM_ID;
    private int COMPUTERS;
    private int LAMPS;
    private int TABLES;
    private int CHAIRS;
    private int CELLING_FANS;
    private int PROJECTORS;

    public Device(String ROOM_ID, int COMPUTERS, int LAMPS, int TABLES, int CHAIRS, int CELLING_FANS, int PROJECTORS) {
        this.ROOM_ID = ROOM_ID;
        this.COMPUTERS = COMPUTERS;
        this.LAMPS = LAMPS;
        this.TABLES = TABLES;
        this.CHAIRS = CHAIRS;
        this.CELLING_FANS = CELLING_FANS;
        this.PROJECTORS = PROJECTORS;
    }

    public Device() {
    }

    public void setROOM_ID(String ROOM_ID) {
        this.ROOM_ID = ROOM_ID;
    }

    public void setCOMPUTERS(int COMPUTERS) {
        this.COMPUTERS = COMPUTERS;
    }

    public void setLAMPS(int LAMPS) {
        this.LAMPS = LAMPS;
    }

    public void setTABLES(int TABLES) {
        this.TABLES = TABLES;
    }

    public void setCHAIRS(int CHAIRS) {
        this.CHAIRS = CHAIRS;
    }

    public void setCELLING_FANS(int CELLING_FANS) {
        this.CELLING_FANS = CELLING_FANS;
    }

    public void setPROJECTORS(int PROJECTORS) {
        this.PROJECTORS = PROJECTORS;
    }

    public String getROOM_ID() {
        return ROOM_ID;
    }

    public int getCOMPUTERS() {
        return COMPUTERS;
    }

    public int getLAMPS() {
        return LAMPS;
    }

    public int getTABLES() {
        return TABLES;
    }

    public int getCHAIRS() {
        return CHAIRS;
    }

    public int getCELLING_FANS() {
        return CELLING_FANS;
    }

    public int getPROJECTORS() {
        return PROJECTORS;
    }

}
