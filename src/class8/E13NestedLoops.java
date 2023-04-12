package class8;

public class E13NestedLoops {
    public static void main(String[] args) {
//        1 2 3 4 5
        //2 3 4 5 6
        //3 4 5 6 7

        //1st method
        for (int j = 0; j < 3; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

        //2nd method
//        for (int i = 1; i < 6; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 1; i < 6; i++) {
//            System.out.print(i + 1 + " ");
//        }
//        System.out.println();
//        for (int i = 1; i < 6; i++) {
//            System.out.print(i + 2 + " ");
//        }
    }
}
