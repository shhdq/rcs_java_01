import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String greetings = "Welcome";

        System.out.println("E-mail: ");
        String user_email = scan.nextLine();

        System.out.println("Password: ");
        String user_password = scan.nextLine();

        if (user_email.equals("m@m.lv") && user_password.equals("parole12345")) {
            System.out.println(greetings + " " + user_email + "!");
        } else {
            System.out.println("I am calling 911, better run");
        }




    }
}