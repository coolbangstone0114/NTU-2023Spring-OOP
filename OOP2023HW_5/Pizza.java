/**
 * A class that stores information about a single pizza.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class Pizza {
    private String size;
    private int base = 0;
    private int NumberOfCheese, NumberOfPepperoni, NumberOfHam;

    /**
     * Default constructor that sets size to small and the other three instance variables to 1.
     */
    public Pizza() {
        this.size = "small";
        this.NumberOfCheese = 1;
        this.NumberOfPepperoni = 1;
        this.NumberOfHam = 1;
    }

    /**
     * Constructor that can set all of the instance variables.
     *
     * @param size              The size of the pizza (small, medium, or large).
     * @param NumberOfCheese    The number of cheese toppings on the pizza.
     * @param NumberOfPepperoni The number of pepperoni toppings on the pizza.
     * @param NumberOfHam       The number of ham toppings on the pizza.
     */
    public Pizza(String size, int NumberOfCheese, int NumberOfPepperoni, int NumberOfHam) {
        this.size = size;
        this.NumberOfCheese = NumberOfCheese;
        this.NumberOfPepperoni = NumberOfPepperoni;
        this.NumberOfHam = NumberOfHam;
    }

    /**
     * Returns the size of the pizza.
     *
     * @return The size of the pizza (small, medium, or large).
     */
    public String getSize() {
        return size;
    }

    /**
     * Returns the number of cheese toppings on the pizza.
     *
     * @return The number of cheese toppings on the pizza.
     */
    public int getNumberOfCheese() {
        return NumberOfCheese;
    }

    /**
     * Returns the number of pepperoni toppings on the pizza.
     *
     * @return The number of pepperoni toppings on the pizza.
     */
    public int getNumberOfPepperoni() {
        return NumberOfPepperoni;
    }

    /**
     * Returns the number of ham toppings on the pizza.
     *
     * @return The number of ham toppings on the pizza.
     */
    public int getNumberOfHam() {
        return NumberOfHam;
    }

    /**
     * Sets the size of the pizza.
     *
     * @param size The new size of the pizza (small, medium, or large).
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Sets the number of cheese toppings on the pizza.
     *
     * @param numberOfCheese The new number of cheese toppings on the pizza.
     */
    public void setNumberOfCheese(int numberOfCheese) {
        NumberOfCheese = numberOfCheese;
    }

    /**
     * Sets the number of pepperoni toppings on the pizza.
     *
     * @param numberOfPepperoni The new number of pepperoni toppings on the pizza.
     */
    public void setNumberOfPepperoni(int numberOfPepperoni) {
        NumberOfPepperoni = numberOfPepperoni;
    }

    /**
     * Calculates the cost of the pizza based on its size and number of toppings.
     *
     * @param numberOfHam The new number of ham toppings on the pizza.
     */
    public void setNumberOfHam(int numberOfHam) {
        NumberOfHam = numberOfHam;
    }

    /**
     * Sets the number of ham toppings on the pizza.
     *
     * @return the cost of the pizza as a double.
     */
    public double calcCost() {
        double price;
        if (getSize().toLowerCase().equals("small")) { // compare input strings "size" using equals()
            base = 10;
        } else if (getSize().toLowerCase().equals("medium")) {
            base = 12;
        } else {
            base = 14;
        }
        price = base + 2 * (getNumberOfCheese() + getNumberOfPepperoni() + getNumberOfHam());
        base = 0; // reset base to zero for future calculations
        return price;
    }

    /**
     * Returns a string representation of the pizza object.
     *
     * @return a string containing the size of the pizza, the number of cheese toppings,
     * the number of pepperoni toppings, and the number of ham toppings.
     */
    @Override
    public String toString() {
        return ("size = " + size + ", numOfCheese = " + getNumberOfCheese() + ", numOfPepperoni = " + getNumberOfPepperoni() + ", numOfHam = " + getNumberOfHam());
    }

    /**
     * Determines whether this pizza is the same as the other one by their size, the number of cheese toppings,
     * the number of pepperoni toppings, and the number of ham toppings.
     *
     * @param OtherPizza the other Pizza object to compare
     * @return true if the two pizzas have the same size and same number of cheese, pepperoni and ham toppings, false otherwise
     */
    public boolean equals(Pizza OtherPizza) {
        return (this.size == OtherPizza.getSize()) && (this.NumberOfCheese == OtherPizza.getNumberOfCheese()) && (this.NumberOfPepperoni == OtherPizza.getNumberOfPepperoni()) && (this.NumberOfHam == OtherPizza.getNumberOfHam());
    }
}
