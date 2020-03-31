import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Airline airline = new Airline();

        String art = "<><><><><><><><><><><><><><><><><><><><><><><><><><>";
        String airlineName = "Peter's Absolutely Real Airline";
        System.out.println(art);
        System.out.println(airlineName);
        System.out.println(art);
        System.out.println();

        System.out.println("Thank you for choosing " + airlineName + "! \n" +
                "Welcome to Account Creation.");
        System.out.println();

        System.out.println("Please type your full name and hit Enter.");
        airline.setName(scan.nextLine());
        System.out.println("Thank you " + airline.getName() + "!");
        System.out.println();

        System.out.println("Please enter your birthday (mm/dd/yyyy) and hit Enter.");
        airline.setBirthday(scan.nextLine());
        System.out.println();

        System.out.println("Please enter your password and hit Enter.");
        airline.setPassword(scan.nextLine());
        System.out.println();

        System.out.println("Please enter the 4-digit pin you would like to associate with this account and hit Enter.");
        airline.setPin(scan.nextLine());
        System.out.println();

        System.out.println(airline.getName() + "'s Account information:");
        System.out.println("Birthday: " + airline.getBirthday());
        System.out.println("Password: " + airline.getPassword());
        System.out.println("PIN: " + airline.getPin());
        if (airline.checkPalindrome(airline.getPassword())){
            System.out.println("Your password " + "\"" + airline.getPassword() + "\"" + " is a palindrome.");
        }else{
            System.out.println("Your password " + "\"" + airline.getPassword() + "\"" + " is not a palindrome.");
        }
        System.out.println("------------------------------------------------");
        airline.enterMenu();
        System.out.println("Thank you, " + airline.getName() + "!");
        System.out.println("We hope you'll choose " + airlineName + " again! Have a great day.");
    }
}

