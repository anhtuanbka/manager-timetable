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
    private int deviceID;
    private String deviceName;
    private String description;

    public Device() {
    }

    public Device(String deviceName, String description) {
        this.deviceName = deviceName;
        this.description = description;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Device{" + "deviceName=" + deviceName + '}';
    }
    
    
}
