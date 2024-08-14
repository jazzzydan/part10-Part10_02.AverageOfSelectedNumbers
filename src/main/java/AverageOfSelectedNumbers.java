
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        while (true) {
            String choice = scanner.nextLine();
            if (choice.equals("n")) {

                System.out.println("Average of the negative numbers: " + inputs.stream()
                        .mapToInt(number -> Integer.valueOf(number))
                        .filter(n -> n < 0)
                        .average()
                        .getAsDouble());
                break;
            } else if (choice.equals("p")) {

                System.out.println("Average of the positive numbers: " + inputs.stream()
                        .mapToInt(number -> Integer.valueOf(number))
                        .filter(n -> n > 0)
                        .average()
                        .getAsDouble());
                break;
            } else {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            }
        }
    }
}
