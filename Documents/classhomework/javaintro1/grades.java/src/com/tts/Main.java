package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);
            
            System.out.println("Hello user, I will be asking for your test grade shortly");
            String response = userInput.nextLine();//
            System.out.println("Please insert your test grade below");
            String score = userInput.nextLine();//
            System.out.println("What is the letter of your grade?");
            String letter = userInput.nextLine();//
            System.out.println("Was the test challenging ?");
            String response2 = userInput.nextLine();//


            System.out.println("You scored a "+ score);
            System.out.println("This is your letter grade for the test = "+ letter);
            System.out.println(" it took maximum effort");



        }
    }
