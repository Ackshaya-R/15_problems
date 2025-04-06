import java.util.*;
public class Maximumsubarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int currentsum=0;
        int maxsum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            currentsum+=arr[i];

            if(currentsum>maxsum)
            {
                maxsum=currentsum;
            }

            if(currentsum<0)
            {
                currentsum=0;
            }
        }
        System.out.print(maxsum);
    }
}
