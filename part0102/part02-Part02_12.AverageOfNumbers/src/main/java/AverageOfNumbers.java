
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int answer = Integer.valueOf(scanner.nextLine());
            
            if(answer == 0) {
                double average = 1.0 * sum / counter;
                System.out.println("Average of the numbers: " + average);
                break;
            }
            
            counter++;
            sum += answer;
        }

    }
}
