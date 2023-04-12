package class9;

public class E5Arrays {
    public static void main(String[] args) {
        //1.write a loop that starts from 0 and goes till the number 5 and prints even numbers
        //2.create an array of chars, print chars even indexes;

        //1.1
        int [] numbers={0, 1, 2, 3, 4, 5};
        for (int i = 0; i <5 ; i+=2) {
            System.out.println(i);
        }

        //1.2(nd method)
        for (int k = 0; k < 5; k++) {
            if(k%2==0){
                System.out.println(k);
            }
        }

        //2.1
        char [] letters = {'A', 'B', 'C', 'D', 'E'};
        for (int j = 0; j < 5; j++) {
            if(j%2==0){
                System.out.println(letters[j]);
            }
        }
    }
}
