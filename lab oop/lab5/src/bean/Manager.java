package bean;

public class Manager extends Employee {

    private String m1;

    public Manager() {
    }

    public Manager(int id, String name, String surname, String job, String m1) {
        super(id, name, surname, job);
        this.m1 = m1;
    }

    @Override
    public String greeting() {
        return "hello i am manager";
    }

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " " + this.m1;
    }

}
