package main;

import entity.Manager;
import entity.Programmer;
public class Main {

    public static void main(String[] args) {
        Programmer pr = new Programmer("java");
        Manager m = new Manager(50);
        pr.greeting();
        pr.writeCode();
        m.greeting();
        m.report();
    }

}
