
import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Simple AI ChatBot");
        System.out.println("Type 'exit' to stop");

        while(true) {

            System.out.print("You: ");
            input = sc.nextLine();

            if(input.equalsIgnoreCase("hello")) {
                System.out.println("Bot: Hi! How are you?");
            }
            else if(input.equalsIgnoreCase("how are you")) {
                System.out.println("Bot: I am fine!");
            }
            else if(input.equalsIgnoreCase("bye")) {
                System.out.println("Bot: Goodbye!");
            }
            else if(input.equalsIgnoreCase("exit")) {
                System.out.println("Bot: Chat ended");
                break;
            }
            else {
                System.out.println("Bot: I don't understand.");
            }
        }
    }
}
