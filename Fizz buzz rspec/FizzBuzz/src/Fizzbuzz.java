
public class Fizzbuzz {
	void generarMuchos(){
		for(int i = 0; i < 100; i++)
		{
			System.out.println(generarPara(i));
        }
	}
	
	public String generarPara(int numero){
		if (numero % 3 == 0 && numero % 5 == 0)
		{
			return("FizzBuzz");                    
		}
		else 
			if(numero % 3 == 0)
			{
				return("Fizz");
			}
			else 
				if(numero % 5 == 0)
				{
					return("Buzz");
				}
				else
					return(Integer.toString(numero));
	}
}
