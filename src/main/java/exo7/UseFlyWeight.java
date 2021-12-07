package exo7;

public class UseFlyWeight {
    public static void main(String[] args) {
        Circle circle = new Circle(10,20, "Blue", 4, true);
        Square square1 = new Square(10, "Blue", 4, true);
        Square square2 = new Square(10, "Red", 4, true);
        circle.draw();
        square1.draw();
        square2.draw();

        System.out.println("Number of different line styles " + IShape.getNbLineStyles());

        circle.getLineStyle().setThickness(7);
        square1.getLineStyle().setColor("Orange");
        circle.draw();
        square1.draw();
    }
}
