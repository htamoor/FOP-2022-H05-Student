package h05;

public abstract class Animal {

    protected AnimalType animalType;

    public AnimalType getAnimalType() {
        return animalType;
    }

    public abstract String letMeMove();

    @Override
    public String toString() {
        return String.format("My species is called %s which is part of animal type %s.",
            getClass().getSimpleName(),
            animalType == null ? "Null" : animalType.name().substring(0, 1) + animalType.name().substring(1).toLowerCase());
    }
}
