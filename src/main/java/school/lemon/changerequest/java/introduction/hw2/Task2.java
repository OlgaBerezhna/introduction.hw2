package school.lemon.changerequest.java.introduction.hw2;


public class Task2 {
    public static String firstTwo(String s) {

        if (s == null) {
            return null;
        }


        if (s.length() < 2) {
            return s;
        }
        else {
            return s.substring(0, 2);
        }
    }
}
