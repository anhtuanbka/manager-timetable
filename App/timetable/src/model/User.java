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
public class User {
    private String ID;
    private String USERNAME;
    private String PASSWORD;
    private String ENAME;
    private int PHONE;
    private String ADDRESS;
    private boolean ADMIN;

    public User(String ID, String USERNAME, String PASSWORD, String ENAME, int PHONE, String ADDRESS, boolean ADMIN) {
        this.ID = ID;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.ENAME = ENAME;
        this.PHONE = PHONE;
        this.ADDRESS = ADDRESS;
        this.ADMIN = ADMIN;
    }

    public User() {
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public void setPHONE(int PHONE) {
        this.PHONE = PHONE;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public void setADMIN(boolean ADMIN) {
        this.ADMIN = ADMIN;
    }

    public String getID() {
        return ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getENAME() {
        return ENAME;
    }

    public int getPHONE() {
        return PHONE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public boolean isADMIN() {
        return ADMIN;
    }
    
}
