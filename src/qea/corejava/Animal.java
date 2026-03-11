package qea.corejava;

public class Animal {
    void sound(){
        System.out.println("I am an animal");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("I am a dog");
    }

}
class Test{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
