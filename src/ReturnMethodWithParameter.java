public class ReturnMethodWithParameter {


    public int Dosum(int number, int number1) {
        int total = number + number1;
        System.out.println("Total=" + total);
        return total;

    }

    public double doSubtraction(double num, double num1) {
        double total = num - num1;
        System.out.println("Total Subtraction=" + total);

        return total;
    }


    public double DoMultiplication (double numb, double numb1) {
        double total = numb * numb1;
        System.out.println("Total Multiplication=" + total);

        return total;
    }


    public double DoDivision (double numb1, double numb2) {
        double total = numb1 / numb1;
        System.out.println("Total Division=" + total);

        return total;
    }








    public static void main(String[] args) {

        ReturnMethodWithParameter ReturnMethodWithParameter = new ReturnMethodWithParameter();
        ReturnMethodWithParameter.Dosum(20, 40);


        ReturnMethodWithParameter ReturnMethodWithParameter1 = new ReturnMethodWithParameter();
        ReturnMethodWithParameter1.doSubtraction(100, 45);


        ReturnMethodWithParameter ReturnMethodWithParameter2 =new ReturnMethodWithParameter();
        ReturnMethodWithParameter2.DoMultiplication(100,500);

        ReturnMethodWithParameter ReturnMethodWithParameter3=new  ReturnMethodWithParameter ();
        ReturnMethodWithParameter.DoDivision(400,2);




    }
}
