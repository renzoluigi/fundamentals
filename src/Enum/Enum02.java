package Enum;

public class Enum02 {
    public enum OperacaoMatematica {
        SOMA("+"){
            public int calcular(int a, int b){
                return a + b;
            }
        },
        SUBTRACAO("-"){
            public int calcular(int a, int b){
                return a - b;
            }
        },
        MULTIPLICACAO("*"){
            public int calcular(int a, int b){
                return a*b;
            }
        },
        DIVISAO("/"){
            public int calcular(int a, int b){
                return a/b;
            }
        };

        private final String operador;

        OperacaoMatematica(String operador){
            this.operador = operador;
        }

        public String getOperador() {
            return this.operador;
        }

        public abstract int calcular(int a, int b);
    }
    public static void main(String[] args) {
        OperacaoMatematica operador = OperacaoMatematica.SOMA;
        System.out.println(operador.calcular(2,3));;
    }
}

