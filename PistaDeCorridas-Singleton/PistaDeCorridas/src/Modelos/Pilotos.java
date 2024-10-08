package Modelos;
import Modelos.Pista;


public class Pilotos {
    private String nome;
    private static Pista pistaCorrida;
    private static Pilotos singleton = null;

    public static Pilotos getInstance() {
        if (singleton == null) {
            singleton = new Pilotos();
        }
        return singleton;
    }

    private Pilotos() {
         pistaCorrida = new Pista("Autódromo Internacional de Goiânia", 2);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void setPistaCorrida(Pista pista) {
        pistaCorrida = pista;
    }

    public static void FichaPiloto() {
        if (pistaCorrida == null) {
            System.out.println("Pista Corrida não está definida.");
            return;
        }

        Pilotos piloto = Pilotos.getInstance();
        System.out.println("Nome do Piloto: " + piloto.getNome());
        System.out.println("Nome da Pista: " + pistaCorrida.getNomePista());
        System.out.println("Quantidade de Corredores: " + pistaCorrida.getQuantidadeCorredores());
    }
}