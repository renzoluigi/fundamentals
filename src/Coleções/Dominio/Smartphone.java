package Coleções.Dominio;

import java.util.Objects;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void ligar(){
        System.out.println("Ligando...");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return this.serialNumber != null && serialNumber.equals(smartphone.getSerialNumber()) && marca != null && marca.equals(smartphone.getMarca()); //marca e serial number comparados, mas pode ser apenas serial number
    }

    // se x.equals(y) == true, y.hashCode() == x.hashCode()
    // se x.hashCode() == y.hashCode() não necessariamente x.equals(y) tem que ser true, pois apenas dentro do hashCode é realizado o equals
    // se x.equals(y) == false, y.hashCode() != x.hashCode()
    // se x.hashCode() != y.hashCode(), x.equals(y) deverá ser false
    @Override
    public int hashCode() {
        //o parametro de equals devera ser o mesmo parametro em hashCode
        return this.serialNumber == null || marca == null ? 0 : Objects.hash(this.serialNumber,this.marca);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
