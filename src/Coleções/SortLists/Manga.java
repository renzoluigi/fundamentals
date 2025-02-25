package Coleções.SortLists;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(long id, String nome, double preco,int quantidade) {
        Objects.requireNonNull(id, "Id não pode ser null."); //gera uma exception (NullPointerException)
        Objects.requireNonNull(nome, "Nome não pode ser null.");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga outroManga) {
        // negativo se this < outroManga
        // 0 se this == outro
        //positivo se this > outroManga

        // se o tipo do comparador for Wrapper, eh possivel utilizar a funcao compareTo do Wrapper
        return this.id.compareTo(outroManga.getId());
        // se não:
        // return Double.valueOf(this.preco).compareTo(outroManga.getPreco());
        // return Double.compare(this.preco,outroManga.getPreco());
        // return this.nome.compareTo(outroManga.getNome());

        // manualmente
        // if (this.id < outroManga.id) {
        //   return -1;
        // } else if (this.id.equals(outroManga.id)){
        //   return 0;
        //   } return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

