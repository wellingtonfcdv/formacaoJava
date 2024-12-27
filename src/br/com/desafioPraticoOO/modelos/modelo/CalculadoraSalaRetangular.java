package br.com.desafioPraticoOO.modelos.modelo;
/*Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve
receber altura e largura como parâmetros.
* */

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área da sala retangular é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro da sala retangular é: " + perimetro);
    }
}
