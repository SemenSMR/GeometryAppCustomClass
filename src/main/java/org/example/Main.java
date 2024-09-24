package org.example;

import org.example.geometry.Circle;
import org.example.geometry.Rectangle;
import org.example.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);
        double areaInCm = 5000;
        double areaInM2 = GeometryParam.convertAreaToSquareMeters(areaInCm, "cm");
        Cube cube = new Cube(12);
        Sphere sphere = new Sphere(3);
        System.out.println("Area in square meters: " + areaInM2);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter(3, 4, 5));


    }
}