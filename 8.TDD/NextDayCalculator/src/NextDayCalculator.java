public class NextDayCalculator {
    public static int[] getNextDay(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        // Kiểm tra số ngày trong tháng
        int daysInMonth = getDaysInMonth(month, year);

        if (day < daysInMonth) {
            nextDay = day + 1;
        } else {
            nextDay = 1;
            if (month < 12) {
                nextMonth = month + 1;
            } else {
                nextMonth = 1;
                nextYear = year + 1;
            }
        }

        return new int[]{nextDay, nextMonth, nextYear};
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
