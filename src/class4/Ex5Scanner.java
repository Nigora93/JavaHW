package class4;

import java.util.Scanner;

public class Ex5Scanner {
    public static void main(String[] args) {

        //Scanner is a class which knows how to take input from the keyboard;
        //scan is a variable (like a String);
        //new is a keyword, creates the object of a class;
        //Scanner goes with ();
        //System.in means we want to use scanner class;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        //next helps take a String from the user;
        String name=scan.next();
        System.out.println("You are amazing "+name);
    }
}
