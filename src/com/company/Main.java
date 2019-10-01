package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Animal sixten = new Dog("Sixten", 5000);
        Animal dogge = new Dog("Dogge", 10000);
        Animal venus = new Cat("Venus", 5000);
        Animal ove = new Cat("Ove", 3000);
        Animal hypno = new Snake("Hypno", 1000);

        while (true) {
            String nameOfAnimal = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");

            if (nameOfAnimal == null) {
                System.exit(0);
            } else if (nameOfAnimal.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Inget namn inskrivet. Vänligen testa igen.");
            } else {

                nameOfAnimal = nameOfAnimal.toLowerCase().trim();

//                polymorfism, rätt metod anropas beroende på om det är en hund, katt eller orm
                if (nameOfAnimal.equals("sixten"))
                    sixten.printFoodInformation();
                else if (nameOfAnimal.equals("dogge"))
                    dogge.printFoodInformation();
                else if (nameOfAnimal.equals("venus"))
                    venus.printFoodInformation();
                else if (nameOfAnimal.equals("ove"))
                    ove.printFoodInformation();
                else if (nameOfAnimal.equals("hypno"))
                    hypno.printFoodInformation();
                else
                    JOptionPane.showMessageDialog(null, "Inget djur med namnet " + nameOfAnimal +
                            " finns idag registrerat hos HealthyPets. Vänligen testa med " +
                            "ett annat namn.");
            }
        }
    }
}
