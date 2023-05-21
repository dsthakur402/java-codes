import java.util.Scanner;

public class transpose__matrix 
{
    public static void transpose(int matrix[][])
    {
        int row=matrix.length,column=matrix[0].length;

        int[][] transpose = new int[column][row];
        for(int i = 0; i<row; i++) 
        {
            for (int j = 0; j<column; j++) 
             {   
                transpose[j][i] = matrix[i][j];
             }
        }
        System.out.println();
        System.out.println("your given matrix is:");
        for(int i = 0; i<row; i++)
        {
            for(int j = 0; j<column; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("transpose of matrix is ");
        for(int i = 0; i<column; i++)
        {
            for(int j = 0; j<row; j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enetr no. of row :");
        int row=sc.nextInt();
        System.out.print("enetr no. of column:");
        int column=sc.nextInt();
        int matrix[][]=new int[row][column];
        for (int i=0;i<row;i++)
        {
            for(int j = 0; j<column; j++)
            {
                System.out.print("enter matrix["+i+"]["+j+"]:");
                matrix[i][j]=sc.nextInt();
            }
        }
      

        transpose(matrix);
    }    
}
