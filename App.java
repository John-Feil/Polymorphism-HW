package polymorphism;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Dog();
        Poodle poodle = new Poodle();

        Interrogator.convinceToTalk(dog);
        Interrogator.convinceToTalk(cat);
        Interrogator.convinceToTalk(animal);
        Interrogator.convinceToTalk(poodle);
    }
}
