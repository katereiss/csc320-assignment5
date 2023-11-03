import java.util.Scanner;

public class gradeStatistics {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        float sum = 0;
        float max = 0;
        float min = 100;
        float avg;
        float grade;
        
        for (int i = 0; i < 10; ++i){
            System.out.println("Enter grade " + (i+1) + ": ");
            grade = scnr.nextFloat();

            sum += grade;

            if (grade > max){
                max = grade;
            }
            if (grade < min){
                min = grade;
            }
        }
        avg = sum / 10;

        System.out.println("Average grade: " + avg);
        System.out.println("Maximum grade: " + max);
        System.out.println("Minimum grade: " + min);


    }
}