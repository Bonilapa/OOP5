/*
 * Class of coffee cappucino
 */
public class MenuOrder implements IOrder {
    /*
     * An item in menu order
     */
    private MenuItem MenuItem;

    /*
     * Total amount of menu item in
     * the order
     */
    private int amount;

    /*
     * A link to the order
     * to add additional items
     * into menu order
     */
    private MenuOrder order;

    /*
     * Menu order getter
     */
    public MenuOrder getOrder() {
        return order;
    }

    /*
     * Menu order setter
     */
    public void setOrder(MenuOrder order) {
        this.order = order;
    }

    /*
     * Method to calculate order total cost
     */
    @Override
    public float calculateCost() {
        float cost = this.getAmount() * this.getMenuItem().getPrice();
        if(this.getOrder() != null){
            cost += this.getOrder().calculateCost();
        }
        return cost;
    }

    /*
     * Menu item getter
     */
    @Override
    public MenuItem getMenuItem() {
        return null;
    }

    /*
     * Menu item setter
     */
    @Override
    public void setMenuItem(MenuItem menuItem) {

    }

    /*
     * Menu item amount getter
     */
    @Override
    public int getAmount() {
        return amount;
    }
    /*
     * Menu item amount setter
     */
    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
