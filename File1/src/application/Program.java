package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		String fileSourceStr = sc.nextLine();
		//Criacao do arquivo
		File sourceFile = new File(fileSourceStr);
		//jogando o diretorio criado na variavel String
		String sourceFolderStr =  sourceFile.getParent();
		//Cria a pasta out e retorna true em caso de sucesso na criacao da pasta out
		boolean sucess = new File(sourceFolderStr + "\\out").mkdir();
		//jogando o diretorio na variavel
		String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";
		
		//condicao do try estancia a leitura do arquivo file a partir do arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(fileSourceStr))){
			//enquanto a linha nao for nula, ele le a proxima e armazena na lista de produtos
			String itemCsv = br.readLine();
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));

				itemCsv = br.readLine();
		}
			//Criando a subpasta
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr, true))) {
           //escrevendo no arquivo
			for (Product item : list) {
				bw.write(item.getName() + "," + String.format("%.2f", item.total()));
				bw.newLine();
			}

			System.out.println(targetFileStr + " CREATED!");
			
		} catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}

	} catch (IOException e) {
		System.out.println("Error reading file: " + e.getMessage());
	}

	sc.close();
}


	}


