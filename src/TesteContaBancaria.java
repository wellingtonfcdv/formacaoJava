import br.com.desafioPraticoOO.modelos.modelo.ContaBancaria;
import br.com.desafioPraticoOO.modelos.modelo.ContaCorrente;

public class TesteContaBancaria {
    public static void main(String[] args) {
        //Criando uma conta bancária com saldo inicial de 1000
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        //Realizando operações na conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
    }
}
