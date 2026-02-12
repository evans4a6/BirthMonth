import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String enterPlease = "What is your birth month [1-12]?: ";

        System.out.print(enterPlease);
        birthMonth = in.nextInt();

        if (birthMonth <= 12 && birthMonth >= 1) {
            System.out.println("Your birth month is " + birthMonth);
        } else {
            System.out.println("\nYou entered an invalid month of " + birthMonth);
            System.out.println("Please try the program again");
        }

    }
}