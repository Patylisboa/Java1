package aula6.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class ExemploLeituraArquivo {
	public static void main(String[] args) throws IOException{
		
		
		gravarArquivo();
		lerArquivo();
	    gravarArquivoComWriter();
	    lerArquivoComReader();
	}
	

	private static void gravarArquivoComWriter() {
		try(BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("/home/java01/exemplo_writer.txt"))){
			BufferedWriter.write("Grvando Arquivo");
		}
		
	}


	private static void lerArquivoComReader() {
		try(BufferedReader reader = new BufferedReader(new FileReader("home/java01/exemplo_writer.txt"))){
			String line = reader.readLine();
			while (line != null){
				System.out.print(line);
			}
	}


	}


	
	}


	private static void lerArquivo() throws IOException {
		try (FileInputStream fileInputStream = new FileInputStream("/home/java01/exemplo.txt")){
			byte buffer[] = new byte [1024];
			int read = fileInputStream.read(buffer);
			while(read != -1){
				System.out.println(new String(buffer, 0, read));
				read = fileInputStream.read(buffer);
			}
			
		}
			
		
	}

	private static void gravarArquivo() throws IOException,
			FileNotFoundException {
		
		String conteuDoDoArquivo = "Meu prmeiro Arquivo";
		 try (FileOutputStream out = new FileOutputStream("/home/java01/exemplo.txt")){;
		out.write(conteuDoDoArquivo.getBytes());
		 }
	}

}
