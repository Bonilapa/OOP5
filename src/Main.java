/*
 * Class-entry point of the program
 */
public class Main {

    /*
     * Method entry-point for a program
     */
    public static void main(String[] args) {
        //Menlu order initialization
        MenuOrder menuOrder = new MenuOrder();

        //Setting the order
        menuOrder.setMenuItem(new Cappuccino());
        menuOrder.setAmount(2);

        //Setting additional items into the order
        menuOrder.setOrder(menuOrder);
        menuOrder.getOrder().setMenuItem(new Sugar());
        menuOrder.getOrder().setAmount(5);
        /*
         * calculateCost() throws NullPointerException
         * because Cappuccino and Sugar (there is no Milk class)
         * have no fields, because their parent class fields are private,
         * and methods get() try to return an unexisting fields.
         * Also, according to UML diagram there is no any code in
         * Cappuccino and Sugar classes
         */
    }
}
