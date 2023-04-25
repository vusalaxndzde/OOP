package main;

import bean.shape.Rectangle;
import bean.shape.Shape;
import bean.shape.Triangle;
import bean.work.Employee;
import bean.work.Manager;
import bean.work.Programmer;

public class Main {

    public static void main(String[] args) {
        Employee programmer = new Programmer(1, "Elon", "Musk", "backend developer", "p1");
        System.out.println(programmer);

        Employee manager = new Manager(1, "Steve", "Jobs", "manager at Apple", "m1");
        System.out.println(manager);

        Shape rectangle = new Rectangle(4, 5, "blue");
        System.out.println(rectangle +  " " + rectangle.getArea());

        Shape triangle = new Triangle(4, 5, "red");
        System.out.println(triangle +  " " + triangle.getArea());

    }

}
