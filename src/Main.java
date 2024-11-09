import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userInput;

        do {
            System.out.println("Which task would you like to use? [1-6] \nIf you would like to not run any task, input the word QUIT");
            userInput = scan.nextLine();
            switch (userInput) {
                case "1":
                    Tasks.Task1(scan);
                    break;
                case "2":
                    Tasks.Task2(scan);
                    break;
                case "3":
                    Tasks.Task3(scan);
                    break;
                case "4":
                    Tasks.Task4(scan);
                    break;
                case "5":
                    Tasks.Task5(scan);
                    break;
                case "6":
                    Tasks.Task6(scan);
                    break;
            }

        }  while (!userInput.equalsIgnoreCase("Quit")) ;

        System.out.println("Thank you!");
        System.exit(0);

    }
}