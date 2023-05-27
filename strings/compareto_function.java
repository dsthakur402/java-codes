public class compareto_function 
{
 public static void main(String[] args) 
 {
    String fruits[]={"mango","banana","apple"};
    String largest=fruits[0];
    int size=fruits.length;
    for (int i=0;i<size;i++)
    {
        if (fruits[i].compareTo(largest)>0)
        {
            largest=fruits[i];
        }
    }
    System.out.println(largest);
 }   
}
