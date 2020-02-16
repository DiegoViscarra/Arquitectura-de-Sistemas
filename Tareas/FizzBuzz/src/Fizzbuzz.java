
public class Fizzbuzz {
	private static final int _BUZZ = 5;
	private static final int _FIZZ = 3;


	void generarMuchos(){
		for(int i = 0; i < 100; i++)
		{
			System.out.println(generar(i));
        }
	}
	
	public String generar(int numero){
		if (esMultiploDe(numero, _FIZZ) && esMultiploDe(numero, _BUZZ))
			return("FizzBuzz");     
		if(esMultiploDe(numero, _FIZZ))
			return("Fizz");
		if(esMultiploDe(numero, _BUZZ))
			return("Buzz");
		else
			return(Integer.toString(numero));
	}

       
	private boolean esMultiploDe(int numero, int multiplo) {
		return numero % multiplo == 0;
	}
}
