package OOP;

public class Angajat {
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }

    String FirstName, LastName, position;
    int age;
    double salary;

    public Angajat(String firstName, String lastName, int age, double salary) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
