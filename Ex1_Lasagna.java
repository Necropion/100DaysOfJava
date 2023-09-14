// Task: Cook your Lasagna
// https://exercism.org/tracks/java/exercises/lasagna/

public class Lasagna {
    public int expectedMinutesInOven() {

        return 40;
    }
    public int remainingMinutesInOven(int actualMinutes) {

        int minutesTimer = expectedMinutesInOven();
        return (minutesTimer - actualMinutes);
    }
    public int preparationTimeInMinutes(int amountLayers) {

        return amountLayers * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int amountLayers, int actualMinutes) {

        return ((amountLayers * 2) + actualMinutes);
    }
}
