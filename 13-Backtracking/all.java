/****Backtracking on array TC-O(n)***

public class all {
    public static void changedArray(int arr[],int i,int value) {
        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }

        //recursion
        arr[i]=value;
        changedArray(arr,i+1,value+1);
        arr[i]=arr[i]-2;
    }

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
    }
    public static void main(String[] args) {
    int arr[]=new int[5];
      changedArray(arr,0,1);
      printArr(arr);
    }
}
*/

/*Backtracking FOR finding subset 
public class all {
    public static void findSubArr(String str,String ans,int i) {
        //base case
        if(i== str.length()){
            if(ans.length() ==0){
                System.out.println("null");
            }else{
                 System.out.println(ans);
            
            }
            return;
           
        }
        //Yes choices
        findSubArr(str,ans+str.charAt(i),i+1);

        //No choices
        findSubArr(str,ans,i+1);

    }

    public static void main(String[] args) {
    String str="abc";
    findSubArr(str,"",0);
}
} */

/*Find Permutation code TC= O(n * n!)
public class all { 
    public static void findPermutation(String str,String ans) {
        //base case
       if(str.length()==0){
        System.out.println(ans);
        return;
       }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"="ab"+"de"
            String NewStr=str.substring(0,i)+str.substring(i+1);
             findPermutation(NewStr,ans+curr);
        }

    }

    public static void main(String[] args) {
    String str="abc";
    findPermutation(str,"");
}
}*/

//***"Check if problem can be solved & print only 1 solution to N Queens problem."***
/* Count  Queen */
public class all {
    //Queens program

    public static boolean isSafe(char board[][],int row,int col) {
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // digonal left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //right up
         for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char board[][],int row) {
        //base case
        if(row==board.length){
            //printBoard(board);
            count++;
            return true;
        }

       //coloum loop
        for(int j=0;j<board.length;j++){
           if(isSafe(board,row,j)){
             board[row][j]='Q';
           if(nQueens(board,row+1)){
            return true;
           }
            board[row][j]='x';//backtracking step
           }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("----chess board-----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count=0;
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];

        //initialization
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';    
               
            }
        }
        if( nQueens(board,0)){
           System.out.println("solution is possible ");
           printBoard(board);
        }else{
            System.out.println("solution is not possible");
        }
    }
}

