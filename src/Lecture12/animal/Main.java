package Lecture12.animal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        //Animal a = new Animal(false);
        //animals.add(a);
        Cat cat = new Cat(false, "Keyboard");
        animals.add(cat);
        Dog dog1 = new Dog(true, "Schaefer");
        animals.add(dog1);
        for(Animal animal : animals){
            System.out.println(animal.toString());
            animal.animalSound();
        }
        System.out.println("----");
        ArrayList<AnimalSoundProvider> asps = new ArrayList<>();
        asps.add(cat);
        asps.add(dog1);
        for(AnimalSoundProvider asp : asps){
            asp.animalSound();
        }
    }
}
