/**
 * The Square class represents a square shape, which is a type of Shape object.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class Square extends Shape {

    /**
     * Creates a new Square object with the given side length.
     *
     * @param length The length of the sides of the square.
     */
    public Square(double length) {
        super(length);
    }

    /**
     * Sets the length of the sides of the square.
     *
     * @param length The new length of the sides of the square.
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates and returns the area of the square.
     *
     * @return The area of the square.
     */
    @Override
    public double getArea() {
        return Math.round(length * length * 100.0) / 100.0;
    }

    /**
     * Calculates and returns the perimeter of the square.
     *
     * @return The perimeter of the square.
     */
    @Override
    public double getPerimeter() {
        return Math.round(length * 4 * 100.0) / 100.0;
    }
}
