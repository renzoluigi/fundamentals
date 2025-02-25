package Exercicios;

public class LogLine {
    private String sub;
    private String str;

    public LogLine(String logLine) {
        StringBuilder str = new StringBuilder(logLine);
        this.sub = str.substring(1,4);
        this.str = str.substring(7);
    }

    public LogLevel getLogLevel() {
        return switch (sub){
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return getLogLevel().getCode() + ":" + str;
    }
}
