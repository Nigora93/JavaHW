package class6;

public class Ex1LogicalOperators {

    public static void main(String[] args) {

        boolean chocolate = true;
        boolean flowers = false;
        if(chocolate || flowers){
            System.out.println("I am happy");
        }else{
            System.out.println("I am sad");
        }

        boolean fiveG = false;
        boolean wifi = false;
        if(wifi || fiveG){
            System.out.println("You can browse");
        }else{
            System.out.println("not connected");
        }

    }
}
