public class staircase_search 
{
    public static boolean search(int matrix[][],int key)
    {
        int row=matrix.length-1,col=0;
        while(row>=0&&col<matrix[0].length-1)
        {
            if(key==matrix[row][col])
            {
                System.out.println(key+"found at index : ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col])
            {
                row--;
            }
            else
            {
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
  public static void main(String[] args) 
  {
     int matrix[][]= {{10,20,30,40},
                      {15,25,35,45},
                      {27,29,37,38,},
                      {33,55,65,75}};
    search(matrix,55);

    
  }  
}
