public class ReturnMethodWithoutParameter {

    public int doSum() {

        int num1 = 50;
        int num2 = 40;
        int Total = num1 + num2;
        System.out.println("Total =" + Total);
        return Total;
    }

    public double doSubtraction() {
        double itemPrice = 65;
        double itemPrice1 = 45;
        double total1 = itemPrice - itemPrice1;
        System.out.println("Total = " + total1);
        return total1;
    }


    public double DoMultiplication() {
        double itemPrice = 65;
        double itemPrice1 = 45;
        double total1 = itemPrice * itemPrice1;
        System.out.println("Total = " + total1);
        return total1;
    }







    public float doDivision() {

        float number = 499f;
        float number1 = 90f;
        float total4 = number / number1;
        System.out.println("Total =" + total4);
        return total4;
    }

    public String getEmployeesInformation() {
        String employessName = ("Jamal");
        int idNo = 14;
        String add = ("Jamaica NY");
        String employees = employessName + idNo + add;
        System.out.println(" employeesInformation :" + " name :" + employessName +
                " " + "Id no : " + idNo +
                " " + " Add : " + add);
        return employees;
    }


    public boolean isDateAvailable(){
        boolean isAvaliable= true;
        System.out.println("Date Is Available" + isAvaliable);
        return isAvaliable;

    }

    public static void main(String[] args) {
//1
        ReturnMethodWithoutParameter ReturnMethodWithoutParameter = new ReturnMethodWithoutParameter();
        ReturnMethodWithoutParameter.doSum();

        ReturnMethodWithoutParameter.doSubtraction();
        ReturnMethodWithoutParameter.DoMultiplication();
        ReturnMethodWithoutParameter.doDivision();
        ReturnMethodWithoutParameter.getEmployeesInformation();




        ReturnMethodWithoutParameter.isDateAvailable();


    }
}


