package HomeWork3;

public class AverageArray {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};

        double average = calculateAverage(array);

        System.out.println("Среднее арифметическое: " + average);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }
}
