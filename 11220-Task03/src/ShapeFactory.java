public class ShapeFactory {
    public Shape getShape(String shapeType, int... dimensions) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle(dimensions[0]);
            case "square":
                return new Square(dimensions[0]);
            case "triangle":
                return new Triangle(dimensions[0]);
            case "rectangle":
                return new Rectangle(dimensions[0], dimensions[1]);
            default:
                return null;
        }
    }
}
