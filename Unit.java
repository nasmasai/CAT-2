package com.practicalcat.demo;

public class Unit {
    private Long id;
    private String name;




    public Unit(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Units{"+ "id=" + id +",name =  " + name + '}';
    }
}

