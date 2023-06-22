package OOP;

public class Principal extends Students{
    public Principal(String name, int age, String specialitate, String group, double media) {
        super(name, age, specialitate, group, media);
    }

    public static void main(String[] args) {
        Students student1 = new Students("Vasea", 21, "Inginerie", "IMI2005", 7.23);
        System.out.println(student1.name);

    }

}
