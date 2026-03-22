// //Basic Program 
// public class Bit {
//     public static void main(String[] args) {
//         System.out.println(5&2);
//         System.out.println(~5);
//         System.out.println(5|2);
//         System.out.println(5<<2);
//         System.out.println(6>>1);
//     }
// }

// //Check number is odd or even Program 
// public class Bit {
//     public static void OddOrEven(int n) {
//         int BitMask=1;
//         if((n & BitMask)==0){
//             System.out.println("even");
//         }else{
//             System.out.println("odd");
//         }
        
//     }
//     public static void main(String[] args) {
//       OddOrEven(132);
//       OddOrEven(13);
//       OddOrEven(0);
//     }
// }

// //Get i-th bit
// public class Bit {
//     public static int GetIthBit(int n,int i) {
//        int bitMask=1<<i;
//        if((n & bitMask)==0){
//         return 0;
//        }else{
//         return 1;
//        }
        
//     }
//     public static void main(String[] args) {
//       System.out.println(GetIthBit(10,2));
//       System.out.println(GetIthBit(10,3));
//     }
// }

// //Set i-th bit
// public class Bit {
//     public static int SetIthBit(int n,int i) {
//       int bitMask=1<<i;
//       return n|bitMask;
//     }
//     public static void main(String[] args) {
//       System.out.println(SetIthBit(10,2));
     
//     }
// }

// //Clear i-th bit
// public class Bit {
//     public static int ClearIthBit(int n,int i) {
//       int bitMask=~(1<<i);
//       return n & bitMask;
//     }
//     public static void main(String[] args) {
//       System.out.println(ClearIthBit(10,1));
     
//     }
// }

//Update i-th bit
// public class Bit {
//     //set
//     public static int SetIthBit(int n,int i) {
//       int bitMask=1<<i;
//       return n|bitMask;
//     }
//     //clear
//     public static int ClearIthBit(int n,int i) {
//       int bitMask=~(1<<i);
//       return n & bitMask;
//     }
//     //update
//     public static int UpdateIthBit(int n,int i,int newBit) {
//     //First Approch
//     //   if(newBit==0){
//     //     return ClearIthBit(n,i);
//     //   }else{
//     //     return SetIthBit(n,i);
//     //   }
//     //Second Approch
//     n=ClearIthBit(n, i);
//     int bitMask=newBit<<i;
//     return n | bitMask;

//     }
//     public static void main(String[] args) {
//       System.out.println(UpdateIthBit(10,2,1));
     
//     }
// }

//Clear Last i-th bit
// public class Bit {
//     public static int ClearLastIthBit(int n,int i) {
//       int bitMask=(~0)<<i;
//       return n & bitMask;
//     }
//     public static void main(String[] args) {
//       System.out.println(ClearLastIthBit(15,2));
     
//     }
// }

// Clear range of bit
// public class Bit {
//     public static int ClearRangeBit(int n,int i,int j) {
//       int a=(~(0)<<(j+1));
//       int b=(1<<i)-1;
//       int bitMask=a|b;
//       return n & bitMask;
//     }
//     public static void main(String[] args) {
//       System.out.println(ClearRangeBit(10,2,4));
     
//     }
// }

// Check if a number is a power  of 2 or not
// public class Bit {
//     public static boolean IsPowerOfTwo(int n) {
//       return (n & (n-1))==0;
//     }
//     public static void main(String[] args) {
//       System.out.println(IsPowerOfTwo(8));
     
//     }
// }

//count set bit in a number
// public class Bit {
//     public static int count(int n) {
//       int count=0;
//       while(n>0){
//         if((n&1)!=0){
//           count ++;
//         }
//         n=n>>1;
//       }
//       return count;
//     }
//     public static void main(String[] args) {
//       System.out.println(count(10));
     
//     }
// }

//Fast exponentiation
public class Bit {
    public static int Fastexpo(int a,int n) {
      int ans=1;
      while(n>0){
        if((n&1) !=0){//check lsb
          ans=ans*a;
        }
        a=a*a;
        n=n>>1;
      }
      return ans;

    }
    public static void main(String[] args) {
      System.out.println(Fastexpo(3,5));
     
    }
}
