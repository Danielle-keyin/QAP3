public class InterfacesDemo {
    public static void main(String[] args) {
        Shape2[] shapes = new Shape2[4];

        shapes[0] = new Circle2(5.0);
        shapes[1] = new Ellipse2(6.0, 4.0);
        shapes[2] = new Triangle2(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle2(6.0);

        System.out.println("Before scaling:");
        for (Shape2 shape : shapes) {
            System.out.println(shape);
        }

        scaleAll(shapes, 2.0);

        System.out.println("\nAfter scaling:");
        for (Shape2 shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleAll(Scalable[] scalables, double factor) {
        for (Scalable s : scalables) {
            s.scale(factor);
        }
    }
}
