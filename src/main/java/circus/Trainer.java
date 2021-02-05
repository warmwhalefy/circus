package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting duck becomes animal
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting animal becomes duck
        getToSpeak(d2);

        train(new Duck());
        train(new Parrot());
        // Animal a2 = new Animal(); abstract means cannot make an object animal
        // Bird b2 = new Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        Duck d = (Duck) bird;
        d.swim();
    }
}
