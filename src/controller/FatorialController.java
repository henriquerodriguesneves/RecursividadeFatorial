package controller;

public class FatorialController {
	
	public FatorialController() {
		super();
	}
	
	public int fat(int fatorial) {
		//Condição de parada = se o fatorial for 0, deverá retornar 1, porque 0! = 1...
	 if (fatorial == 0) {
      return 1;	
      //Caso seja diferente de 0, deverá multiplicar fatorial * (fatorial - 1)
	 }else {
		 //Fatorial * (Fatorial - 1)
		 return fatorial * fat(fatorial - 1);
	 }
	 
}
}