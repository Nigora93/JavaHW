package class9;

public class E8Arrays {
    public static void main(String[] args) {

        //print all the numbers from 6 to 0
        // a b c d e f > reverse them

        char [] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = 5; i >=0 ; i--) { //or int i = chars.length-1
            System.out.println(i + " " + chars[i]);
        }
    }
}
