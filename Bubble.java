import java.util.*;
public class Bubble_Sort
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        int t=0;
        for (int i=0; i<10;i++)
        {
            System.out.println("Enter number: ");
            n[i]=sc.nextInt();
            
        }
        for (int i=0; i<9;i++)
        {
            for (int j=0;j<9-i;j++)
            {
                if ( n[j]>n[j+1])
                {
                    t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;
                }
            }
        }
        System.out.println("The sorted array in ascending order is :");
          for (int i=0; i<10;i++)
          
          {
              System.out.println(n[i]);
          }
    }
}
