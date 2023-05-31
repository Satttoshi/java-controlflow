import java.util.Scanner;

public class Controlflow {

    public static String hasTooManyPeople(int numberOfPeople) {
        if (numberOfPeople > 30) {
            return "too many people!";
        } else if (numberOfPeople < 30) {
            return "not too many people!";
        } else {
            return "not too many people, but almost!";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people in the shop? type and hit ENTER:");
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println("In the shop are " + hasTooManyPeople(input));

    }
}
