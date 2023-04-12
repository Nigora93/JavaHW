package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        //1.to print all whole numbers from 15 to 30 || from start to an end;

//        int start = 15;
//        int end = 30;
//        int number = start;
//        while (number <= end) {
//            System.out.print(number + " ");
//            number++;
//        }

        //2.ask the user for starting and ending number and the step;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the starting and the ending point and the step");
//        int start=scanner.nextInt();
//        int end = scanner.nextInt();
//        int step = scanner.nextInt();
//
//        int counter = start;
//        while(counter<=end){
//            System.out.print(counter + " ");
//            counter=counter+step; //number+=step
//        }

        //3.ask the user for starting and ending number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting and the ending point and the step");
        int start=scanner.nextInt();
        int end = scanner.nextInt();


        int counter = start;
        while(counter<=end){
            System.out.print(counter + " ");
            counter++;
        }
    }
}
