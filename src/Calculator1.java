

import java.util.Scanner;

public class Calculator1 {



    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Wwllcome to Raj Calculator");
        System.out.println("Pleass enter your first value");
        double A=Input.nextDouble();
        System.out.println("Pleass enter your second value");
        double B=Input.nextDouble();


        Input.close();
        double Addition = A+B;
        double Subtraction=A-B;
        double Multiplication=A*B;
        double Divition=A/B;




        System.out.println(".........................");
        System.out.println("Reasult ara as follows");

        System.out.println("Addition ="+Addition );
        System.out.println("Subtrstion ="+ Subtraction);
        System.out.println("Multiplication ="+ Multiplication);
        System.out.println("Divition ="+ Divition);





    }





}
