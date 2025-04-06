import java.util.*;
public class secondlargest
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
        int fl=1;
        int sl=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>fl)
            {
                sl=fl;
                fl=arr[i];
            }
            else if(arr[i]>sl && arr[i]!=fl)
            {
                sl=arr[i];
            }
        }
        System.out.println(fl);
        System.out.println(sl);
    }
}
