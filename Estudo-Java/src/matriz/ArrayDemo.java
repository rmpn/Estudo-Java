package matriz;

public class ArrayDemo {

	public static void main(String[] args) {
	
	 String[] b = new String[3];
	 
	 b[0] = "Maçã";
	 b[1] = "Laranja";
	 b[2] = "Manga";
	 
		
	 System.out.println("Antes: elemento b[0] = "+ b[0]);
	 
	 ArrayDemo.passParByRefencia(b);
	 
	 System.out.println("Depois: elemento b[0] = "+ b[0]);		

	}
	
	// No array parametro por referência [muda o valor da variável]
	public static void passParByRefencia(String b[]) {
		
		
		b[0] = "Changed";
		
	}

}
