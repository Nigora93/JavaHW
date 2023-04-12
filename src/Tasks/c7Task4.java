package Tasks;

public class c7Task4 {
    public static void main(String[] args) {
        //4.print odd numbers between 20 and 50(2 ways);

        //1st method
        for (int i = 21; i <=50 ; i+=2) {
            System.out.println(i);
        }

        //2nd method
        int j = 21;
        do{
            System.out.println(j);
            j+=2;
        }while(j<50);
    }
}
