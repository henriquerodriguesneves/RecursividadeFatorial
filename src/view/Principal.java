package view;

//Importando a classe de controle do Fatorial
import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		//Método construtor
		FatorialController ft = new FatorialController();
		//Definindo um valor para o fatorial
		int fatorial = 4;
		//variavel que recebe o resultado
		int resultado = ft.fat(fatorial);
		System.out.println("Resultado: "+resultado);

	}

}