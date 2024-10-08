import Modelos.Pilotos;
import Modelos.Pista;


public class Main {
    public static void main(String[] args) {


        Pilotos piloto = Pilotos.getInstance();
        piloto.setNome("Goku");
        Pista pista = new Pista("Autódromo Internacional de Goiânia", 2);
        Pilotos.setPistaCorrida(pista);
        System.out.println("Hashcode: " + piloto.hashCode());
        Pilotos.FichaPiloto();
    }
}