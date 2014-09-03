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
public class Subject {

    private String SUBJECT_ID;
    private String SUBJECT_NAME;
    private String MASTER_SUBJECT;

    public Subject(String SUBJECT_ID, String SUBJECT_NAME, String MASTER_SUBJECT) {
        this.SUBJECT_ID = SUBJECT_ID;
        this.SUBJECT_NAME = SUBJECT_NAME;
        this.MASTER_SUBJECT = MASTER_SUBJECT;
    }

    public Subject() {
    }

    public void setSUBJECT_ID(String SUBJECT_ID) {
        this.SUBJECT_ID = SUBJECT_ID;
    }

    public void setSUBJECT_NAME(String SUBJECT_NAME) {
        this.SUBJECT_NAME = SUBJECT_NAME;
    }

    public void setMASTER_SUBJECT(String MASTER_SUBJECT) {
        this.MASTER_SUBJECT = MASTER_SUBJECT;
    }

    public String getSUBJECT_ID() {
        return SUBJECT_ID;
    }

    public String getSUBJECT_NAME() {
        return SUBJECT_NAME;
    }

    public String getMASTER_SUBJECT() {
        return MASTER_SUBJECT;
    }

}
