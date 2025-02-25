package Exercicios;

public enum LogLevel{
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int code;

    public int getCode() {
        return code;
    }

    LogLevel(int code){
        this.code = code;
    }
}
//fiquei 2 horas e meia quebrando a cabeca nesse exercicio, e no final consegui "aprender" a usar enum, valeu a pena!