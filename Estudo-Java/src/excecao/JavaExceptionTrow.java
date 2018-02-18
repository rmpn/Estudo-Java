package excecao;

public class JavaExceptionTrow {

	public static void main(String[] args) {
		
		try {
			
			int x=0;
			int y=5;
			int div = y/x;
			
			throw new MyException(2,"Erro!!");
			
      }catch (MyException e) {
			
			System.out.println("Bloco MyException: "+e);
			
			
		}  catch (Exception e) {
			
			System.out.println("Bloco Exception: "+e);
			
			
		}finally{
			System.out.println("finalizando main ...");
		}

	}

}
