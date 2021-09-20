package Aula01;

public class Exercicio {

    // Atributos
    String estaAberta;
    String cor;
    float dimensaoX;
    float dimensaoY;
    float dimensaoZ;

    void abre () {
        estaAberta = "aberta";
    }

    void fecha () {
        estaAberta = "fechada";
    }

    void mostrarStatus() {
        System.out.format("A porta tem uma cor %s, e suas dimensões é de %.1f cm x %.1f cm x %.1f cm, e ela está %s.\n",cor, dimensaoX, dimensaoY, dimensaoZ, estaAberta);
    }
}