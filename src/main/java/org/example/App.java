package org.example;
import java.util.Scanner;

/**
 * Printing Quotes
 * UCF cop3330 Fall 2021 Assignment 3 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan =  new Scanner(System.in);

        System.out.println("What is the quote? ");
        String quote = scan.nextLine();

        System.out.println("Who said it?" );
        String person = scan.nextLine();

        System.out.println(person + " says, " + "\"" + quote + "\"");
    }
}
