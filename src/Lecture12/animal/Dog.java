package Lecture12.animal;

public class Dog extends Animal {
    private String breed;

    public Dog(boolean isBaby, String breed) {
        super(isBaby);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
    @Override
    public void animalSound(){
        if(isBaby()){
            System.out.println("Voff voff");
        } else{
            System.out.println("VOFF VOFF!");
        }
    }
}
