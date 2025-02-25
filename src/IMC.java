public class IMC {

    public double calcular(double peso,double altura){
        return peso/(altura*altura);
    }

    public String resultado(double imc){
        if (imc < 16){
            return "Delgadez severa";
        } else if (imc <= 16.9) {
            return "Delgadez moderada";
        } else if (imc <= 18.4) {
            return "Delgadez leve";
        } else if (imc <= 24.9) {
            return "Peso normal";
        } else if (imc <= 29.9) {
            return "Pré-obesidade";
        } else if (imc <= 34.9) {
            return "Obesidade tipo I";
        } else if (imc <= 39.9) {
            return "Obesidade tipo II";
        } return "Obesidade tipo III";
    }

    public static void main(String[] args) {
        IMC imc = new IMC();
        System.out.println(imc.resultado(imc.calcular(68.5,1.80)));
    }
}
