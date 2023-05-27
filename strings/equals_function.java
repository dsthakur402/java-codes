public class equals_function 
{
 public static void main(String[] args) 
 {
   String str1="hello";
   String str2=new String("hello");
   if(str1.equals(str2))
   {
    System.out.println("Strings are equal");
   }
   else
   {
    System.out.println("Strings are not equal");
   }

 }    
}
