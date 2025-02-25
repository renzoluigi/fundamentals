package Enum;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(int valor) {
            return valor*0.1;
        }
    },CREDITO{
        @Override
        public double calcularDesconto(int valor) {
            return valor*0.05;
        }
    };

    public abstract double calcularDesconto(int valor);

    public static void main(String[] args) {
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
    }
}
