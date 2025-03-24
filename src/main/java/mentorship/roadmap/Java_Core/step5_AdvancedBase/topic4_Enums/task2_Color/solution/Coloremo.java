package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic4_Enums.task2_Color.solution;

public class Coloremo {

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color + " имеет код: " + color.getHexCode());
        }
    }
}
