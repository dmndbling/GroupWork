import java.util.*;
public class C7_26 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter list 1: ");
        int[] list1 = new int[input.nextInt()];
        
        for(int i = 0; i < list1.length; i++)
        {
            list1[i] = input.nextInt();
        }
        
        System.out.println("\nEnter list 2: ");
        int[] list2 = new int[input.nextInt()];
                
        for(int i = 0; i < list2.length; i++)
        {
            list2[i] = input.nextInt();
        }
        
        boolean equals = equals(list1, list2);
        
        if(equals == true)
            System.out.println("\nTwo lists are strictly identical.");
        
        else if(equals == false)
            System.out.println("\nTwo lists are not strictly identical.");
    }
    
    public static boolean equals(int[] list1, int[] list2)
    {
        if(Arrays.equals(list1, list2))
            return true;
        
        else
            return false;
    }
}