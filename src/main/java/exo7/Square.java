package exo7;

public class Square extends IShape {

    private int width;

    public Square(int width, String color, int thickness, boolean shadow) {
        super(color, thickness, shadow);
        this.width = width;
    }

    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                super.toString() +
                '}';
    }
}
