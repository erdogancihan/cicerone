package com.cicerone.application;

import org.springframework.stereotype.Component;

@Component
public class Translator {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Translator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public void show(){
        System.out.println("tranlator show");
    }
}
