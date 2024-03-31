package h05;

public class SaltWaterCrocodileAsAmphibean implements Amphibean {
    private SaltWaterCrocodile salty;

    public SaltWaterCrocodileAsAmphibean(Animal animal) {
        if (animal instanceof SaltWaterCrocodile) {
            salty = (SaltWaterCrocodile) salty;
        }
    }


    public EnvironmentType getPreferredEnvironmentType() {
        return EnvironmentType.IN_WATER;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj != null && obj instanceof SaltWaterCrocodileAsAmphibean)
            && salty == ((SaltWaterCrocodileAsAmphibean) obj).salty;
    }


    public byte getNumberOfLegs() {
        return salty.getNumberOfLegs();
    }


    public double getAverageSpeed(double distance) {
        return salty.getAverageSpeed(distance);
    }

    public boolean canLiveInSaltWater() {
        return salty.canLiveInSaltWater();
    }



    public boolean canLiveInFreshWater() {
        return salty.canLiveInFreshWater();
    }

    @Override
    public void letMeSwim(char distance, double x, double y) {
        salty.letMeSwim(distance, x, y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new SaltWaterCrocodileAsAmphibean(salty);
    }
}
