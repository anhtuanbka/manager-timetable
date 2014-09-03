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
public class RoomType {
    private String TYPE_ID;
    private String TYPE_NAME;

    public RoomType() {
    }

    public RoomType(String TYPE_ID, String TYPE_NAME) {
        this.TYPE_ID = TYPE_ID;
        this.TYPE_NAME = TYPE_NAME;
    }

    public void setTYPE_ID(String TYPE_ID) {
        this.TYPE_ID = TYPE_ID;
    }

    public void setTYPE_NAME(String TYPE_NAME) {
        this.TYPE_NAME = TYPE_NAME;
    }

    public String getTYPE_ID() {
        return TYPE_ID;
    }

    public String getTYPE_NAME() {
        return TYPE_NAME;
    }
    
}
