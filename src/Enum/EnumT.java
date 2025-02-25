package Enum;

public class EnumT {
    public String nome;
    public Gravity planeta;

    public EnumT(String nome, Gravity planeta) {
        this.nome = nome;
        this.planeta = planeta;
    }

    public static void main(String[] args) {
        EnumT planeta01 = new EnumT("Mercurio", Gravity.MERCURY);
        System.out.println();
    }
}
