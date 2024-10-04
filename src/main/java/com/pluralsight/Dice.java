package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        //dice is the object, roll is the random number from 1-6
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < 100; i++) {
            int roll = (int)(Math.random() * range  ) + min;
            System.out.println(roll);
        }
        int dice = new Dice;
        int roll1 = dice.roll(); //Roll a pair of dice 20 times, displaying the value of the two dice
        int roll2 = dice.roll(); //Count how many time 2, 4, 6, and 7 are rolled and display the result
        /*
        We are rolling two dice. Meaning we are executing the loop twice. Dice = (roll loop called)
        int two = count(2);
        int four = count(4);
        int six = count(6);
        int seven = count(7);
        //loop here

        roll1 = dice.roll();
        roll2 = dice.roll();

         */
    }
}
