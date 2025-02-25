package Exercicios;

public class LogLevels {

    public static String message(String logLine) {
        logLine = logLine.substring(logLine.indexOf(":")+1);
        return logLine.trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[")+1,logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " " + "(" + logLevel(logLine) + ")";
    }
}
