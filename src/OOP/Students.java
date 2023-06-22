package OOP;

public class Students {
    String name;
    int age;
    String specialitate;

    public String getSpecialitate() {
        return specialitate;
    }

    public void setSpecialitate(String specialitate) {
        this.specialitate = specialitate;
    }

    String group;
    double media;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Students(String name, int age, String specialitate, String group, double media) {
        this.name = name;
        this.age = age;
        this.specialitate = specialitate;
        this.group = group;
        this.media = media;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialitate='" + specialitate + '\'' +
                ", group='" + group + '\'' +
                ", media=" + media +
                '}';
    }
}
