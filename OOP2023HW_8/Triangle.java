/**
 * A class representing a regular triangle that extends the Shape abstract class.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class Triangle extends Shape {

    /**
     * Constructs a Triangle object with the given length as the side length.
     *
     * @param length the side length of the triangle.
     */
    public Triangle(double length) {
        super(length);
    }

    /**
     * Sets the side length of the triangle.
     *
     * @param length the new side length of the triangle.
     */
    @Override
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates and returns the area of the triangle.
     *
     * @return the area of the triangle rounded to 2 decimal places.
     */
    @Override
    public double getArea() {
        return Math.round(length * length * Math.sin(Math.toRadians(60)) * 0.5 * 100.0) / 100.0;
    }

    /**
     * Calculates and returns the perimeter of the triangle.
     *
     * @return the perimeter of the triangle rounded to 2 decimal places.
     */
    @Override
    public double getPerimeter() {
        return Math.round(length * 3 * 100.0) / 100.0;
    }
}