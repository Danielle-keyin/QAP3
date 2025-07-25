public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // Default constructor
    public Point() {}

    // Constructor with x and y
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public float getX() {
        return x;
    }

    // Setter for x
    public void setX(float x) {
        this.x = x;
    }

    // Getter for y
    public float getY() {
        return y;
    }

    // Setter for y
    public void setY(float y) {
        this.y = y;
    }

    // Set both x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Return x and y as an array
    public float[] getXY() {
        return new float[] {x, y};
    }

    // toString() method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
