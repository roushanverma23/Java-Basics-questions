import java.util.*;

interface Computation {

    void Area();

    void perimeter();

    void volume();

}

class Shape implements Computation {

    @Override
    public void Area() {
        System.out.println("Area of " + this.getClass().getName().split("\\.")[1] + " is :- ");
    }

    @Override
    public void perimeter() {
//        LabQuestion.Rectangle
        System.out.println("Perimeter of " + this.getClass().getName().split("\\.")[1] + " is :- ");
    }

    @Override
    public void volume() {
        System.out.println("Volume of " + this.getClass().getName().split("\\.")[1] + " is :- ");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void Area() {
        super.Area();
        var area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
    }

    @Override
    public void perimeter() {
        super.perimeter();
        var perimeter = 2 * Math.PI * radius;
        System.out.println(perimeter);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void Area() {
        super.Area();
        var area = length * width;
        System.out.println(area);
    }

    @Override
    public void perimeter() {
        super.perimeter();
        var parameter = 2 * (length + width);
        System.out.println(parameter);
    }
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void Area() {
        super.Area();
        var area = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println(area);
    }

    @Override
    public void volume() {
        super.volume();
        var volume = (4 / 3) * (Math.PI * Math.pow(radius, 3));
        System.out.println(volume);
    }
}

class ParallelPiped extends Shape {
    private double length;
    private double width;
    private double height;

    public ParallelPiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void volume() {
        super.volume();
        var volume = 2 * ((length * width) + (width * height) + (height * length));
        System.out.println(volume);
    }
}

public class Q27 {
    public static void main(String[] args) {
        var circle = new Circle(2);
        circle.Area();
        circle.perimeter();

        System.out.println();

        var rectangle = new Rectangle(2, 6);
        rectangle.Area();
        rectangle.perimeter();

        System.out.println();

        var parallelepiped = new ParallelPiped(3, 4, 7);
        parallelepiped.volume();
        parallelepiped.Area();

        System.out.println();

        var sphere = new Sphere(45);
        sphere.Area();
        sphere.volume();
    }
}
