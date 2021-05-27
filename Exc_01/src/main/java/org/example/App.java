package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
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
