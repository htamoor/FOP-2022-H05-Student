package h05;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntConsumer;

public class Shark extends Animal implements Swimming, IntConsumer {


    private short specificSpecies;
    private int x;
    private int y;
    private int degreeOfHunger;

    public Shark(short specificSpecies) {
        setSpecificSpecies(specificSpecies);
        animalType = AnimalType.CHONDRICHTHYES;
        degreeOfHunger++;
    }


        public short getSpecificSpecies() {
            return specificSpecies;
        }

        public int x() {
            return x;
        }

        public int y() {
            return y;
        }

        public int degreeOfHunger() {
            return degreeOfHunger;
        }


        public String letMeMove() {
            degreeOfHunger++;
            int oldX = x, oldY = y;
            letMeSwim((char) ThreadLocalRandom.current().nextInt(1, 6), ThreadLocalRandom.current().nextInt(1, 6),
                ThreadLocalRandom.current().nextInt(1, 6));
            return String.format("%d -> %d and %d -> %d", oldX, x, oldY, y);
        }

        public boolean canLiveInSaltWater() {
            return specificSpecies == 2 || specificSpecies == 5 || specificSpecies == 9;
        }

        public boolean canLiveInFreshWater() {
            return specificSpecies % 2 == 0 && specificSpecies % 4 != 0;
        }

        public void letMeSwim(char distance, double x, double y) {
            degreeOfHunger++;
            this.x += x * distance;
            this.y += y * distance;

        }

        @Override
        public void accept(int reductionOfHunger) {
            degreeOfHunger -= reductionOfHunger > 0 ? reductionOfHunger : 0;
        }

        public short setSpecificSpecies(short specificSpecies) {
            short oldSpecies = this.specificSpecies;
            this.specificSpecies = (short) Math.max(0, Math.min(specificSpecies, 10));
            return oldSpecies;
        }
}
