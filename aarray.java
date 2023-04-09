import java.util.*;
public class aarray 
{
    public static void main(String[] args) 
    {
        int a[] = {14,9,7,8,12,13,18,25,26,15};
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



// int max=a[0], smax=a[0];
// for(int i=0;i<=a.length-1;i++)
// {
//    if(max<a[i])
//    {
//         max=a[i];
//    }

// }
// System.out.println("First Max = " + max);

// for(int i=0;i<=a.length-1;i++)
// {
//    if(smax<a[i] && a[i]!=max)
//    {
//     smax=a[i];
//    }
  

// }

// System.out.println("Second Max = "+smax);

// ------------------------------------------------------------------------------------------------- //

      
        int temp2 = a[a.length-1];
        System.out.print("Original array: ");
        for(int x:a)
        {System.out.print(x+",");}

        int l=a.length-1;
        for(int i=a.length;i>1;i--)
        {
            a[l]=a[l-1];
            l--;
        }
        a[0]=temp2;
        System.out.println("");
       
        System.out.print("Shifted array: ");
        for(int x:a)
        {    
            System.out.print(x+",");
        }
        
        sc.close();

    }
    
}
