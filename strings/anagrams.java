import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class anagrams
{
    public static void check(String str1 , String str2)
    {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length())
        {
            char[] str1chararry= str1.toCharArray();
            char[] str2chararry= str2.toCharArray();
            Arrays.sort(str1chararry);
            Arrays.sort(str2chararry);
            if(Arrays.equals(str1chararry,str2chararry))
            {
                System.out.println("anagrams");
            }
            else{
                System.out.println("not anagrams");
            }
           
        } else{
            System.out.println("not anagrams");
        }
    }
    public static void main(String[] args) 
    {
     System.out.print("input two strinmgs:\n 1:");
     Scanner sc=new Scanner(System.in);     
     String Str1=sc.next();
     System.out.print(" 2:");
     String Str2=sc.next();
     check(Str1,Str2);
    }
}