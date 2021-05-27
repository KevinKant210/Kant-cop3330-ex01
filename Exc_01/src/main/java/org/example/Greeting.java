package org.example;

public class Greeting {
    public String username;
    private String greetstart = "Hello, ";
    private String greetend = ", nice to meet you!";
    public Greeting(String userinput){
        username = userinput;
    }

    public String makeGreeting(){
       return greetstart.concat(username).concat(greetend);


    }
}

