import java.util.*;
public class regexpques
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter your e-mail = ");
        String email="ayush22@gmail.com";

        System.out.println(email.matches("\\w+@gmail\\.com"));
        sc.close();
        


    }
    
}
