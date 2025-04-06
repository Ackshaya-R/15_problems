import java.util.*;
public class Majorityelement
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
        Arrays.sort(arr);
        int middle=arr[arr.length/2];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==middle)
            {
                count++;
            }
        }
        if(count>arr.length/2)
        {
            System.out.println(middle);
        }
        else
        {
            System.out.println("No majority element");
        }
    }
}
