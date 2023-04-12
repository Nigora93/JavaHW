package class7;

public class E13WhileLoop {
    public static void main(String[] args) {
        //print only odd numbers from 100 to 1

        int counter2 = 100;
        // counter2>=1 or <=100
        while (counter2 <= 100) {
            //odd numbers when divided by 2 gives 1 remainder;
            if (counter2 % 2 == 1) { //or counter2 %2!=0;
                System.out.print(counter2 + " ");
            }
            counter2 --;
        }
    }
}
