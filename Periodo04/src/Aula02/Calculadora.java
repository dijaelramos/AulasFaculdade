package Aula02;

public class Calculadora {
    int num1;
    int num2;
    int resultado;

    void somar() {
        resultado = num1 + num2;
        System.out.println("O resultado da soma é de: " + resultado);
    }
    void subtrair() {
        resultado = num1 - num2;
        System.out.println("O resultado da subtração é de: " + resultado);
    }
    void dividir() {
        resultado = num1 / num2;
        System.out.println("O resultado da divisão é de: " + resultado);
    }
    void multiplicar() {
        resultado = num1 * num2;
        System.out.println("O resultado da multiplicação é de: " + resultado);
}
}
