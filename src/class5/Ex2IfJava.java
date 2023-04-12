package class5;

import java.util.Scanner;

public class Ex2IfJava {
    public static void main(String[] args) {
        //Below code helps us get any type f data from the console
        Scanner input = new Scanner(System.in);
        //print the text inside the "" inside the console
        System.out.println("Is it time to break: true/false");
        // boolean isBreak => creating a variable and naming it isBreak
        //input = > a variable of scanner
        //nextBoolean() => method that helps us take boolean type data from the keyboard
        boolean isBreak = input.nextBoolean();
        if(isBreak){
            System.out.println("Let's have a break");
        } else{
            System.out.println("Let's continue the class");
        }

    }
}
