//Basic code Getter and Setter method ,access specif ier
// public class oop {
//     public static void main(String[] args) {
//         Pen p=new Pen();//object created
//         p.setColor("red");
//         System.out.println(p.getColor());
//         p.setTip(78);
//         System.out.println(p.getTip());
//         p.setColor("blue");
//         System.out.println(p.getColor());
//     }
// }
// class Pen{
//     private String color;
//     private int tip;
//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//     void setColor(String newColor){
//         this.color=newColor;
//     }
//     void setTip(int tip){
//         this.tip=tip;
//     }
// }

// //Constructor overloading(example of polymorphism)
// public class oop {

//     public static void main(String[] args) {
//         Student s1=new Student();
//         Student s2=new Student("Atharv");
//         Student s3=new Student(23);
//     }
// }
// class Student{
//     String name;
//     int roll;
//     Student(){
//        System.out.println("non parameterized constructor is called");
//     }
//      Student(String name){
//        this.name=name;
//     }
//      Student(int roll){
//        this.roll=roll;
//     }

// }

//Copy Constructor 
// public class oop {

//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="kartik";
//         s1.roll=90;
//         s1.password="abcd";
//         s1.marks[0]=100;
//         s1.marks[1]=70;
//         s1.marks[2]=10;

//         Student s2=new Student(s1);
//         s2.password="xyz";
//         s1.marks[2]=30;

//         for(int i=0;i<3;i++){
//             System.out.println(s2.marks[i]);
//         }
        
//     }
// }
// class Student{
//     String name;
//     int roll;
//     String password;
//     int marks[];

//     //copy constructor
//     Student(Student s1){
//         marks=new int[3];
//         this.name=s1.name;
//         this.roll=s1.roll;
//         this.marks=s1.marks;
//     }
//     Student(){
//         marks=new int[3];
//        System.out.println("non parameterized constructor is called");
//     }
//      Student(String name){
//         marks=new int[3];
//        this.name=name;
//     }
//      Student(int roll){
//         marks=new int[3];
//        this.roll=roll;
//     }

// } 

//Shallow and deep copy
// public class oop {

//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="kartik";
//         s1.roll=90;
//         s1.password="abcd";
//         s1.marks[0]=100;
//         s1.marks[1]=70;
//         s1.marks[2]=10;

//         Student s2=new Student(s1);
//         s2.password="xyz";
//         s1.marks[2]=30;

//         for(int i=0;i<3;i++){
//             System.out.println(s2.marks[i]);
//         }
        
//     }
// }
// class Student{
//     String name;
//     int roll;
//     String password;
//     int marks[];

    //shallow copy constructor
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    //deep copy constructor
//     Student(Student s1){
//         marks=new int[3];
//         this.name=s1.name;
//         this.roll=s1.roll;
//         for(int i=0;i<marks.length;i++){
//             this.marks[i]=s1.marks[i];
//         }
//     }

//     Student(){
//         marks=new int[3];
//        System.out.println("non parameterized constructor is called");
//     }
//      Student(String name){
//         marks=new int[3];
//        this.name=name;
//     }
//      Student(int roll){
//         marks=new int[3];
//        this.roll=roll;
//     }

// } 

