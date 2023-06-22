package OOP;

import java.util.ArrayList;

public class Massive {
    public static void main(String[] args) {
        int[] arr = {5, 2, 19, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(0, 3);
        for (int j = 0; j < array.size(); j++) {
            System.out.println(array);

        }

        array.remove(1);
        System.out.println(array);
        array.clear();
        System.out.println(array);

    }

}

