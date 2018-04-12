package utils;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class StringUtils {
    public static String replaceInvalidChars(String stringToReplace, String[] charsToReplace,
                                             String replaceWith) {
        String replacedString = stringToReplace;
        for (String string : charsToReplace) {
            replacedString = replacedString.replace(string, replaceWith);
        }
        return replacedString;
    }

    public static String convertTime(long time) {
        Date date = new Date(time);
        Format format = new SimpleDateFormat("HH:mm:ss");
        return format.format(date);
    }

    public static String convertToMinutes(long duration) {
        return String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(duration),
                TimeUnit.MILLISECONDS.toSeconds(duration)
                        - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration)));
    }

}
