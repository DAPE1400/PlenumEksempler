package Lecture12.animal;

public abstract class Animal implements AnimalSoundProvider{
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

    @Override
    public String toString() {
        return "Animal{" +
                "isBaby=" + isBaby +
                '}';
    }
}
