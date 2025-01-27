package oops;
class Animal2{
    public void displayInfo(){
        System.out.println("I am an animal");
    }
}
class Dog1 extends Animal2{
    @Override
    public void displayInfo(){
        System.out.println("I am a dog");
    }
}
public class RunPoly {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.displayInfo();
    }
}
