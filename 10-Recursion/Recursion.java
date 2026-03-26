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
public class Recursion {
    public static int Fibonacci(int n) {
        if(n==1 || n==0){
           return n;
        }
        int fib=Fibonacci(n-1)+Fibonacci(n-2);
        return fib;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(Fibonacci(n));
      for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }
    
}
