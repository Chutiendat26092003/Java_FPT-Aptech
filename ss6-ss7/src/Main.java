import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        int a;
        int b;
        int c;

        // Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();
        a = myObj.nextInt();
        b = myObj.nextInt();
        c = myObj.nextInt();

        System.out.println("Username is: " + userName);
    }
}
