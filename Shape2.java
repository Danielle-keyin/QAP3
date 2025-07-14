public abstract class Shape2 implements Scalable {
    protected String name;

    public Shape2(String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return name + ": Area = " + area() + ", Perimeter = " + perimeter();
    }
}
