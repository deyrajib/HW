public class Item {


    public String areItemAvailable(String name, double price) {


        String itemName = name;


        double itemPrice = price;

        if (itemName == "Pen") {

            System.out.println("Pen " + itemName + " Item is available");
        }
        else if (itemName == "Cup") {
            System.out.println("Cup " + itemName + " pizaa is available");

        } else {
            System.out.println("We don't have Cup ");
        }
        return itemName;
    }

    public static void main(String[] args) {
        Item i = new Item();

        i.areItemAvailable( "Cup;",200);
    }


}
