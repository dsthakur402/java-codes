public class equals_function 
{
 public static void main(String[] args) 
 {
   String str1="hello";
   String str3 = "hello";
   String str2=new String("hello");
   if(str1.equals(str3))
   {
    System.out.println("Strings are equal");
   }
   else
   {
    System.out.println("Strings are not equal");
   }

 }    
}
