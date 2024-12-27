package br.com.desafioPraticoOO.modelos.modelo;
/*Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o
valor em dólar como parâmetro.
* */
//Classe ConversorMoeda implementando ConversãoFinanceira
public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$ " + valorReal);
    }
}

