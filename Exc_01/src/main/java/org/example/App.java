package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Kevin Kant
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is your name? ");
        Greeting greeter = new Greeting(reader.nextLine());

        System.out.println(greeter.makeGreeting());

    }
}
