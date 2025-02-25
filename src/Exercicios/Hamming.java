package Exercicios;

public class Hamming {
    private String leftStrand;
    private String rightStrand;
    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        int count = 0;
        for (int i=0;i<leftStrand.length();i++){
            if (leftStrand.charAt(i) != rightStrand.charAt(i)){
                count += 1;
            }
        } this.hammingDistance = count;
    }

    public int getHammingDistance() {
        return this.hammingDistance;
    }
}
