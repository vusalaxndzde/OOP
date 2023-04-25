package bean.shape;

public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle() {

    }

    public Triangle(int base, int height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + getColor() +
                "base=" + base +
                ", height=" + height +
                '}';
    }

}
