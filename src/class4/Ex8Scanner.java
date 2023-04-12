package class4;

import java.util.Scanner;

public class Ex8Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary = scanner.nextInt();
        if(salary>10000){
            System.out.println("You are rich");
        }else{
            System.out.println("Look for better opportunities");
        }

    }
}
