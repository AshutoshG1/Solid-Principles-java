package solid;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create a Circle
        Shape shape1 = shapeFactory.createShape("CIRCLE");
        shape1.draw();

        // Create a Square
        Shape shape2 = shapeFactory.createShape("SQUARE");
        shape2.draw();
    }
}