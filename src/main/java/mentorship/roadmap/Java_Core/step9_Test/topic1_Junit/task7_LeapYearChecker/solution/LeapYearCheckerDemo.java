package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task7_LeapYearChecker.solution;

public class LeapYearCheckerDemo {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
