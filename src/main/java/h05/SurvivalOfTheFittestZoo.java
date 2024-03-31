package h05;

public class SurvivalOfTheFittestZoo {

    public boolean canLiveTogether(Animal a, Animal b) {
        return isAllowed(a) && isAllowed(b);
    }

    public boolean isAllowed(Animal animal) {
        return animal.getAnimalType() != AnimalType.AVES;
    }
}
