package Lecture11.animal;

public abstract class Animal {
    private boolean isBaby;

    public Animal(boolean isBaby) {
        this.isBaby = isBaby;
    }

    public boolean isBaby() {
        return isBaby;
    }

    public void setBaby(boolean baby) {
        isBaby = baby;
    }

    public abstract void animalSound();

    @Override
    public String toString() {
        return "Animal{" +
                "isBaby=" + isBaby +
                '}';
    }
}
