import java.util.*;
public class longestsubstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String temp="";
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            String ch=String.valueOf(s.charAt(i));

            if(temp.contains(ch))
            {
                temp=temp.substring(temp.indexOf(ch)+1);
            }
            temp+=ch;
            if(temp.length()>max)
            {
                max=temp.length();
            }
        }
        System.out.print(max);
    }
}
