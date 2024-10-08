package Modelos;

public class Pista {
    private String nomePista;
    private int quantidadeCorredores;

    public Pista(String nomePista, int quantidadeCorredores) {
        this.nomePista = nomePista;
        this.quantidadeCorredores = quantidadeCorredores;
    }

    public int getQuantidadeCorredores() {
        return quantidadeCorredores;
    }

    public void setQuantidadeCorredores(int quantidadeCorredores) {
        this.quantidadeCorredores = quantidadeCorredores;
    }

    public String getNomePista() {
        return nomePista;
    }

    public void setNomePista(String nomePista) {
        this.nomePista = nomePista;
    }


}
