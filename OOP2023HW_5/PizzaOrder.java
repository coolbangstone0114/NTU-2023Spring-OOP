/**
 * A class representing a pizza order that can hold up to three pizzas.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class PizzaOrder {
    private int numberPizzas; // number of pizzas in the order
    private double price = 0; // the price of the current pizza being added
    private double total_price = 0; // the total price of the order

    /**
     * Sets the number of pizzas in the order.
     *
     * @param numberPizzas the number of pizzas in the order, between 1 and 3 inclusive
     * @return true if the order is valid (number of pizzas is between 1 and 3), false otherwise
     */
    public boolean setNumberPizzas(int numberPizzas) {
        if (1 <= numberPizzas && numberPizzas <= 3) {
            this.numberPizzas = numberPizzas;
            return true;
        } else {
            this.numberPizzas = 0;
            return false;
        }
    }

    /**
     * Sets the first pizza in the order and updates the price.
     *
     * @param Pizza1 the first pizza in the order
     */
    public void setPizza1(Pizza Pizza1) {
        price += Pizza1.calcCost(); // calculate the price of the pizza and add to the total price
        this.numberPizzas += -1; // decrease the number of pizzas in the order
    }

    /**
     * Sets the second pizza in the order and updates the price if there is at least one more pizza in the order.
     *
     * @param Pizza2 the second pizza in the order
     */
    public void setPizza2(Pizza Pizza2) {
        if (this.numberPizzas != 0) { // if still have pizza in the order
            price += Pizza2.calcCost(); // calculate the price of the pizza and add to the total price
            this.numberPizzas += -1; // decrease the number of pizzas in the order
        }
    }

    /**
     * Sets the third pizza in the order and updates the price if there is at least two more pizzas in the order.
     *
     * @param Pizza3 the third pizza in the order
     */
    public void setPizza3(Pizza Pizza3) {
        if (this.numberPizzas != 0) { // if still have pizza in the order
            price += Pizza3.calcCost(); // calculate the price of the pizza and add to the total price
            this.numberPizzas += -1; // decrease the number of pizzas in the order
        }
    }

    /**
     * Calculates the total cost of the order, resets the price to zero, and returns the total cost.
     *
     * @return the total cost of the order
     */
    public double calcTotal() {
        this.total_price = this.price; // store the current price in the total price
        this.price = 0; // reset the price to zero for future calculations
        return this.total_price;
    }
}
