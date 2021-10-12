public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Morzsi", 4);
        Cat cat = new Cat("Cirmi", 2);
        Bird bird = new Bird("Gyurika", 1);

        System.out.println("--DOG--");
        dog.eat();
        dog.drink();
        dog.bark();
        System.out.println();

        System.out.println("--CAT--");
        cat.eat();
        cat.drink();
        cat.meow();
        System.out.println();

        System.out.println("BIRD");
        bird.eat();
        bird.drink();
        bird.chirp();
        System.out.println();


        AnimalHospital animalHospital = new AnimalHospital();
        animalHospital.animals.add(dog);
        animalHospital.animals.add(cat);
        animalHospital.animals.add(bird);

        animalHospital.list();









    }
}
