package br.com.desafioPraticoOO.modelos.modelo;
/*Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada()
para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
* */
//Classe TabuadaMultiplicacao implementando Tabuada
public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada de multiplicação do " + numero + " :");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
    }
}
