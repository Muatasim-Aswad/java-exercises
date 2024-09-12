
import java.util.Scanner;
import java.text.MessageFormat;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        String toPrint;
        
        if (first > second) {
            toPrint = MessageFormat.format("{0} is greater than {1}", first, second);
        } else if (first < second) {
            toPrint = MessageFormat.format("{0} is smaller than {1}", first, second);
        } else {
            toPrint = MessageFormat.format("{0} is equal to {1}", first, second);
        }
        
        System.out.println(toPrint);
    }
}
