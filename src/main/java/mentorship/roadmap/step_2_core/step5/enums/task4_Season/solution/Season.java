package mentorship.roadmap.step_2_core.step5.enums.task4_Season.solution;

public enum Season {

    WINTER(-5.0),
    SPRING(10.0),
    SUMMER(25.0),
    FALL(8.0);

    private final double avgTemp;

    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    @Override
    public String toString() {
        return "Season: " + name() + ", Avg Temp: " + avgTemp + "°C";
    }
}
