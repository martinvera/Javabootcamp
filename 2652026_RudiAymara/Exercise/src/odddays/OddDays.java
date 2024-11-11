package odddays;

public class OddDays {
    public static void main(String[] args) {
        int day1 = 1;
        int day30 = 30;

        for (int day = day1; day <= day30; day++) {
            if (day % 2 != 0) {
                System.out.println("Odd Days: " + day);
            }
        }
    }
}
