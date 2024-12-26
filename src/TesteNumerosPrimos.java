import br.com.desafioPraticoOO.modelos.modelo.GeradorPrimo;
import br.com.desafioPraticoOO.modelos.modelo.NumerosPrimos;
import br.com.desafioPraticoOO.modelos.modelo.VerificadorPrimo;

public class TesteNumerosPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        verificadorPrimo.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proxmioPrimo = gerador.geradorProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proxmioPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
