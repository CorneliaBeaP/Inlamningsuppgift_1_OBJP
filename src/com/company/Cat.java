package com.company;

import javax.swing.*;

public class Cat extends Animal {

    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int calculateFoodAmount() {
        // Katter: Kattens vikt (i gram) / 150 = vikten på en portion kattfoder (i gram)
        int foodAmount;
        foodAmount = this.getWeight() / 150;
        return foodAmount;
    }

    @Override
    public void printFoodInformation() {
        JOptionPane.showMessageDialog(null, "Ge " + getName() + " " + calculateFoodAmount() + " gram " + FoodName.CATFOOD.getName() + ".");
    }
}
