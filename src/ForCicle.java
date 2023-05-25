public class ForCicle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("I = " + i);
        }
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }
            System.out.println("J = " + j);
        }
        for (int k = 0; k < 10; k++) {
            if (k == 4 || k ==7) {
                continue;
            }
            System.out.println("K = " + k);
        }
    }
}
