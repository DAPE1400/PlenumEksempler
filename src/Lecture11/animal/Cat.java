package Lecture11.animal;

public class Cat extends Animal{
    private String favouritePlace;

    public Cat(boolean isBaby, String favouritePlace) {
        super(isBaby);
        this.favouritePlace = favouritePlace;
    }

    public String getFavouritePlace() {
        return favouritePlace;
    }

    public void setFavouritePlace(String favouritePlace) {
        this.favouritePlace = favouritePlace;
    }

    @Override
    public void animalSound(){
        System.out.println("Miao");
    }
    @Override
    public String toString() {
        return "Cat{" +
                "favouritePlace='" + favouritePlace + '\'' +
                "} " + super.toString();
    }
}
