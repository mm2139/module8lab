import java.util.Scanner;

public class Tasks {

    public static void Task1(Scanner scan) {

        boolean done = false;
        String username = "";

        System.out.println("Please enter your username.");

        do {
            if (scan.hasNextLine()) {
                username = scan.nextLine();
                done = true;
            } else {
                System.out.println("Invalid input - please enter your username.");
            }
        } while (!done);

        System.out.println("Your username is: " + username);

    }

    public static void Task2(Scanner scan) {

        int userFavInt = InputHelper.getInt(scan, "Please input your favorite int.");

        double userFavDouble = InputHelper.getDouble(scan, "Please input your favorite double.");

        System.out.println("Your favorite int is " + userFavInt + " and your favorite double is " + userFavDouble);
    }

    public static void Task3(Scanner scan) {

        System.out.println("Please input your birthday, birth year, and birth time.");

        int userBirthYear = InputHelper.getRangedInt(scan, "What year were you born in?", 1950, 2010);
        int userBirthMonth = InputHelper.getRangedInt(scan, "What month were you born in?", 1, 12);
        int userBirthday = 0;
        if (userBirthMonth == 2) {
            userBirthday = InputHelper.getRangedInt(scan, "What day were you born in?", 1, 28);
        } else if (userBirthMonth == 1 || userBirthMonth == 3 || userBirthMonth == 5 || userBirthMonth == 7 || userBirthMonth == 8 || userBirthMonth == 10 || userBirthMonth == 12) {
            userBirthday = InputHelper.getRangedInt(scan, "What day were you born in?", 1, 31);
        } else {
            userBirthday = InputHelper.getRangedInt(scan, "What day were you born in?", 1, 30);
        }
        int userBirthHour = InputHelper.getRangedInt(scan, "What hour were you born in?", 1, 24);
        int userBirthMinute = InputHelper.getRangedInt(scan, "What minute were you born in?", 1, 60);

        System.out.println("Year: " + userBirthYear + "\nMonth: " + userBirthMonth + "\nDay: " + userBirthday + "\nHour: " + userBirthHour + "\nMinute: " + userBirthMinute);
    }

    public static void Task4(Scanner scan) {

        boolean anotherItem = true;
        double totalPrice = 0;

        do {
            double itemPrice = InputHelper.getRangedDouble(scan, "Please input the item you would like to buy from the $10 store. ", 0.50,9.99);
            totalPrice = totalPrice + itemPrice;
            anotherItem = InputHelper.getYNConfirm("Would you like to add another item to your cart? [Y/N]", scan);
        } while (anotherItem);

        System.out.println("Total cost: $" + totalPrice);

    }

    public static void Task5(Scanner scan) {
        String ssn = InputHelper.getRegEx(scan, "Please enter your social security number","\\d{3}-\\d{2}-\\d{4}");
        System.out.println("SSN: " + ssn);

        String studentMNumber = InputHelper.getRegEx(scan, "Please enter your student M number","(M|m)\\d{5}");
        System.out.println("StudentM Number: " + studentMNumber);

        String menuChoice = InputHelper.getRegEx(scan, "Menu: O - Open  S - Save  V - View  Q - Quit","[OoSsVvQq]");
        System.out.println("You chose: " + menuChoice.toUpperCase());

    }

    public static void Task6(Scanner scan) {

        boolean done = false;
        String userMessage = "";

        System.out.println("Please enter a message you would like to put in a pretty header.");

        do {
            if (scan.hasNextLine()) {
                userMessage = scan.nextLine();
                if (userMessage.length()>54) {
                    System.out.println("You message is too long - please try again.");
                } else {
                    done = true;
                }
            } else {
                System.out.println("Invalid input - please enter a message you would like to put in a pretty header.");
            }
        } while (!done);

        InputHelper.prettyHeader(userMessage);

        System.out.println();

    }

}
