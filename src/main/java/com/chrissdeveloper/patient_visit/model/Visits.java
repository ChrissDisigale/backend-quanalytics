package com.chrissdeveloper.patient_visit.model;

import jakarta.persistence.*;

@Entity
@Table(name = "visits")
public class Visits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "date")
    private String date;
    @Column(name = "height")
    private String height;
    @Column(name = "weight")
    private String weight;
    @Column(name = "bmi")
    private String bmi;
    @Column(name = "generalHealth")
    private String generalHealth;
    @Column(name = "looseWeight")
    private String looseWeight;
    @Column(name = "takeDrugs")
    private String takeDrugs;
    @Column(name = "comment")
    private String comment;

    @Column(name = "patientId")
    private int patientId;

    public Visits() {
    }

    public Visits(long id, String date, String height, String weight, String bmi, String generalHealth, String looseWeight, String takeDrugs, String comment, int patientId) {
        this.id = id;
        this.date = date;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;
        this.generalHealth = generalHealth;
        this.looseWeight = looseWeight;
        this.takeDrugs = takeDrugs;
        this.comment = comment;
        this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getGeneralHealth() {
        return generalHealth;
    }

    public void setGeneralHealth(String generalHealth) {
        this.generalHealth = generalHealth;
    }

    public String getLooseWeight() {
        return looseWeight;
    }

    public void setLooseWeight(String looseWeight) {
        this.looseWeight = looseWeight;
    }

    public String getTakeDrugs() {
        return takeDrugs;
    }

    public void setTakeDrugs(String takeDrugs) {
        this.takeDrugs = takeDrugs;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
