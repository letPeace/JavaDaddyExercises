package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic4_Enums.task2_Color.solution;

public enum Color {

    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private final String hexCode;

    Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }
}
