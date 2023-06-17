package OOP;

import java.sql.SQLOutput;

public class Modifiers {
    public static void main(String[] args) {
        Modifiers modifiers = new Modifiers();
        System.out.println(modifiers.a);
        System.out.println(modifiers.b);
        System.out.println(modifiers.c);
        modifiers.c = 9;

    }
    final int a = 5;
    public int b = 7;
    private int c = 8;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


    public class Test{
        public static void main(String[] args) {
            Modifiers modifiers = new Modifiers();
            System.out.println(modifiers.getC());
        }

    }
}
