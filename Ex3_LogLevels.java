import java.lang.*;
public class LogLevels {
    
    public static String message(String logLine) {

        String[] levelFilter = logLine.split(":", 2);

        return levelFilter[1].trim();
    }

    public static String logLevel(String logLine) {

        String[] messageFilter = logLine.split("]", 2);

        return messageFilter[0].replace("[", "").toLowerCase();
    }

    public static String reformat(String logLine) {

        String[] oldFormat = logLine.split(":", 2);

        String reFormat = oldFormat[0].replace("]", ")");

        return oldFormat[1].trim() + reFormat.replace("[", " (").toLowerCase();
    }
}
