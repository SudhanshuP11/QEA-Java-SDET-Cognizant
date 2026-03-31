package qea.QualifierPracticeQue.ClassOOPS;

class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("Dog sound");
    }
}
class Cat extends Animal {
    void sound(){
        System.out.println("Cat sound");
    }
}
public class classAnimalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
    }
}