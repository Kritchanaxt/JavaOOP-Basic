class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void bark() {
        System.out.println("Dog barks loudly");
    }
}

public class ObjectCasting {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting
        System.out.println();
        animal.sound();

        if (animal instanceof Dog) {  // ตรวจสอบก่อน Downcasting
            Dog dog = (Dog) animal;   // Downcasting
            dog.bark(); 
        }
    }
}

