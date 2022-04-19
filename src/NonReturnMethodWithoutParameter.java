public class NonReturnMethodWithoutParameter {


    //without parameter

    public void dosum() {
        int price = 200;
        int price1 = 300;
        int Total = price + price1;

        System.out.println("Totalprice=" + Total);

    }

    public void Subtraction() {
        double itemPrice = 4.99;
        double itemPrice2 = 5.99;
        double subTotal = itemPrice - itemPrice2;

        System.out.println("TRotal=" + subTotal);

    }

    public void Multiplication() {

        float num1 = 100f;
        float num2 = 30f;
        float total = num1 * num2;
        System.out.println("total =" + total);

    }

    public void Division() {
        float number = 200f;
        float number1 = 90f;
        float total = number / number1;
        System.out.println("Total =" + total);

    }

    public void employeesInformation() {
        String employessName = ("Alx");
        int idNo = 14;
        String add = ("Jamaica NY");

        System.out.println(" employeesInformation :" + " name :" + employessName +
                " " + "Id no : " + idNo +
                " " + " Add : " + add);
    }

    public  void  OfficeHr(){





    }





    public static void main(String[] args) {
        //1
        NonReturnMethodWithoutParameter NonReturnMethodWithoutParameter = new NonReturnMethodWithoutParameter();
        NonReturnMethodWithoutParameter.dosum();
//
        NonReturnMethodWithoutParameter.Subtraction();
        NonReturnMethodWithoutParameter.Multiplication();
        NonReturnMethodWithoutParameter.Division();
        NonReturnMethodWithoutParameter.employeesInformation();

    }
}








