import java.util.ArrayList;
import java.util.Scanner;

/* Name: Peter Vu
* Date: 03/27/2020
* Pledge
* Description:
* Input:
* Output:
*/
public class Airline {

    private String name, password, birthday, pin;

    /**
     * This method will take the password and check whether or not it is a palindrome
     * @param password The password the User input during account creation
     * @return Return True if the password is a palindrome and False otherwise
     */
    public boolean checkPalindrome(String password) {
        String lowerCasePass = password.toLowerCase(); //Ensure all characters will be in the same case to check equality

        char[] passAsChar = lowerCasePass.toCharArray();
        ArrayList<Character> passAsList = new ArrayList<>();
        for (char ele : passAsChar) {
            passAsList.add(ele);
        }

        if (passAsList.size() == 1) //A word with a length of 1 isn't a palindrome
            return false;

        int i = 0; //Instantiate a pointer for characters at the front of the word.

        //Iterate through the characters in the word starting at the end and moving towards the middle.
        for (int j = (passAsList.size() - 1); j > (passAsList.size() / 2); j--) {
            if (passAsList.get(i) != passAsList.get(j)) //If there is a pair of characters that isn't the same. It isn't a palindrome.
                return false;
            i++;
        }
        return true;
    }

    public void enterMenu(){
        boolean wantToQuit = false;
        do{
            System.out.println("1. Book a flight \n" +
                    "2. \n" +
                    "3. \n" +
                    "4. \n" +
                    "5. Quit");
            Scanner scan = new Scanner(System.in);
            switch (scan.nextLine()) {
                case ("1"):

                    break;
                case("2"):

                    break;
                case("3"):

                    break;
                case("4"):

                    break;
                case("5"):
                    wantToQuit = true;
                    break;
                default:
                    System.out.println("Input not valid. Try again.");
            }
        }while(!wantToQuit);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * Accessor method for the account's name
     * @return Return the name stored on the User's account
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method for the account's password
     * @return Return the password stored on the User's account
     */
    public String getPassword() {
        return password;
    }

    /**
     * Accessor method for the account's birthday
     * @return Return the birthday stored on the User's account
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Accessor method for the account's pin
     * @return Return the pin of the User's account
     */
    public String getPin() {
        return pin;
    }
}
