/**
 * The ShapeFactory class is responsible for creating Shape objects of various types.
 *
 * @author CHAO, SIN-YUAN
 * @version 1.0
 */
public class ShapeFactory {

    /**
     * An enum representing the types of shapes that can be created by the factory.
     */
    public enum Type {
        Triangle,
        Square,
        Circle
    }

    /**
     * Creates a new Shape object of the given type and length.
     *
     * @param shapeType The type of shape to create.
     * @param length    The length (side length or diameter) of the shape to create.
     * @return A new Shape object of the specified type and length.
     */
    public Shape createShape(Type shapeType, double length) {
        switch (shapeType) {
            case Triangle:
                return new Triangle(length);
            case Square:
                return new Square(length);
            case Circle:
                return new Circle(length);
        }
        return null;
    }
}
