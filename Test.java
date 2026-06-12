
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int n, arr[];
            System.out.print("Enter no. of elements: ");
            n = sc.nextInt();
            arr = new int[n];
            System.out.println("Enter elements: ");
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                /////////
            System.out.println("Sorted: ");
            for(int i = 0; i < n; i++)
                System.out.print(arr[i]+" ");
        }
        catch(Exception e)
        {
            System.out.println("Error occured: "+e);
        }  
    }   
}