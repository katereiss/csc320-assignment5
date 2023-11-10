import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

// Prompt user to enter a day of the week or "week"  

// If user input is "week"  
// Initialize variable total as double, set to zero  

// For each day of the week  
// Print day + ": " + temperature  
// Add temperature to total  
// Print average = total / 7  

// Else-if day of week is in days  
// Initizalize variable index as integer  
// Set index equal to the index of day of week in days  
// Print the result of indexing days with index  
// Print the result of indexing temperatures with index  

// Else print invalid day  

public class weeklyTemperatures {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        ArrayList<Double> temperatures = new ArrayList<>(Arrays.asList(23.5, 24.0, 22.8, 25.2, 24.5, 26.1, 23.9));

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a day or 'week': ");
        String input = scnr.next();

        if (input.equals("week")) {
            double total = 0;
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i));
                total += temperatures.get(i);
            }
            System.out.println("Weekly Average: " + (total / days.size()));
        } 
        else if (days.contains(input)){
            int index = days.indexOf(input);
            System.out.println(days.get(index) + ": " + temperatures.get(index));
        } 
        else {
                System.out.println("Invalid day.");
            }
    
        scanner.close();
    }
}