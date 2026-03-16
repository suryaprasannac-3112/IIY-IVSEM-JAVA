import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class ProgramC {
    public static void main(String[] args) {
        System.out.println("Program C: Copy Even numbers into Even.txt file and Odd Numbers into Odd.txt file.");
        
        String inputFile = "Numbers.txt";
        String evenFile = "Even.txt";
        String oddFile = "Odd.txt";
        
        // Create an initial Numbers.txt file for testing purposes if it doesn't exist
        createInputFile(inputFile);
        
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter evenWriter = new PrintWriter(new FileWriter(evenFile));
             PrintWriter oddWriter = new PrintWriter(new FileWriter(oddFile))) {
             
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line.trim());
                    if (number % 2 == 0) {
                        evenWriter.println(number);
                    } else {
                        oddWriter.println(number);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number format: " + line);
                }
            }
            
            System.out.println("Successfully copied even numbers to " + evenFile + " and odd numbers to " + oddFile + ".");
            
        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
        }
    }
    
    // Helper method to create input file with dummy data
    private static void createInputFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                for (int i = 1; i <= 20; i++) {
                    writer.println(i);
                }
                System.out.println("Created " + fileName + " with numbers from 1 to 20 for testing.");
            } catch (IOException e) {
                System.err.println("Could not create " + fileName);
            }
        }
    }
}
