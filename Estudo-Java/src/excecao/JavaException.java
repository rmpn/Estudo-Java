package excecao;

public class JavaException {

	public static void main(String[] args) {
		
		
		try {
			
			//
			
			int d =1;
			int n =20;
			
			int fracao = n/d;
			
			int g[] = {1};
			g[20] = 100;
			
			System.out.println("Oi!!!");
			
		} 
		
		catch (ArithmeticException e) {
			
			System.out.println("No ArithmeticException block devido a: "+e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("No ArrayIndexOutOfBoundsException block devido a: "+e);
		}
		catch (Exception e) {
			
			System.out.println("No Exception block devido a: "+e);
		   }
		
		finally{
			
			System.out.println("Oi!!!");
			
		}
	

		
		
		
		
	}

}
