import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Array {
    public static void main(String[] args) {

        double[] Array1 = new double[20];


        for (int x = 0; x < 20; x++) {
            System.out.println("Please enter a number.");
            Scanner yesandnoScanner = new Scanner(System.in);
            double Answer = yesandnoScanner.nextDouble();
            Array1[x] = Answer;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(Array1[i]);

        }



    }
}
