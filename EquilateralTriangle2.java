public class EquilateralTriangle2 extends Triangle2 {
    public EquilateralTriangle2(double side) {
        super(side, side, side);
        this.name = "Equilateral Triangle";
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 = side1;
        side3 = side1;
    }
}
