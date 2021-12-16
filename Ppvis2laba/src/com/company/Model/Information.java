package com.company.Model;

public class Information {
    String doctor;
    String patient;
    String reception;
    String schedule;
    String analyze;

    public Information(String doctor, String patient, String reception,String schedule,String analyze) {
        this.doctor = doctor;
        this.patient = patient;
        this.reception = reception;
        this.schedule = schedule;
        this.analyze = analyze;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public void setReception(String reception) {
        this.reception = reception;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setAnalyze(String analyze) {
        this.analyze = analyze;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getPatient() {
        return patient;
    }

    public String getReception() {
        return reception;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getAnalyze() {
        return analyze;
    }
}
