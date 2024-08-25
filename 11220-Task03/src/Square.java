public class Square implements Shape {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public void draw() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
