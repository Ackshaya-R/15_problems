import java.util.*;
public class Mostfrequent
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
        int maxcount=0;
        int mostfrequent=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>maxcount)
            {
                maxcount=count;
                mostfrequent=arr[i];
            }
        }
        System.out.print(mostfrequent);
    }
}
