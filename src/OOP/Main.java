package OOP;

public class Main extends Employee {

    public Main(String name, String position, double salary) {
        super(name, position, salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jora", "QA", 25000.10);
        System.out.println(employee1.getSalary());
        System.out.println(employee1.name);

        Employee Victor = new Employee("Android dev", 30000.25);
        System.out.println(Victor.getSalary());
        Victor.setSalary(250356.42);
        System.out.println(Victor.getSalary());
    }

}
