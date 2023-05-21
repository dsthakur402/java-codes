public class shortest_path 
{
    public static int shortestpath(String dir)
    {
        int n = dir.length()-1; 
        int x=0,y=0;   
        for(int i=0;i<=n;i++)
        {
            if(dir.charAt(i)=='E')
            {
              x++;
            }
            else if(dir.charAt(i)=='W')
            {
              x--;
            }
            else if(dir.charAt(i)=='N')
            {
              y++;
            }
            else
            {
              y--;
            }
        }
       
        int dis=(int)Math.sqrt(x*x+y*y);
        return dis;
    }
    public static void main(String[] args) 
    {
        String dir="WNEENESENNN";
        int ans=shortestpath(dir);
        System.out.println("The shortest path is "+ans);
        

    }
}
