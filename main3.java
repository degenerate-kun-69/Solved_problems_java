class Animals {

    // default or no-arg constructor of class Animal
    Animals() {
        System.out.println("I am an animal");
    }
}

class Dogs extends Animals {

    // default or no-arg constructor of class Dog
    Dogs() {

        // calling default constructor of the superclass
        super();

        System.out.println("I am a dog");
    }
}

class main3 {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs();
    }
}