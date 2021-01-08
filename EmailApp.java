import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter student first name: ");
        String firstName = in.nextLine();

        System.out.print("Please enter student last name: ");
        String lastName = in.nextLine();
        
        Email email = new Email(firstName, lastName);

       System.out.println(email.showInfo());
    }
}
