package excecao;

import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

	public static void main(String[] args) {
		
		try {
			FileWriter file = new FileWriter("c:/tem/pint.txt");
			file.write("pinto neto");
			file.close();
			
		} catch (IOException e) {
			
			System.out.println("problemas na escrita/leitura do arquivo!!!");
			
		}finally{
			System.out.println("finalizando ...");
		}
	}

}
