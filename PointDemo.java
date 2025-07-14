public class PointDemo {
    public static void main(String[] args) {
        // Create a basic point
        Point p1 = new Point(1.1f, 2.2f);
        System.out.println("Point p1: " + p1);

        // Create a MovablePoint with speed only
        MovablePoint mp1 = new MovablePoint(0.5f, 1.0f);
        System.out.println("MovablePoint mp1 (before move): " + mp1);

        // Set position and move it
        mp1.setXY(2.0f, 3.0f);
        mp1.move();
        System.out.println("MovablePoint mp1 (after move): " + mp1);

        // Create a MovablePoint with full data
        MovablePoint mp2 = new MovablePoint(5.0f, 5.0f, 1.0f, -1.0f);
        System.out.println("MovablePoint mp2 (before move): " + mp2);
        mp2.move().move(); // Move twice
        System.out.println("MovablePoint mp2 (after moving twice): " + mp2);
    }
}
