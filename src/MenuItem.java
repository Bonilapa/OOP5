/*
 * Class total menu item behavior
 */
public abstract class MenuItem {

    /*
     * Menu item name
     */
    private String name;

    /*
     * Menu item price in the order
     */
    private float price;

    /*
     * name getter
     */
    public String getName() {
        return name;
    }

    /*
     * name setter
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * price getter
     */
    public float getPrice() {
        return price;
    }

    /*
     * price setter
     */
    public void setPrice(float price) {
        this.price = price;
    }
}
