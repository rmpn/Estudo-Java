package excecao;

import java.io.FileWriter;
import java.io.IOException;

public class ArquivoThrows {

	public static void main(String[] args) throws IOException  //throws IOException
	{
	
		
		FileWriter file = new FileWriter("c:/temp/pinto.txt",true);
		file.write("\n"+"E ai sr. Java, como vamos!!!" );
		file.close();

	}

}
