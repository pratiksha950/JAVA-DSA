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
public class oop {

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Atharv");
        Student s3=new Student(23);
    }
}
class Student{
    String name;
    int roll;
    Student(){
       System.out.println("non parameterized constructor is called");
    }
     Student(String name){
       this.name=name;
    }
     Student(int roll){
       this.roll=roll;
    }

}