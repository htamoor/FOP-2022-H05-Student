package h05;

public class SaltWaterCrocodile extends Animal implements Walking, Swimming {
    private static double averageSpeed;

    public SaltWaterCrocodile() {
        animalType = AnimalType.CROCODYLIDAE;
    }

    public void setAverageSpeed(double averageSpeed) {
        SaltWaterCrocodile.averageSpeed = averageSpeed;
    }


    public String letMeMove() {
        String empty = new String("");
        return empty;
    }

    public byte getNumberOfLegs() {
        return 4;
    }

    public double getAverageSpeed(double distance) {
        return averageSpeed;
    }
    public boolean canLiveInSaltWater() {
        return true;
    }

    public boolean canLiveInFreshWater() {
        return true;
    }

    public void letMeSwim(char distance, double x, double y) {

    }
}
