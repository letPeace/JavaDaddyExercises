package mentorship.roadmap.step_2_core.step5.enums.task2_Color.solution;

public class Coloremo {

    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color + " имеет код: " + color.getHexCode());
        }
    }
}
