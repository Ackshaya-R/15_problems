import java.util.*;
public class union
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int[] newarr=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            newarr[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++)
        {
            newarr[j+n]=arr2[j];
        }
        for(int num:newarr)
        {
            System.out.print(num+" ");
        }
    }
}
