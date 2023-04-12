package class4;

import java.util.Scanner;

public class Ex9Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you hungry, enter True/False");
        boolean hungry = scanner.nextBoolean();
        if(hungry){
            System.out.println("Let's order pizza");
        }else{
            System.out.println("Let's practice Java");
        }

    }
}
