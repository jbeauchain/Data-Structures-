import java.math.BigDecimal;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MoneyConverter {
    public static void main(String[] args) {

        //adding text and inputting a string
        System.out.println("Welcome to Jenna's Concession Stand.");
        System.out.println("What would you like to buy something or make change? Please type 'buy something' or 'make change'.");
        Scanner yesandnoScanner = new Scanner(System.in);
        String Answer = yesandnoScanner.nextLine();

        //initializing variables
        String str4 = "buy something";
        String str5 = "make change";

        if (Answer.equals(str4)) {

            System.out.println("Please type one of the following: 'Pizza' $4, 'Burger' $5, or 'Grilled Cheese' $4.50");
            Scanner stringScanner = new Scanner(System.in);
            String Fooditem = stringScanner.nextLine();

            //initializing variables
            String str1 = "Burger";
            String str2 = "Pizza";
            String str3 = "Grilled Cheese";
            double Amount = 0.00;

            //if statements for the fooditems
            if (Fooditem.equals(str1)) {
                Amount = 5.00;
            }

            if (Fooditem.equals(str2)) {
                Amount = 4.00;
            }

            if (Fooditem.equals(str3)) {
                Amount = 4.50;
            }

            //inputting the money given to pay for the food item picked
            Scanner sv = new Scanner(System.in);
            System.out.print("How much money are you paying with? ");
            double NumberofMoney = sv.nextDouble();

            //calculating the change and printing it
            double NumberofDollars = ((NumberofMoney - Amount) * 100 / 100);


            //printing money given, change, and change in coins
            System.out.println("Amount of Money paying with: " + NumberofMoney);
            System.out.println("Change: " + NumberofDollars);
            System.out.println("Your change in coins:  ");


            //Calculating the number of quarters in the change and printing it
            int NumberofQuarters = (int) Math.floor(NumberofDollars / 0.25);
            double Moneyleft1 = Math.round((NumberofDollars - (NumberofQuarters * 0.25)) * 100.0) / 100.0;
            if (NumberofQuarters > 1) {
                System.out.println(NumberofQuarters + " Quarters");
            }
            if (NumberofQuarters == 1) {
                System.out.println(NumberofQuarters + " Quarter");
            }

            //Calculating the number of dimes in the change and printing it
            int NumberofDimes = (int) Math.floor(Moneyleft1 / 0.10);
            double Moneyleft2 = Math.round((Moneyleft1 - (NumberofDimes * 0.10)) * 100.0) / 100.0;
            if (NumberofDimes > 1) {
                System.out.println(NumberofDimes + " Dimes");
            }
            if (NumberofDimes == 1) {
                System.out.println(NumberofDimes + " Dime");
            }

            //Calculating the number of nickels in the change and printing it
            int NumberofNickels = (int) Math.floor(Moneyleft2 / 0.05);
            double Moneyleft3 = Math.round((Moneyleft2 - (NumberofNickels * 0.05)) * 100.0) / 100.0;
            if (NumberofNickels > 1) {
                System.out.println(NumberofNickels + " Nickels");
            }
            if (NumberofNickels == 1) {
                System.out.println(NumberofNickels + " Nickel");
            }

            //Calculating the number of Pennies in the change
            int NumberofPennies = (int) ((Moneyleft3 * 100) * 100 / 100);


            //Printing the number of pennies in the change
            if (NumberofPennies > 1) {
                System.out.println(NumberofPennies + " Pennies");
            }
            if (NumberofPennies == 1) {
                System.out.println(NumberofPennies + " Penny");
            }

        }

        if (Answer.equals (str5)) {
            Scanner sv = new Scanner(System.in);
            System.out.print("How much money would you like to make into change? ");
            double NumberofMoney = sv.nextDouble();


            //printing money given, change, and change in coins
            System.out.println("Change: " + NumberofMoney);
            System.out.println("Your change in coins:  ");

            //Calculating the number of quarters in the change and printing it
            int NumberofQuarters = (int) Math.floor(NumberofMoney / 0.25);
            double Moneyleft1 = Math.round((NumberofMoney - (NumberofQuarters * 0.25)) * 100.0) / 100.0;
            if (NumberofQuarters > 1) {
                System.out.println(NumberofQuarters + " Quarters");
            }
            if (NumberofQuarters == 1) {
                System.out.println(NumberofQuarters + " Quarter");
            }

            //Calculating the number of dimes in the change and printing it
            int NumberofDimes = (int) Math.floor(Moneyleft1 / 0.10);
            double Moneyleft2 = Math.round((Moneyleft1 - (NumberofDimes * 0.10)) * 100.0) / 100.0;
            if (NumberofDimes > 1) {
                System.out.println(NumberofDimes + " Dimes");
            }
            if (NumberofDimes == 1) {
                System.out.println(NumberofDimes + " Dime");
            }

            //Calculating the number of nickels in the change and printing it
            int NumberofNickels = (int) Math.floor(Moneyleft2 / 0.05);
            double Moneyleft3 = Math.round((Moneyleft2 - (NumberofNickels * 0.05)) * 100.0) / 100.0;
            if (NumberofNickels > 1) {
                System.out.println(NumberofNickels + " Nickels");
            }
            if (NumberofNickels == 1) {
                System.out.println(NumberofNickels + " Nickel");
            }

            //Calculating the number of Pennies in the change
            int NumberofPennies = (int) ((Moneyleft3 * 100) * 100 / 100);


            //Printing the number of pennies in the change
            if (NumberofPennies > 1) {
                System.out.println(NumberofPennies + " Pennies");
            }
            if (NumberofPennies == 1) {
                System.out.println(NumberofPennies + " Penny");
            }

        }















    }
}