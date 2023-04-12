package class7;

public class E14WhileLoop {
    public static void main(String[] args) {
        //add all numbers from 1 to 10
        //write a loop that goes from 1 to 10;
        //create a variable that holds sum;
        int addNumber = 1;
        int sum = 0;
        while(addNumber <= 10){
            sum+=addNumber; //sum=sum+counter;
            addNumber++;
        }
        System.out.println(sum);
    }
}
