public class MultidimentionalArrays {
    public static void main(String[] args) {
        int[][] nr = {{1, 2, 3, 4}, {5, 6, 7}};
        nr[0][2] = 11;
        System.out.println(nr[1][2]);
        for (int i = 0; i < nr.length; i++)
            for (int j = 0; j < nr[i].length; j++) {
                System.out.println(nr[i][j]);
            }

        System.out.println("============");
//        for (int i = 0; i < nr.length; i++)
//            for (int j = 0; j < nr[i].length; j++)
//                if (nr[i][j] == 7) {
//                    System.out.println(i);
//                    System.out.println(j);
//                } else {
//                    System.out.println("No such element ");
//                }

        int[] arr = {5, 6, 7, 8, 9};
        for (int x = 0; x < arr.length; x++)
            if (arr[x] == 7) {
                System.out.println(x);
            }

    }
}

