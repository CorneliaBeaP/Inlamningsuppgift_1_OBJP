package com.company;

import javax.swing.*;

public class Dog extends Animal {

    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int calculateFoodAmount() {
        // Hundar: Hundens vikt (i gram) / 100 = vikten på en portion hundfoder (i gram)
        int foodAmount;
        foodAmount = this.getWeight() / 100;
        return foodAmount;
    }

    @Override
    public void printFoodInformation() {
        JOptionPane.showMessageDialog(null, "Ge " + getName() + " " + calculateFoodAmount() + " gram " + FoodName.DOGFOOD.getName() + ".");
    }
}
