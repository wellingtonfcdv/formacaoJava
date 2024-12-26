package br.com.desafioPraticoOO.modelos.modelo;

public class GeradorPrimo extends NumerosPrimos{
    public int geradorProximoPrimo(int ultimoPrimoConhecido){
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)){
            proximoNumero++;
        }
        return proximoNumero;
    }
}
