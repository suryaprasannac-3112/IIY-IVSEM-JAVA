public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = { 42, 13, 7, 99, 21, 0, -5 };
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}