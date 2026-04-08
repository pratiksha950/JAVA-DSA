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