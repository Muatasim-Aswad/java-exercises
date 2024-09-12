
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int answer = Integer.valueOf(scanner.nextLine());
            
            if(answer == 0) {
                if(counter > 0) {
                    double average = 1.0 * sum / counter;
                    System.out.println("Average of the numbers: " + average);
                } else {
                    System.out.println("Cannot calculate the average");
                }
                
                break;
            }
            
            if (answer > 0) {
                counter++;
                sum += answer;
            }
            
        }

    }
}
