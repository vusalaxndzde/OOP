package entity;

public class Manager extends Employee {
    private int teamSize;

    public void report() {
    }

    @Override
    public void greeting() {
        System.out.println("hello i am manager");
    }

    public Manager(int ts) {
        this.teamSize = ts;
    }

}
