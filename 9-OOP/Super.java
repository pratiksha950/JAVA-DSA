// public class Super {
//     public static void main(String[] args) {
//         Horse h=new Horse();
//         System.out.println( h.color);
//     }
// }
// class Animal{
//     String color;
//     Animal(){
//         System.out.println("Animal Constructor called");
//     }
// }

// class Horse extends Animal{
//     Horse(){
//         super.color="red";
//         System.out.println("Horse Constructor called");
//     }
// }

// ***2d program***

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats");
    }

    void display() {
        super.eat(); // calls parent method
    }
}

public class Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}