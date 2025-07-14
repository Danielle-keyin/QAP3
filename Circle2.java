public class Circle2 extends Ellipse2 {
    public Circle2(double radius) {
        super(radius, radius);
        this.name = "Circle";
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b = a;
    }
}
