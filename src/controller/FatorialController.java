package controller;

public class FatorialController {
	
	public FatorialController() {
		super();
	}
	
	public int fat(int fatorial) {
		//Condi��o de parada = se o fatorial for 0, dever� retornar 1, porque 0! = 1...
	 if (fatorial == 0) {
      return 1;	
      //Caso seja diferente de 0, dever� multiplicar fatorial * (fatorial - 1)
	 }else {
		 //Fatorial * (Fatorial - 1)
		 return fatorial * fat(fatorial - 1);
	 }
	 
}
}