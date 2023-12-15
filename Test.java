package ss6.BT.CircleAndCylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue");
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(3.0, "green", 10.0);
        System.out.println(cylinder.toString());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
