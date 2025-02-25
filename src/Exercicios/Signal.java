package Exercicios;

enum Signal {

    WINK(1),
    DOUBLE_BLINK(10),
    CLOSE_YOUR_EYES(100),
    JUMP(1000);

    private int bin;

    Signal(int bin){
        this.bin = bin;
    }

    public int getBin() {
        return bin;
    }
}
