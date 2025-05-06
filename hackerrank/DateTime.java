package hackerrank;

import java.util.Calendar;

public class DateTime {

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String dia = "";
        switch (dayOfWeek) {
            case 1:
                dia = "SUNDAY";
                break;
            case 2:
                dia = "MONDAY";
                break;
            case 3:
                dia = "TUESDAY";
                break;
            case 4:
                dia = "WEDNESDAY";
                break;
            case 5:
                dia = "THURSDAY";
                break;
            case 6:
                dia = "FRIDAY";
                break;
            case 7:
                dia = "SATURDAY";
                break;
        }
        return dia;
    }
}
