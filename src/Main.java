import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        //login code
        System.out.println("Please enter your email:");
        String email = read.next();

        System.out.println("Please enter your password:");
        String password = read.next();

        if( email.equals("alzakwani0@gmail.com") && password.equals("Zak123##")){
            System.out.println("Login successful");
        }else {
            System.out.println("Sorry your email is wrong");
        }

        //registration code
        System.out.println("To create account, please enter:");
        System.out.println("Name:");
        String name = read.next();

        System.out.println("Email:");
        String email1 = read.next();

        System.out.println("Phone number:");
        int phone = read.nextInt();

        System.out.println("Date of Birth:");
        int Date = read.nextInt();

        System.out.println("Password:");
        String password1 = read.next();

        System.out.println("Re-write the password:");
        String password2 = read.next();

        if (password1 .equals(password2)){
            System.out.println("Correct password");
        }
    }
}