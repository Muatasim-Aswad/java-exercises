
import java.util.Scanner;
import java.text.MessageFormat;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();
        System.out.println("What is their job?");
        String job = scanner.nextLine();
        
        System.out.println("Here is the story:");
        String toPrint = String.format("Once upon a time there was %s, who was %s.", name, job);
        System.out.println(toPrint);
        toPrint = MessageFormat.format("On the way to work, {0} reflected on life.", name);
        System.out.println(toPrint);
        toPrint = MessageFormat.format("Perhaps {0} will not be {1} forever.", name, job);
        System.out.println(toPrint);
    }
}
