package class4;

import java.util.Scanner;

public class Ex10Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender=scanner.next().charAt(2);
        System.out.println("you entered "+gender);
    }
}
