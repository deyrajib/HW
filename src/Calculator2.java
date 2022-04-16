import java.util.Scanner;

public class Calculator2 {



    public static void main(String[] args) {

        char operator;
        double num1,num2;

        Scanner in =new Scanner(System.in);

        System.out.println("Welcome to  Raj Calculator");
        System.out.println("............................");
        System.out.println("Enter the Operator ( + , -' *, /, )");
        operator =	in.next().charAt(0);


        System.out.println("Enter the number one by one");
        num1=in.nextDouble();
        num2=in.nextDouble();


        in.close();

        //..................................
        switch ( operator ) {
            case '+':
                System.out.printf(  "%.2f  +  %.2f = %.2f", num1,num2,(num1+num2)); break;



            case '-':
                System.out.printf(   "%.2f -  %.2f = %.2f", num1,num2,(num1-num2)); break;


            case '*':
                System.out.printf(   "%.2f * %.2f = %.2f", num1,num2,(num1*num2)); break;

            case '/':
                if (num2 !=0)
                    System.out.printf("%.2f /  %.2f = %.2f", num1,num2,(num1/num2)  );
                else
                    System.out.println(" Divide By Zero Sitation");break;


            default:
                System.out.printf("%c is an invalid operator",operator );

                //+	System.out.println();

        }
    }

}






