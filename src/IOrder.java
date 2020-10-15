/*
 * An interface to make an
 * order behavior
 */
public interface IOrder {
    /*
     * Method to calculate order total cost
     */
    public abstract float calculateCost();

    /*
     * ... MenuItem getter, that must
     * be in its child class
     */
    public MenuItem getMenuItem();

    /*
     * MenuItem setter
     */
    public void setMenuItem(MenuItem menuItem);

    /*
     * Total amount of menu item in
     * the order getter
     */
    public int getAmount();

    /*
     * Total amount of menu item in
     * the order setter
     */
    public void setAmount(int amount);
}
