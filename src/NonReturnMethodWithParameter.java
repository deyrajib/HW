import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

public class NonReturnMethodWithParameter {

    public void Dosum(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total = " + total);
    }

    public void doSubtraction(double price1, double price2) {
        double Total = price1 - price2;
        System.out.println("TotalPrice=" + Total);
    }

    public void doMultiplication(float num1, float num2) {

        float total = num1 * num2;
        System.out.println("total =" + total);

    }
    public void doDivision( float number ,float number1) {

        float total = number / number1;
        System.out.println("Total =" + total);

    }




        public static void main (String[]args){
//1
            NonReturnMethodWithParameter NonReturnMethodWithParameter = new NonReturnMethodWithParameter();
            NonReturnMethodWithParameter.Dosum(50, 40);
            NonReturnMethodWithParameter.Dosum(50, 50);
//2
            NonReturnMethodWithParameter NonReturnMethodWithParameter2 = new NonReturnMethodWithParameter();
            NonReturnMethodWithParameter2.doSubtraction(150, 100);
//3
            NonReturnMethodWithParameter NonReturnMethodWithParameter3 = new NonReturnMethodWithParameter();
            NonReturnMethodWithParameter3.doMultiplication(50,40);

            NonReturnMethodWithParameter NonReturnMethodWithParameter4 = new NonReturnMethodWithParameter();
            NonReturnMethodWithParameter4.doDivision(100,2);
        }


}
