abstract class Animal {
    abstract void makeSound();
    
    void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class AbstructMethod {
    public static void main(String[] args) {
        
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.makeSound(); 
        dog.sleep();    
        
        cat.makeSound(); 
        cat.sleep();     
    }
}