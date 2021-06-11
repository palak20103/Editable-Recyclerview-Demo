package com.example.student;

import java.io.Serializable;

public class model implements Serializable {
    String name,e,d;
    int roll;
    public model(String name, int roll, String e,String d) {
        this.name=name;
        this.roll=roll;
        this.e=e;
        this.d=d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }
    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }
}
