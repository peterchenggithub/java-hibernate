package com.peter.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Car implements Serializable {

    private static final long serialVersionUID = 81827892017624045L;

    @Id
    @Column(name = "CARID")
    private int id;

    @Column(name = "CARMODEL")
    private String model;

    @Column(name = "CARCOLOR")
    private String color;

    private String manufactureYear;

    private int door_height;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getDoor_height() {
        return door_height;
    }

    public void setDoor_height(int door_height) {
        this.door_height = door_height;
    }
}
