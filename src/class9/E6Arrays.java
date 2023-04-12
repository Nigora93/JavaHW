package class9;

public class E6Arrays {
    public static void main(String[] args) {

        /*
        create an array store 10, 50, 60, 45, 100
        expected output: 50, 45
         */

        int [] num = {10, 50, 60, 45, 100};
        for (int i = 0; i < num.length; i++) {
            if(i%2!=0){
                System.out.println(num[i]);
            }
        }
    }
}
