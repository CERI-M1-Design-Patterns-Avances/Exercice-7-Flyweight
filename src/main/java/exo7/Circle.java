package exo7;

public class Circle extends IShape {

    // intriseque : couleur
    // extrinseque : abscisse, ordonnee

    private int abscisse, ordonnee;

    public Circle(int abscisse, int ordonnee, String color, int thickness, boolean shadow) {
        super(color, thickness, shadow);
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "abscisse=" + abscisse +
                ", ordonnee=" + ordonnee +
                super.toString() +
                '}';
    }
}
