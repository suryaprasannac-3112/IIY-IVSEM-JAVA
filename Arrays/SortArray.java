public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 42, 13, 7, 99, 21, 0, -5 };
        bubbleSort(arr);
        System.out.println("Sorted ascending: " + java.util.Arrays.toString(arr));
    }

    private static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }
}