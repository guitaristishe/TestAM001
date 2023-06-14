package HomeWork;

public class HomeWork2 {
    public static void main(String[] args) {

        String[] company = {"MAIB", "Allied Testing", "EST Computer", "Endava"};
        for (String i : company) {
            System.out.println(i);
        }

//      посчитать сколько элементов имеет масив сompany(что б не с 0 считал а с 1)
        int count = company.length;
        System.out.println("Количество элементов в массиве: " + count);

//      вывести последний, первый и второй элемент
        System.out.println("Последний элемент: " + company[company.length - 1]);
        System.out.println("Первый элемент: " + company[0]);
        System.out.println("Второй элемент: " + company[1]);

//      Вывести размер масива
        System.out.println("Размер массива: " + company.length);

    }
}