package fileReaderArtifact;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {

		// ################ LEYENDOS FICHEROS EN JAVA ################
		
		String rutaArchivo = "C:\\uploadExcel\\doc_texto.txt";

		try {

			// ################ FILE_READER ################
			
			// LEO EL FICHERO
			FileReader fileReader = new FileReader(rutaArchivo);

			// LEO EL TEXTO DENTRO DEL FICHERO
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String cadenaLeida = bufferedReader.readLine();

			// IMPRIMO RESULTADOS
			System.out.println(cadenaLeida);

			// CIERRO EL OBJETO BUFFER
			bufferedReader.close();

			// ################ FILE Y SCANNER ################
			
			File file = new File("C:\\uploadExcel\\doc_texto.txt");
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
