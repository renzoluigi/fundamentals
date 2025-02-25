package Enum;

public enum Gravity{
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);

    private final double massa;
    private final double raio;

    Gravity(double massa,double raio){
        this.massa = massa;
        this.raio = raio;
    }

    double gravidadeSuperficial(){
        return 6.67430e-11 * massa / (raio * raio);
    }

    @Override
    public String toString() {
        return "Gravity{" +
                "massa=" + massa +
                ", raio=" + raio +
                '}';
    }
}


