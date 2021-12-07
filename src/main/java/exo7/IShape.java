package exo7;

public abstract class IShape {
    protected LineStyle lineStyle;

    public IShape(String color, int thickness, boolean shadow) {
        // A completer
    }

    public LineStyle getLineStyle() {
        return lineStyle;
    }

    @Override
    public String toString() {
        return ", {lineStyle=" + lineStyle +
                ", color='" + lineStyle.getColor() + '\'' +
                ", thickness=" + lineStyle.getThickness() +
                ", shadow=" + lineStyle.isShadow() +
                '}';
    }

    public abstract void draw();
}
