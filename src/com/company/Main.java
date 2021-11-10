package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] randomColourList = new int[10];
        String[] colourList = {"red","blue","green"};

        for(int i = 0; i < 10; i++){
            String currentColour = colourList[random.nextInt(3)];
            System.out.println("Guess the colour: ");
            String usersAnswer = input.next();
            if (usersAnswer.equals(currentColour)){
                System.out.println("correct, +1 point");
            }
            else{
                System.out.println("Wrong");
                System.out.println(colourList[random.nextInt(3)] + " was the colour");
            }
        }
    }
}
