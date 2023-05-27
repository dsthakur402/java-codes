import java.lang.StringBuilder;
public class compress_string 
{
    public static String compress(StringBuilder str)
    {
        // String newStr = "";
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0;i<str.length();i++)
        {
            Integer count =1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            // newStr+=str.charAt(i);
            sb.append(str.charAt(i));
            if(count>1)
            {
            //    newStr+=Integer.toString(count);
            sb.append(Integer.toString(count));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) 
    {
        StringBuilder str=new StringBuilder("aabbbbbcccccdddd");
        System.out.println(compress(str));

    }
    
}
