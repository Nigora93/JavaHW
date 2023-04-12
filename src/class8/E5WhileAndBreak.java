package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        //create a boolean variable summer store true in it then write a loop
        //that runs as long as it is summer create a temp variable store 85
        //inside the loop check the temp if it is less than 100, print 'It's good I enjoy summer', if it is more than 100 'it is vey hot'

        boolean summer = true;
        int temperature = 85;
        while(summer){
            if(temperature<100){
                System.out.println("It is good I enjoy summer");
//                break;
            } else {
                System.out.println("It is very hot");
                break;
            }
            temperature=temperature+3;
        }
    }
}
