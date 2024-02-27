import java.util.InputMismatchException;
import java.util.Scanner;


public class Exceptions {
    public static void main(String[] args) {
        //creates and array based on integers the user inputs
        double[] Array1 = new double[20];
        for (int x = 0; x < Array1.length; x++) {
            System.out.println("Please enter an integer ");
            Scanner yesandnoScanner = new Scanner(System.in);
            double Answer = yesandnoScanner.nextDouble();
            Array1[x] = Answer;

        }
        //prints out array
        System.out.println("The array is");
        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Array1[i]);
        }

        //asks the user to input a position from the array and it prints out the corresponding number
        try {
            System.out.println("Please enter a position and the corresponding number will print");
            Scanner positionScanner = new Scanner(System.in);
            int Number = positionScanner.nextInt();
            System.out.println("The Number in position of " + Number + " is " + Array1[Number]);

        //tells the user an error was made when entering the position in the array
        } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Array Index is out of bound, please enter a different number");

            }
        //tells the user an error was made with the entered value
        catch (InputMismatchException exception) {
            System.out.println("The number entered is not an integer, please try again");
        //tells the user an error was made with the entered value
        }
        catch (Exception exception) {
            System.out.println("The input does not work with this code, please try again");
        }






    }
}
