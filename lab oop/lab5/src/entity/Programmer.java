package entity;

public class Programmer extends Employee {
    private String pl;

    public void writeCode() {
    }

    @Override
    public void greeting() {
        System.out.println("hello i am programer");
    }

    public Programmer(String pl) {
        this.pl = pl;
    }

}
