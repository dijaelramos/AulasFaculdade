package Aula01;

import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarStatus() {
        System.out.format("Personagem %s, (lvl %d) com uma foça de %d.\n",nome, nivel, forca);

    }
    int calcularDano() {
        Random gerador = new Random();
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;

        return dano;
    }

    void atacar(String alvo, String habilidade) {
        int danoCausado = 0;
        if(habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d danos.\n", nome, alvo, forca);
        } else{
            System.out.format("%s usou %s contra o %s e causou %d de danos.\n", nome, habilidade, alvo, forca);
        }
    }
}