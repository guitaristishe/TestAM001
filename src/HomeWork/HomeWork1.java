package HomeWork;

public class HomeWork1 {

    public static void main(String[] args) {

//        1.Есть стринг I love java
        String phrase = "I love java";

//        а)Посчитать суколько букв в этой фразе
        System.out.println("Количество букв: " + phrase.length());

//        б)Вывести букву под индексом 4
        System.out.println("Буква под индексом 4: " + phrase.charAt(4));

//        в)Вывсти индекс буквы j
        System.out.println("Индекс буквы j: " + phrase.indexOf('j'));

//        г) добавть в эту фразу and QA Automation (должно вывексти I love java nd QA Automation)
        System.out.println(phrase + " and QA Automation");

//        2)Проверить через boolean что фраза I love java типа String
        boolean isString = phrase instanceof String;
        System.out.println("Фраза является типом String: " + isString);
    }

}
