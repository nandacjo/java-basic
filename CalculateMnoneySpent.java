import java.util.Scanner;

public class CalculateMnoneySpent {
  public static void main(String[] args) {
    String name = "Nanda";
    Integer moneySpent = 0;
    Double average = 0.0;
    Integer total = 0;
    Integer totalDay = 7;

      try (Scanner inputUser = new Scanner(System.in)) {
        System.out.println("Hey, What is your name?");
        name = inputUser.next();

        System.out.println("How much mony did you spend at the club on monday?");
        moneySpent = inputUser.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Tuesday");
        moneySpent = inputUser.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Wednesday");
        moneySpent = inputUser.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Thursday");
        moneySpent = inputUser.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Friday");
        moneySpent = inputUser.nextInt();
        total += moneySpent;

         System.out.println("How much money did you spend at the club on Saturday");
        moneySpent = inputUser.nextInt();
        total += moneySpent;

        System.out.println("How much money did you spend at the club on Sunday");
        moneySpent = inputUser.nextInt();
      }

    
      total += moneySpent;

      average = (double) total / totalDay;


      System.out.println("The Calculation Result:");
      System.out.println("Hi " + name);
      System.out.println("Your total expenditure at the club this week is $ " + total);
      System.out.println("With an Average daily expenditure of $" + average);

    

  }
}
