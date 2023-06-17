public class Main2 {
    public static void main(String[] args) {
        Main2 suma = new Main2();
        suma.matchOperation(5, 7);
    }

    void matchOperation(int a, int b) {
        int suma = a + b;
        System.out.println(suma);
    }
    void matchOperation(int a, double b) {
        double suma = a + b;
        System.out.println(suma);
    }

}
