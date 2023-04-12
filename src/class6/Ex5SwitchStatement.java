package class6;

public class Ex5SwitchStatement {
    public static void main(String[] args) {

        char gender = 'F';

        //switch doesn't work with float, double, long, boolean;
        //it only checks required line in debug;
        //can not use relational operators, like less than, greater than and logical, !, &&, ||;
        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case '0':
                System.out.println("others");
                break;
            default:
                System.out.println("char is not supported");
        }
    }
}
