import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays; 

public class weeklyTemperatures {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        ArrayList<Double> temperatures = new ArrayList<>(Arrays.asList(63.0, 60.2, 57.5, 54.0, 58.6, 58.9, 61.2));

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a day or 'week': ");
        String userInput = scnr.next();

        if (userInput.equals("week")) {
            double total = 0;
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i));
                total += temperatures.get(i);
            }
            System.out.println("Weekly Average: " + (total / days.size()));
        } 
        else if (days.contains(userInput)){
            int index = days.indexOf(userInput);
            System.out.println(days.get(index) + ": " + temperatures.get(index));
        } 
        else {
                System.out.println("Invalid day.");
            }
    
        scnr.close();
    }
}