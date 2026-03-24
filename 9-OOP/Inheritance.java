//***Single inheritance***
// public class Inheritance {
//     public static void main(String[] args) {
//         Fish f=new Fish();
//         f.eat();
//     }
// }
// //base class
// class Animal{
//     void eat(){
//         System.out.println("animal is eating");
//     }
//     void breath(){
//         System.out.println("breath");
//     }
// }
// //child class
// class Fish extends Animal { 
//     void swim(){
//         System.out.println("swim");
//     }
// }

//***Multilevel inheritance***
// public class Inheritance {
//     public static void main(String[] args) {
//         Fish f=new Fish();
//         f.eat();
//         Dog d=new Dog();
//         d.eat();
//         d.legs=4;
//         System.out.println( d.legs);
//     }
// }
// //base class
// class Animal{
//     void eat(){
//         System.out.println("animal is eating");
//     }
//     void breath(){
//         System.out.println("breath");
//     }
// }
// //child class
// class Fish extends Animal { 
//     void swim(){
//         System.out.println("swim");
//     }
// }

// class Mammels extends Animal { 
//     int legs;
// }
// class Dog extends Mammels{
//     String breed;
// }

//***Hierarchical inheritance***
// public class Inheritance {
//     public static void main(String[] args) {
//         Fish f=new Fish();
//         f.eat();
//     }
// }
// //base class
// class Animal{
//     void eat(){
//         System.out.println("animal is eating");
//     }
//     void breath(){
//         System.out.println("breath");
//     }
// }
// //child class
// class Fish extends Animal { 
//     void swim(){
//         System.out.println("swim");
//     }
// }

// class Mammels extends Animal { 
//     void walk(){
//         System.out.println("walk");
//     }
// }
// class Bird extends Animal { 
//     void fly(){
//         System.out.println("fly");
//     }
// }

//***Hybrid Inheritance***/
// Hybrid Inheritance Example

// Parent 
// interface Animal {
//     void eat();
// }

// // Second Parent 
// interface Pet {
//     void play();
// }

// // Child Class (Multilevel + Multiple)
// class Dog implements Animal, Pet {

//     public void eat() {
//         System.out.println("Dog eats food");
//     }

//     public void play() {
//         System.out.println("Dog plays with ball");
//     }

//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// // Another Child Class (Hierarchical)
// class Cat implements Animal {

//     public void eat() {
//         System.out.println("Cat eats fish");
//     }

//     void meow() {
//         System.out.println("Cat meows");
//     }
// }

// // Main Class
// public class Inheritance {

//     public static void main(String[] args) {

//         Dog d = new Dog();
//         d.eat();
//         d.play();
//         d.bark();

//         Cat c = new Cat();
//         c.eat();
//         c.meow();
//     }
// }

//sample
// public class Inheritance {

//     public static void main(String[] args) {
//         Queen Q=new Queen();
//         Q.moves();
//     }
// }
// interface chessPlayer{
//     void moves();
// }
// class Queen implements chessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,digonal(in all direction");
//     }
// }
// class Rook implements chessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right");
//     }
// }
// class King implements chessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right,digonal(in 1 step");
//     }
// }

// ***Multiple inheritance (Interface code)***
interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Omnivore implements Herbivore, Carnivore {

    public void eatPlants() {
        System.out.println("Eats plants");
    }

    public void eatMeat() {
        System.out.println("Eats meat");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Omnivore bear = new Omnivore();

        bear.eatPlants(); 
        bear.eatMeat();   
    }
}