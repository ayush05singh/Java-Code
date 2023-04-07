import java.util.*;


public class loopques3 
{
    public static void main(String arg[])

    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a Number = ");
        String str=sc.nextLine();
        
        char c;
        for(int i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            switch(c)
            {
                case '0':System.out.print("Zero ");
                        break;
                case '1':System.out.print("One ");
                        break;
                case '2':System.out.print("Two ");
                        break;
                case '3':System.out.print("Three ");
                        break;
                case '4':System.out.print("Four ");
                        break;
                case '5':System.out.print("Five ");
                        break;
                case '6':System.out.print("Six ");
                        break;
                case '7':System.out.print("Seven ");
                        break;
                case '8':System.out.print("Eight ");
                        break;
                case '9':System.out.print("Nine ");
                        break;
                       
            }
   // ----------------------------------------------------------------------------------------------------------- //
   
//         System.out.println("Enter value of 'a' = ");
//         int a = sc.nextInt();
//         System.out.println("Enter value of 'd' = ");
//         int d = sc.nextInt();
//         System.out.println("Enter value of 'n' = ");
//         int n = sc.nextInt();

//         for ()





            sc.close();

        }
    }
    
}

