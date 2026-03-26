// // ***Print the number in decresing order
// public class Recursion {
//     public static void Recursion(int n) {
//         //base case
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n+" ");
//         Recursion(n-1);
       
//     }
//     public static void main(String[] args) {
//         int n=10;
//         Recursion(n);
//     }
    
// }

// ***Print the number in decresing order
// public class Recursion {
//     public static void Recursion(int n) {
//         //base case
//         if(n==1){
//             System.out.print(n+" ");
//             return;
//         }
//         Recursion(n-1);
//         System.out.print(n+" ");
       
//     }
//     public static void main(String[] args) {
//         int n=10;
//         Recursion(n);
//     }
    
// }

// ***Factorial of number***
// public class Recursion {
//     public static int Factorial(int n) {
//        if(n==0){
//         return 1;
//        }
//        int  fact=n*Factorial(n-1);
//        return fact;
//     }
//     public static void main(String[] args) {
//         int n=5;
//         System.out.println(Factorial(n));
//     }
    
// }

// ***Print first N natural number Sum***
// public class Recursion {
//     public static int NaturalSum(int n) {
//         if(n==1){
//            return 1;
//         }
//         int sum=NaturalSum(n-1);
//         int res=n+sum;

//        return res;
//     }
//     public static void main(String[] args) {
//         int n=5;
//        System.out.println(NaturalSum(n));
//     }
    
// }

// ***Print nth term Fibonacci***
// public class Recursion {
//     public static int Fibonacci(int n) {
//         if(n==1 || n==0){
//            return n;
//         }
//         int fib=Fibonacci(n-1)+Fibonacci(n-2);
//         return fib;
//     }
//     public static void main(String[] args) {
//         int n=25;
//         System.out.println(Fibonacci(n));//print nth term
//       for (int i = 0; i < n; i++) {
//             System.out.print(Fibonacci(i) + " ");//print all term
//         }
//     }
    
// }

// ***check array is sorted or not***
// public class Recursion {
//     public static boolean isSorted(int arr[],int i) {
//        if(i==arr.length-1){
//         return true;
//        }
//        if(arr[i]>arr[i+1]){
//         return false;
//        }
//        return isSorted(arr,i+1);
//     }
//     public static void main(String[] args) {
//         int arr[]={9,1,2,3,4,5};
//         System.out.println(isSorted(arr,0));
// }
// }

// ***Finding first Occurance in an array of an element***
// public class Recursion {
//     public static int Occurance(int arr[],int i,int key) {
//         if(i==arr.length){
//             return -1;
//         }
//         if(arr[i]==key){
//             return i;
//         }
//        return Occurance(arr,i+1,key);
       
//     }
//     public static void main(String[] args) {
//         int arr[]={9,1,2,3,4,5};
//         System.out.println(Occurance(arr,0,5));
// }
// }

// ***Finding last Occurance in an array of an element***written by me
// public class Recursion {
//     public static int Occurance(int arr[],int n,int key) {
//        if(n<0){
//         return -1;
//        }
//         if(arr[n]==key){
//             return n;
//         }
//        return Occurance(arr,n-1,key);
       
//     }
//     public static void main(String[] args) {
//         int arr[]={-1,9,1,5,4,5,8,6,5};
//         int n=arr.length-1;
//         System.out.println(Occurance(arr,n,-1));
// }
// }

// ***finding Power (x to power n)***
// public class Recursion {
//     public static int Power(int x,int pow) {
//        if(pow==0){
//         return 1;
//        }
//       return x * Power(x,pow-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(Power(2,2));
// }
// }

// ***finding Power (x to power n) Optimized version having time complexity O(logn)***
public class Recursion {
    public static int OptimizedPower(int x,int pow) {
       if(pow==0){
        return 1;
       }

       int halfPow=OptimizedPower(x,pow/2);
      int halfPowSq=halfPow*halfPow;

      //n is odd
      if(pow%2!=0){
        halfPowSq=x*halfPowSq;
      }
      return halfPowSq;
    }
    public static void main(String[] args) {
        System.out.println(OptimizedPower(2,10));
}
}