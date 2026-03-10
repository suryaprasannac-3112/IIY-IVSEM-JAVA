import java.util.Scanner;

class BinarySearchRecursion {

    static int binarySearch(int a[], int low, int high, int key) {

        if (low > high) {          // stop condition
            return -1;
        }

        int mid = (low + high) / 2;

        if (a[mid] == key) {
            return mid;
        }
        else if (a[mid] < key) {
            return binarySearch(a, mid + 1, high, key);
        }
        else {
            return binarySearch(a, low, mid - 1, key);
        }
    }

    public static void main(String[] args) {
        int n, key;

        System.out.print("Enter number of elements: ");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();

            int[] a = new int[n];

            System.out.println("Enter elements in sorted order:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.print("Enter element to search: ");
            key = sc.nextInt();

            int result = binarySearch(a, 0, n - 1, key);

            if (result != -1)
                System.out.println("Element found at position " + (result + 1));
            else
                System.out.println("Element not found");
        }
    }
}
