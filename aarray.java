import java.util.*;
public class aarray 
{
    public static void main(String[] args) 
    {
        int a[] = {14,9,7,8,12,6,15,5,4,10};
        // int sum = 0;

        // for(int i=0;i<=a.length-1;i++)
        // {
        //     sum = sum + a[i];
        // }
        // System.out.println("Sum of array element = "+sum);

// ----------------------------------------------------------------------------------------------- // 
        
        Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter key:");
    //     int key=sc.nextInt();
    //     int i;
    //     for(i=0;i<=a.length-1;i++)
    //     {
    //        if(key==a[i])
    //        {
    //             System.out.println("Match found at "+a[i]);
    //             System.exit(0);
    //        }
    //     }
    //    System.out.println("Error!!!");

// ------------------------------------------------------------------------------------------------- //



int max=a[0], smax=a[0];
// for(int i=0;i<=a.length-1;i++)
// {
//    if(max<a[i])
//    {
//         max=a[i];
//    }

// }
// System.out.println("Max = "+max);

for(int i=0;i<=a.length-1;i++)
{
   if(max<a[i])
   {
    smax=max;    
    max=a[i];
   }
   else if (smax<a[i])
   {
    smax=a[i];
   }

}
System.out.println("Max = "+smax);

    }
    
}
