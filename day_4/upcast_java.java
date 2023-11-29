
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class upcast_java  {
    public static void main(String[] args) {
        
        Animal myAnimal = new Dog();
        myAnimal.makeSound(); 

       
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;
            myDog.bark(); 
        } else {
            System.out.println("Downcast failed");
        }
    }
}