//*** Basic code of strings***
// import java.util.*;
// public class Strings{
//     public static void demo(String str) {
//         for(int i=0;i<str.length();i++){
//             System.out.print(str.charAt(i)+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//        char arr[]={'a','b','c','d'};
//         String str1="abcd";
//         String str2=new String("xyz");
        
//         // Strings are immutable
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         System.out.println(name);

//         // **String Length***
//         String name1="om sai ram";
//         System.out.println(name1.length());
 
//         //**String concatanation**/
//         String strg1="pratu";
//         String strg2="salunke";
//         String fullName=strg1+" "+strg2;
//        System.out.println(fullName);  
//        System.out.println(fullName.charAt(0));  

//        demo(fullName);

// }
//  }

// // ***Check Number is palindrome or not***
// class Strings{
//     public static void Palindrome(int n) {
//         int original=n;
//         int rev=0;
//         while(n>0){
//             int last=n%10;
//             rev=rev*10+last;
//             n=n/10;
//         }
//         if(original==rev){
//             System.out.println("Number is palindrome");
//         }else{
//             System.out.println("Not a palindrome");
//         }
//     }
//     public static void main(String[] args) {
//         Palindrome(81);
//     }
// }

// ***Check Number is palindrome or not***
// class Strings{
//     public static boolean Palindrome(String str) {
//         for(int i=0;i<str.length()/2;i++){
//             if(str.charAt(i)!=str.charAt(str.length()-1-i)){               
//                 return false;
//             }
//         }
       
//         return true;
//     }
//     public static void main(String[] args) {
//         String str="racecar1";
//         System.out.println(Palindrome(str));
//     }
// }

// ***Direction Quetion(E,W,N,S)
// public class Strings {
//     public static float getPath(String path) {
//         int x=0;
//         int y=0;
//         for(int i=0;i<path.length();i++){
//             char dir=path.charAt(i);
//             //  South
//             if(dir=='S'){
//                 y--;
//             //North
//             }else if(dir=='N'){
//                 y++;
//             // East
//             }else if(dir=='W'){
//                 x--;
//              //West
//             }else if(dir=='E'){
//                 x++;
//             }
//         }
//         int X2=x*x;
//         int Y2=y*y;
//         return (float)Math.sqrt(X2+Y2);
//     }
//     public static void main(String[] args) {
//         String path="WNEENSENNN";  
//         System.out.println(getPath(path) );
//     }
// }

// ***String comparision***
// public class Strings {
//     public static void main(String[] args) {
//         String s1="om";
//         String s2="om";
//         String s3=new String("om");
//         if(s1==s2){
//             System.out.println("s1 and s2 are equal");
//         }else{
//             System.out.println("s1 and s2 are not equal");
//         }

//         if(s1==s3){
//             System.out.println("s1 and s2 are equal");
//         }else{
//             System.out.println("s1 and s2 are not equal");
//         }

//         if(s1.equals(s3)){
//             System.out.println("s1 and s3 are equal");
//         }else{
//             System.out.println("s1 and s3 are not equal");
//         }

//     }
// }

// ***SUBSTRING***
// public class Strings {
//     public static String SubString(String str,int si,int ei) {
//         String subStr="";
//         for(int i=si;i<ei;i++){
//             subStr +=str.charAt(i);
//         }
//         return subStr;
//     }
//     public static void main(String[] args) {
//         String str="PratikshaSalunke";
//         //inbuilt java function instead of write such code
//         System.out.println(str.substring(0,5));
//         System.out.println(SubString(str,0,5));
//     }
// }

// **Printing Largest String**Lexicographically(Alphabetical order)
// public class Strings {

//     public static void main(String[] args) {
//         String fruits[]={"Banana","kivi","apple","arange"};
//         String largest=fruits[0];
//         for(int i=0;i<fruits.length;i++){
//             if(largest.compareTo(fruits[i])<0){
//                 largest=fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }

// ***StringBuilder***
// public class Strings {

//     public static void main(String[] args) {
//         StringBuilder sb=new StringBuilder("");
//         for(char ch='a';ch<='z';ch++){
//             sb.append(ch);
//         }
//         System.out.println(sb);
//         System.out.println(sb.length());
//     }
// }

// // ***For given string convert each first letter of a word to uppercase***
// public class Strings {
//     public static String StrToUpper(String  str) {
//         StringBuilder sb=new StringBuilder("");
//         char ch=Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i=1;i<str.length();i++){
//             if(str.charAt(i)==' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String[] args) {
//         String str="hi my name is om";
//         System.out.println(StrToUpper(str));
//     }
// }

// ***string Compression***
public class Strings {
    public static String Compression(String  str) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aaabcddeef";
        System.out.println(Compression(str));
    }
}