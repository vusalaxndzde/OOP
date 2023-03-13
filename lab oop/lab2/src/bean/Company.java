package bean;

public class Company {

    /*
    -  name
    -  city
    -  aim
    -  chief
    -  countOfstaff
    + info(){};
    -  prints info about company
     */

    private String name;
    private String city;
    private String aim;
    private String chief;
    private int countOfStaff;

    public Company() {
    }

    public Company(String name, String city, String aim, String chief, int countOfStaff) {
        this.name = name;
        this.city = city;
        this.aim = aim;
        this.chief = chief;
        this.countOfStaff = countOfStaff;
    }

    public void info() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public int getCountOfStaff() {
        return countOfStaff;
    }

    public void setCountOfStaff(int countOfStaff) {
        this.countOfStaff = countOfStaff;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", city=" + city +
                ", aim=" + aim +
                ", chief=" + chief +
                ", countOfStaff=" + countOfStaff;
    }

}
