package excecao;

public class MyException extends Exception {
	
	int a;
	
	public MyException(int b, String message) {
		super(message);
		this.a = b;
		
	}

	public String toString(){
		
		return("Exce��o numero = "+this.a);
	}
	
}

