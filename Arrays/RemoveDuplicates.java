import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 2, 4, 9, 1, 9 };
        int[] unique = removeDuplicates(arr);
        System.out.println("Unique elements: " + Arrays.toString(unique));
    }

    private static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        Set<Integer> set = new LinkedHashSet<>();
        for (int value : arr) {
            set.add(value);
        }

        int[] result = new int[set.size()];
        int idx = 0;
        for (int value : set) {
            result[idx++] = value;
        }
        return result;
    }
}