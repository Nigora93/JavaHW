package class8;

public class E12NestedLoops {
    public static void main(String[] args) {
        //for loop:
        //2 4 6 8 10
        //2 4 6 8 10
        //2 4 6 8 10
        //2 4 6 8 10
        for (int i = 0; i < 5; i++) {
            for (int j = 2; j <= 10; j+=2) {
                System.out.print(j +" " );
            }
            System.out.println();
        }
    }
}
