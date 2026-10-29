public class backTracking {
  public static  void changeArr(int arr[], int i, int val){
//base casw
if (i==arr.length){
 printArr(arr);
 System.out.println();
 return ;
}

//recursion
   arr[i] = val;
   changeArr(arr, i+1, val+1);
   arr[i] = arr[i]-2; //backtracking
  }
  public static void printArr(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }  
  }


  public static void findSubsets(String str, String ans, int i){
    //baseCase
    if(i== str.length()){
        System.out.println(ans);
        return;
    }
    //yes
   findSubsets(str, ans+str.charAt(i), i+1);
    //no
    findSubsets(str, ans, i+1);
  }
     //tc- O(n*n!)
   public static void findPermutation(String str, String ans){
   //base case
     if(str.length()==0){
      System.out.println(ans);
      return ;
     }
   //recursion
   for(int i=0;i<str.length();i++){
    char curr = str.charAt(i);
    //"abcd" => "a"+"cd" = "acd"
   String Newstr = str.substring(0,i) + str.substring(i+1);
    findPermutation(Newstr, ans+curr);
   }
  }

  public static boolean isSafe(char board[][], int row, int col){
    
    //vertical up
    for(int i =row-1;i>=0;i--){
      if(board[i][col]=='Q'){
        return  false;
      }
    }
    
    //diag left up
  for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
    if(board[i][j]=='Q'){
      return false;
    }
  }
    //diag right up
    for(int i=row-1,j=col+1;i>=0 &&j<board.length;i--,j++){
       if(board[i][j]=='Q'){
        return  false;
       }
    }
    return true;
  }
//tc - O(n!)
static int count =0;
public static boolean nQueens(char board[][], int row){
//base

if(row==board.length){
//  printBoard(board);
 count ++;
 return  true ;
}

  for (int j=0;j<board.length;j++){
   if(isSafe(board, row, j)) {
    board[row][j] = 'Q'; 
   if(nQueens(board, row+1)){
     return true;
   }
    board[row][j]='x';//backtracking}
  }}
   return false;
}

 public static  void printBoard(char board[][]){
  System.out.println("-----chessBoard-----");
  for (int j=0;j<board.length;j++){
    for(int k=0;k<board.length;k++){
      System.out.print(board[j][k]+" ");
    }
    System.out.println();
  }

}

//Grid ways -- right or down move, tc - O(2^n) use permutation
public  static int gridWays(int i, int j, int n,int m){
 //basecase
 if(i==n-1&& j==m-1){
  return 1;
 } else if(i==n || j==n){
    return 0;
 }

  int w1 = gridWays(i+1, j, n, m);
  int w2 = gridWays(i, j+1, n, m);
  return w1+w2;
}

public static boolean isSafe(int sudoku[][],int row,int col,int digit){
  //row check
  for(int i=0;i<=8;i++){
    if(sudoku[row][i]==digit){
      return false;
    }
  }
  //col check
   for(int j=0;j<=8;j++){
    if(sudoku[j][col]==digit){
      return false;
    }
  }

  // grid check startingRow = (row/3)*3 , startingCol = (col/3)*3

  int startingRow = (row/3)*3;
  int startingCol = (col/3)*3;

  for(int i=startingRow;i<startingRow+3;i++){
    for(int j=startingCol;j<startingCol+3;j++){
      if(sudoku[i][j]==digit){
        return false;
      }
    }
  }
  return true;
}

//Sudoku
 public static boolean sudokuSolver(int sudoku[][], int row, int col){
  //baseCase
  if(row==9 && col==0){
    return  true;

  }

  //recursion
  int nextRow = row, nextCol = col+1;
  if(col+1==9){
    nextRow = row+1;
    nextCol= 0;
  }

  if(sudoku[row][col] !=0){
  return  sudokuSolver(sudoku, nextRow, nextCol);
  }

  for(int digit=1; digit<=9; digit++){
     if(isSafe(sudoku,row,col,digit)){
       sudoku[row][col] = digit;
       if( sudokuSolver(sudoku, nextRow, nextCol)){
         return true;
      }
      sudoku[row][col] = 0;
     }
  }
 
  return  false;
 }

 public static void printSudoku(int sudoku[][]){
  for(int i=0;i<9;i++){
    for(int j=0;j<9;j++){
      System.out.print(sudoku[i][j]+ " ");
    }
    System.out.println();
  }
 }


    public static void main(String args[]){
   int arr[] = new int[5];
//    changeArr(arr, 0, 0);
//    printArr(arr);

   String str = "xyz";
  //  findSubsets(str, "", 0);
 
  // findPermutation(str, "");

  int n=2;
  char board[][] = new char[n][n];
  //initialize
  for(int i=0;i<n;i++){
    for (int j=0;j<n;j++){
      board[i][j] = 'x';
    }
  }

//  if (nQueens(board,0)){
//   System.out.println("solution possible");
//   printBoard(board);
//  }else{
//    System.out.println("solutionnot possible");
//  }
// System.out.print("total ways to solve n-queens = "+ count);



// int x=3, m =3;
// System.out.println(gridWays(0, 0, x, m));


int sudoku[][] ={
    {5,3,0,0,7,0,0,0,0},
    {6,0,0,1,9,5,0,0,0},
    {0,9,8,0,0,0,0,6,0},
    {8,0,0,0,6,0,0,0,3},
    {4,0,0,8,0,3,0,0,1},
    {7,0,0,0,2,0,0,0,6},
    {0,6,0,0,0,0,2,8,0},
    {0,0,0,4,1,9,0,0,5},
    {0,0,0,0,8,0,0,7,9}
};

if(sudokuSolver(sudoku, 0, 0)){
  System.out.println("solution exists");
  printSudoku(sudoku);
}else{
   System.out.print("solution doesnot exist");
}

    }
}
