import java.util.*;
public class Removeduplicates
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
        Set<Integer> Unique=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            Unique.add(arr[i]);
        }
        System.out.print(Unique);
    }
}
