public class MinMax {
    public static void main(String[] args) {
        int[] numbers = {34, 12, 5, 67, 23, 89, 1, 45};
        
        int min = numbers[0];
        int max = numbers[0];
        
        for(int num : numbers) {
            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
    
}
