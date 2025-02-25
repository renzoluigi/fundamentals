package Annotations;

@interface Anotacao {
    String nome();
    int numero();
    String info() default "Informações.";
}
