package main;

import bean.work.Employee;
import bean.work.Manager;
import bean.work.Programmer;

public class Main {

    public static void main(String[] args) {
        Employee programmer = new Programmer(1, "Elon", "Musk", "backend developer", "p1");
        System.out.println(programmer);

        Employee manager = new Manager(1, "Steve", "Jobs", "manager at Apple", "m1");
        System.out.println(manager);
    }

}
