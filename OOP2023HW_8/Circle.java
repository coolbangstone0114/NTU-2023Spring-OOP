/**
 * The Circle class extends Shape and represents a circle with a given diameter.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class Circle extends Shape {

    /**
     * Constructs a Circle object with the given diameter.
     *
     * @param length The diameter of the circle.
     */
    public Circle(double length) {
        super(length);
    }

    /**
     * Sets the length of the circle to the given diameter.
     *
     * @param length The diameter of the circle.
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Computes and returns the area of the circle.
     *
     * @return The area of the circle rounded to two decimal places.
     */
    @Override
    public double getArea() {
        return Math.round(length * length * Math.PI * 0.25 * 100.0) / 100.0;
    }

    /**
     * Computes and returns the perimeter of the circle.
     *
     * @return The perimeter of the circle rounded to two decimal places.
     */
    @Override
    public double getPerimeter() {
        return Math.round(Math.PI * length * 100.0) / 100.0;
    }
}
