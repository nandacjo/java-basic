import java.util.Scanner;

public class ForgetfulMachine {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What city is the capital on Indonesia");
    keyboard.next();

    System.out.println("What is multiplied by?? ");
    keyboard.nextInt(0);

    System.out.println("Enter a number between 0.0 and 0.1? ");
    keyboard.nextDouble();

    System.out.println("Is there anything else you would like to say ?");
    keyboard.next();
  } 
}
