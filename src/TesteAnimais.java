import br.com.desafioPraticoOO.modelos.modelo.Cachorro;
import br.com.desafioPraticoOO.modelos.modelo.Gato;

//Classe de teste
public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
