package Exercicios;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder(dnaStrand);
        for (int pos=0;pos<sb.length();pos++)
            switch(sb.charAt(pos)){
                case 'G' -> sb.setCharAt(pos,'C');
                case 'C' -> sb.setCharAt(pos,'G');
                case 'T' -> sb.setCharAt(pos,'A');
                case 'A' -> sb.setCharAt(pos,'U');
        } return sb.toString();
    }

}
