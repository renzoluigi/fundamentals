package Exercicios;

public enum TravelMethod {
    WALKING("walking"),
    HORSEBACK("horseback");

    private String method;

    TravelMethod(String method){
        this.method = method;
    }

    public String getMethod() {
        return method;
    }
}
