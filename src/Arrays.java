public class Arrays {
    public static void main(String[] args) {

        String[] credit = {"Espresso", "Prima casa"};
        for (int i =0; i < credit.length; i++)
            System.out.println("Credite = "+credit[i]);
        String creditMaib[] = new String[3];
        creditMaib[0] = "Java";
        creditMaib[1] = "Golang";
        creditMaib[2] = "Rust";

        for (int j =0; j < creditMaib.length; j++) {
            System.out.println("Credite Maib = "+ creditMaib[j]);
        }
        System.out.println("Index 3 credit " + credit[1]);
        System.out.println("Size " + credit.length);
        System.out.println("Last element " + creditMaib[creditMaib.length - 1]);

    }
}
