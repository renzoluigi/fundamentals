package Enum;

public class Enum00 {
    public static void main(String[] args) {
        enum DiaDaSemana {
            SUNDAY("Domingo"), MONDAY("Segunda"), TUESDAY("Terça"), WEDNESDAY("Quarta"), THURSDAY("Quinta"), FRIDAY("Sexta"), SATURDAY("Sábado");
            private String toPortuguese;
            DiaDaSemana(String toPortuguese){
                this.toPortuguese = toPortuguese;
            }

            public String getToPortuguese() { //nao possui setter, pois o valor anexado a um num nao eh mutavel.
                return toPortuguese;
            }

            public void setToPortuguese(String toPortuguese) {
                this.toPortuguese = toPortuguese;
            }

            public String getHorarioDeFuncionamento(DiaDaSemana diaDaSemana){
                return switch (diaDaSemana){
                    case FRIDAY -> "9am - 5pm";
                    case SATURDAY -> "10am - 4pm";
                    case SUNDAY -> "Closed.";
                    default -> "6am - 6pm";
                };
            }
        }

        DiaDaSemana hoje = DiaDaSemana.SATURDAY;
        System.out.println(hoje.getHorarioDeFuncionamento(hoje));

        //if (hoje == DiaDaSemana.SATURDAY || hoje == DiaDaSemana.SUNDAY) {
            //System.out.println("FIM DE SEMANA!");
        //} else {
        //    System.out.println("DIA DA SEMANA!");
        //}
    }
}
