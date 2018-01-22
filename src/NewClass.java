
import java.util.*;

public class NewClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of numbers that will be read: ");

        int amount = input.nextInt();
        int elements[] = new int[amount];

        fillArray(elements, input);
        System.out.print("Average: " + average(elements, amount));
        displayArray(elements);
    }
    //filling the array
    public static void fillArray(int[] elements, Scanner input) {
        System.out.print("Enter " + elements.length + " elements: ");
        for (int counter = 0; counter < elements.length; counter++) {          
            elements[counter] = input.nextInt();
        }
    }
    //average
    public static double average(int[] elements, int amount) {
        System.out.print("Enter " + elements.length + " elements: ");
        int total = 0;
        for (int counter = 0; counter < elements.length; counter++) {          
            total += elements[counter];
        }
        double average = total/amount;
        return average;
    }

    //print the array
    public static void displayArray(int[] elements) {
        System.out.print("\nThis is the contents of the array " + Arrays.toString(elements));
    }
}
//fill in the missing code