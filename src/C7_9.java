import java.util.*;
public class C7_9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double[] numbers = new double[10];
        
        System.out.println("Enter ten numbers: ");
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextDouble();
        }
        
        double minimum = min(numbers);
        
        System.out.println("\nThe minimum number is: " + minimum);
    }
    
    public static double min(double[] array)
    {
        Arrays.sort(array);
        double minimum = array[0];
        
        return minimum;
        
    }
}