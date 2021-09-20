package Aula01;

public class Aula01 {
    public static void main(String[] args) {
      Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 5;
        heroi.forca = 16;
        
        heroi.mostrarStatus();

        heroi.atacar("Hydra", "Golpe A");
        System.out.println(heroi.calcularDano());
    }
}
