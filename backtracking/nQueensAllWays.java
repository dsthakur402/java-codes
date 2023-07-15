public class nQueensAllWays {
    public static void nQueens(char board[][],int row){
        // base  case
        if(row==board.length){
            print(board);
            count++;
            return;
        }
        // 
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1);//function call
                board[row][j]='.';//backtracking step
            }
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        // vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            } 
        }
        // diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            } 
        }
        return true;

    }
    public static void print(char board[][]){
        System.out.println("-------------CHESS BOARD--------------");
       for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int n =4;
        char board[][]=new char[n][n];
        // Iinitialize
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
        nQueens(board,0);
        System.out.print("total no. of ways : "+count);
    }
    
}
 