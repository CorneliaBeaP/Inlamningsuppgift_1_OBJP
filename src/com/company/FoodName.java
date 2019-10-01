package com.company;

public enum FoodName {
    //    enums
    DOGFOOD("hundfoder"), CATFOOD("kattfoder"), SNAKEFOOD("ormpellets");

    public final String name;

    FoodName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
