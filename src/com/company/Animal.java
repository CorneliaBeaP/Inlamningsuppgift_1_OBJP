package com.company;

public abstract class Animal implements IFeed {

    private String name;
    //  weigth är i gram
    private int weight;

    public Animal() {
    }

    public Animal(String name, int weight) {
        setName(name);
        setWeight(weight);
    }

    // inkapsling
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
