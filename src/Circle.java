public class Circle extends Shape {
    double radius;

    public Circle(String color) {
        super(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
