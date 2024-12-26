import br.com.desafioPraticoOO.modelos.modelo.ModeloCarro;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(3000,32000,4000);
        meuCarro.exibirInfo();
    }
}

