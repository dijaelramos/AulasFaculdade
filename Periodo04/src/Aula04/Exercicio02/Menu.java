package Aula04.Exercicio02;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor p1 = new Professor("Dijael Ramos", "11111111");
		ProfessorHorista ph1 = new ProfessorHorista("Zumira", "55555", 10.0f, 6);
		
		ph1.getHoraExtra();
		
		
		System.out.println(p1.toString());
		System.out.println(ph1.status());
		

	}

}
