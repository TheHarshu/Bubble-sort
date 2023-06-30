import java.util.*; /*Importing the scanner package */
public class Bubble_Sort
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in); /*Creating the scanner object*/
        int n[] = new int[10]; /*Defining array(You can change the number of elements*/
        int t=0; /*Initialising a variable for passing the value*/
        
        for (int i=0; i<10;i++) /*Data entry loop*/
        {
            System.out.println("Enter number: ");
            n[i]=sc.nextInt();
            
        }
        
        /*Bubble sort process*/
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
        
        /*Printing the sorted array in ascending order*/
        System.out.println("The sorted array in ascending order is :");
          for (int i=0; i<10;i++)
          
          {
              System.out.println(n[i]);
          }
    }
}
