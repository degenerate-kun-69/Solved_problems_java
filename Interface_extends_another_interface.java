interface Animal {
    void eat();
}

interface Mammal extends Animal {
    void sleep();
}
class Dog implements Mammal {
    public void eat() {
        System.out.println("The dog is eating");
    }

    public void sleep() {
        System.out.println("The dog is sleeping");
    }
}
 class ClassChecker {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}