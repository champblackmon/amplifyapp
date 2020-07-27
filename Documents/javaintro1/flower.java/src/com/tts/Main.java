package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner userInput = new Scanner(System.in);
	System.out.println("Whats your name?");
	String yourName = userInput.nextLine();//
    System.out.println("What's your favorite flower?");
    String pluralNoun1 = userInput.nextLine();//
	System.out.println("write your second favorite flower");
	String pluralNoun2= userInput.nextLine();//
    System.out.println("How would you describe your favorite flower in one word");
    String adjective1= userInput.nextLine();//
    System.out.println("and how about your second favorite");
    String adjective2 = userInput.nextLine();

    System.out.println("Dear "+ yourName +",");
    System.out.println(pluralNoun1 +"s are red ");
    System.out.println(pluralNoun2 +"s are blue ");
    System.out.println("you love " + adjective1 +" "+ pluralNoun1+ "s,");
    System.out.println("and I love " + adjective2 +" "+ pluralNoun2 + "s");

    }
}
