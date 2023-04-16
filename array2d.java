public class array2d 
{
    public static void main(String arg[])
    {
        int a[][]=new int [2][2];
        a[0][0]=2;a[0][1]=14;
        a[1][0]=12; a[1][1]=22;

        for (int x[]:a)
        {
            for (int y:x)
            {
                System.out.print(y+",");
            }
            System.out.print("\n");
        }
    }
    
}
