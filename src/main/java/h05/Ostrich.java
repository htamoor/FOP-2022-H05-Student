package h05;

public class Ostrich extends Animal implements Walking {

    private int distanceSoFar;

    public Ostrich() {
        animalType = AnimalType.AVES;
    }



    public int getDistanceSoFar() {
        return distanceSoFar;
    }

    @Override
    public String letMeMove() {
        return new String("Distance so far: " + ++distanceSoFar);
    }

    @Override
    public byte getNumberOfLegs() {
        return 2;
    }

    @Override
    public double getAverageSpeed(double distance) {
        if (distanceSoFar < 0.0) {
            return 0.0;
        }
        if (distanceSoFar <= 1.337) {
            return 6.900;
        } else if (distanceSoFar <= 4.200) {
            return 3.140;
        } else {
            return 1.000;
        }
    }
}
