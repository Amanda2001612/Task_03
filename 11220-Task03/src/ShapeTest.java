public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle", 5);
        System.out.println("Circle:");
        circle.draw();

        Shape square = shapeFactory.getShape("square", 5);
        System.out.println("\nSquare:");
        square.draw();

        Shape triangle = shapeFactory.getShape("triangle", 5);
        System.out.println("\nTriangle:");
        triangle.draw();

        Shape rectangle = shapeFactory.getShape("rectangle", 7, 4);
        System.out.println("\nRectangle:");
        rectangle.draw();
    }
}
