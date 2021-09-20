package Aula02;

public class calculadoraMain {
    public static void main(String[] args) {
     
        Calculadora soma = new Calculadora();
        soma.num1 = 5;
        soma.num2 = 10;
        soma.somar();

        Calculadora subtracao = new Calculadora();
        subtracao.num1 = 10;
        subtracao.num2 = 5;
        subtracao.subtrair();

        Calculadora multiplicacao = new Calculadora();
        multiplicacao.num1 = 5;
        multiplicacao.num2 = 10;
        multiplicacao.multiplicar();
        
        Calculadora divisao = new Calculadora();
        divisao.num1 = 10;
        divisao.num2 = 2;
        divisao.dividir();
    }     
}