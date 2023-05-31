import java.util.Scanner;

public class Controlflow {

    public static String hasTooManyPeople(int numberOfPeople, int limit) {
        if (numberOfPeople > limit) {
            return "too many people!";
        } else if (numberOfPeople < limit) {
            return "not too many people!";
        } else {
            return "not too many people, but almost!";
        }
    }

    public static String alarm(int numberOfPeople, String alarmLevel){
        return switch (alarmLevel) {
            case "red" -> "no people allowed!";
            case "yellow" -> hasTooManyPeople(numberOfPeople, 30);
            case "green" -> hasTooManyPeople(numberOfPeople, 60);
            default -> "ERROR: Alarm level not recognized";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people in the shop? type and hit ENTER:");
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println("Which alarm level? type red/yellow/green and hit ENTER:");
        String alarm = scanner.nextLine();
        System.out.println("In the shop are " + alarm(input, alarm));
    }
}

