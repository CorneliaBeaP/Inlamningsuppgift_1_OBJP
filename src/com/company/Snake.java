package com.company;

import javax.swing.*;

public class Snake extends Animal {

    public Snake(String name, int weight) {
        super(name, weight);
    }

    @Override
    public int calculateFoodAmount() {
        // Ormar ska alltid ha 20 ormpellets oavsett vikt
        int foodAmount = 20;
        return foodAmount;
    }

    @Override
    public void printFoodInformation() {
        JOptionPane.showMessageDialog(null, "Ge " + this.getName() + " " + calculateFoodAmount() + " " + FoodName.SNAKEFOOD.getName() + ".");
    }
}
