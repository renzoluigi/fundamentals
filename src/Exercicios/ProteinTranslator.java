package Exercicios;

import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> translated = new ArrayList<>();
        for (int i=0;i<rnaSequence.length();i+=3){
            if (i + 3 > rnaSequence.length()) {
                throw new IllegalArgumentException("RNA sequence is not a multiple of 3.");
            }
            String cut = rnaSequence.substring(i,i+3);
            if (cut.equals("UAA") || cut.equals("UAG") || cut.equals("UGA")){
                break;
            }
            switch(cut){
                case "AUG" -> translated.add("Methionine");
                case "UUU", "UUC" -> translated.add("Phenylalanine");
                case "UUA", "UUG" -> translated.add("Leucine");
                case "UCU", "UCC", "UCA", "UCG" -> translated.add("Serine");
                case "UAU","UAC" -> translated.add("Tyrosine");
                case "UGU", "UGC" -> translated.add("Cysteine");
                case "UGG" -> translated.add("Tryptophan");
                default -> throw new IllegalArgumentException("Invalid RNA codon: " + cut);
            }
        } return translated;
    }

    public static void main(String[] args) {
        ProteinTranslator a1 = new ProteinTranslator();
        System.out.println(a1.translate("UUAUUG"));
    }
}
