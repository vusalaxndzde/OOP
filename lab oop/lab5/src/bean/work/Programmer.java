package bean.work;

public class Programmer extends Employee {

    private String p1;

    public Programmer() {
    }

    public Programmer(int id, String name, String surname, String job, String p1) {
        super(id, name, surname, job);
        this.p1 = p1;
    }

    @Override
    public String greeting() {
        return "hello i am programmer";
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " " + this.p1;
    }

}
