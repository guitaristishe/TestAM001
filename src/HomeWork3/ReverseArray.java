package HomeWork3;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"Hello", "World", "Java"};

        reverseArray(array);

        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(String[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
