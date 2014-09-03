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
public class TimeTable {
    private int TIME_ID;
    private String SUBJECT_ID;
    private String SUBJECT_NAME;
    private int MAX_STUDENT;
    private int REGISTED;

    public TimeTable() {
    }

    public TimeTable(int TIME_ID, String SUBJECT_ID, String SUBJECT_NAME, int MAX_STUDENT, int REGISTED) {
        this.TIME_ID = TIME_ID;
        this.SUBJECT_ID = SUBJECT_ID;
        this.SUBJECT_NAME = SUBJECT_NAME;
        this.MAX_STUDENT = MAX_STUDENT;
        this.REGISTED = REGISTED;
    }

    public void setTIME_ID(int TIME_ID) {
        this.TIME_ID = TIME_ID;
    }

    public void setSUBJECT_ID(String SUBJECT_ID) {
        this.SUBJECT_ID = SUBJECT_ID;
    }

    public void setSUBJECT_NAME(String SUBJECT_NAME) {
        this.SUBJECT_NAME = SUBJECT_NAME;
    }

    public void setMAX_STUDENT(int MAX_STUDENT) {
        this.MAX_STUDENT = MAX_STUDENT;
    }

    public void setREGISTED(int REGISTED) {
        this.REGISTED = REGISTED;
    }

    public int getTIME_ID() {
        return TIME_ID;
    }

    public String getSUBJECT_ID() {
        return SUBJECT_ID;
    }

    public String getSUBJECT_NAME() {
        return SUBJECT_NAME;
    }

    public int getMAX_STUDENT() {
        return MAX_STUDENT;
    }

    public int getREGISTED() {
        return REGISTED;
    }
    
    
}
