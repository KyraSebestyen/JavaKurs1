

public class Checker {

    public boolean isDayOfWeek(String string) {
        if (string.length() != 3) {
            return false;
        }
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        return string.matches(regex);
    }

    public boolean allVowels(String string) {
        String regex = "[a|e|i|o|u]*";
        return string.matches(regex);
    }

    public boolean timeOfDay(String string) {
        // String regex = "^([01][0-9]|2[0-3])(:[0-5][0-9]){2}$";
        // return string.matches(regex);
        String[] parts = string.split(":");
        String strHours = parts[0];
        if (strHours.length() != 2) {
            return false;
        }
        String strMinutes = parts[1];
        if (strMinutes.length() != 2) {
            return false;
        }
        String strSeconds = parts[2];
        if (strSeconds.length() != 2) {
            return false;
        }

        try {
            int hours = Integer.parseInt(strHours);
            int minutes = Integer.parseInt(strMinutes);
            int seconds = Integer.parseInt(strSeconds);

            if (!isInRange(hours, 0, 23)
                || !isInRange(minutes, 0, 59)
                || !isInRange(seconds, 0, 59)) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;


    }

    private static boolean isInRange(int number, int low, int high) {
        return number >= low && number <= high;
    }

}
