package Aula01;

public class ExercicioMain {
    public static void main(String[] args) {

        Exercicio porta = new Exercicio();
        porta.cor = "preta";
        porta.dimensaoX = 10.0f;
        porta.dimensaoY = 20.0f;
        porta.dimensaoZ = 15.0f;

        porta.abre();
        porta.fecha();
        porta.mostrarStatus();
    }
}