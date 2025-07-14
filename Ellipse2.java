public class Ellipse2 extends Shape2 {
    protected double a; // major axis
    protected double b; // minor axis

    public Ellipse2(double axis1, double axis2) {
        super("Ellipse");
        a = Math.max(axis1, axis2);
        b = Math.min(axis1, axis2);
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        return Math.PI * (2 * (a * a + b * b) - Math.pow(a - b, 2)) / 2;
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
