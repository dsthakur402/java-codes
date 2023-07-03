public class removeDuplicates {
    public static void remove(String str,int indx,StringBuilder newStr,boolean map[])
    {
        // base case
        if(indx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(indx);
        if(map[currChar-'a']==true)
        {
            remove(str, indx+1, newStr, map);
        }
        else
        {
            map[currChar-'a']=true;
            remove(str,indx+1,newStr.append(currChar),map);
            
        }


    }
    public static void main(String[] args) {
        String str="apppnnnaacollegee";
        remove(str,0,new StringBuilder(""),new boolean[26]);
    }
}
