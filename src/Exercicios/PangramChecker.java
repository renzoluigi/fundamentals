package Exercicios;

public class PangramChecker {

    public boolean isPangram(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i=0;i<alphabet.length();i++){
            if (input.toLowerCase().indexOf(alphabet.charAt(i)) < 0){
                return false;
            }
        } return true;
    }


    public static void main(String[] args) {
        PangramChecker pan = new PangramChecker();
        System.out.println(pan.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }
}
