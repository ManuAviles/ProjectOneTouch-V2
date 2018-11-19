package com.iesemilidarder.maviles.core.data;

public class MyBean {

    // Atributos

    private String name;
    private String description;
    private String date;
    private Double price;


    // Constructor

    public  MyBean(String name, String description, String date, Double price){

        this.name = name;
        this.description = description;
        this.date = date;
        this.price = price;
    }

    public MyBean() {

    }


    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
