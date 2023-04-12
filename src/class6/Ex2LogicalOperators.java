package class6;

public class Ex2LogicalOperators {

    public static void main(String[] args) {

       double marksInMath = 92;
       double marksInScience = 95;
//everything has to be true with && to display true in console
       if(marksInMath>90 && marksInScience>90){
           System.out.println("You are a brilliant student");
       }else{
           System.out.println("You need to work hard");
       }
    }
}
