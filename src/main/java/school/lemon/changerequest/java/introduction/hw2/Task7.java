package school.lemon.changerequest.java.introduction.hw2;

public class Task7 {
    public static int countEvens(int[] arr) {
        if (arr == null) return 0;

        int evenNum = 0;
        for (int anArr : arr) {
            if (anArr % 2 == 0) {
                evenNum++;
            }
        }

        return evenNum;
    }
}
