package BootBlocks;

// Etapas da criação de um objeto
// 1 - Alocando espaço em memória
// 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
// 3 - Bloco de inicialização executado
// 4 - Construtor é executado
public class Anime {
    private String nome;
    private  int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12}; // -> inicializacao dos objetos acontece antes do construtor
    { // executado antes do construtor
        System.out.println("Bloco de inicialização");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : episodios) {
            System.out.print(episodio + " "); // -> uma prova disso
        }

    }
}
