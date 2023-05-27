public class ForEachCicle {
    public static void main(String[] args) {
        String[] company = {"MAIB", "Allied Testing", "EST Computer", "Endava"};
        for (String i : company) {
            System.out.println(i);
        }
        String s = "===========================";
        System.out.println(s);
        System.out.println(company[0] + "\n" + company[3]);
        System.out.println(s);
        for (int i = 0; i < company.length; i++) {
            System.out.println(company[i]);
        }
        System.out.println(s);

        for (int i =2; i < company.length; i++) {
            System.out.println(company[i]);
        }
    }
}
