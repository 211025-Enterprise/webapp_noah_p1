package com.webapp.models;

import com.wpax.annotation.P_Key;

public class Cat {

    @P_Key
    public long id;
    public String name;
    public String color;

    public Cat(long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Cat() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return color;
    }

    public void setAge(String color) {
        this.color = color;
    }

}
