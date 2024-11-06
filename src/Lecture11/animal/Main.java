package Lecture11.animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        //Animal a = new Animal(false);
        //animals.add(a);
        Cat cat = new Cat(false, "Keyboard");
        animals.add(cat);
        animals.add(new Dog(true, "Schaefer"));
        for(Animal animal : animals){
            System.out.println(animal.toString());
            animal.animalSound();
        }
    }
}
