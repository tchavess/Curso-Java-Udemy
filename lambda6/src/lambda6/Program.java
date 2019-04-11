package lambda6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        //Pega o caminho onde esta o file
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
        //condição do try cria a leitura do arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            //Cria uma lista de Products
			List<Product> list = new ArrayList<>();
           //Le a primeira linha no arquivo
			String line = br.readLine();
			while (line != null) {
				//Cria um vetor de Strings que separam os arquivos por virgulas(.CSV)
				String[] fields = line.split(",");
				//Adiciona a lista name , price
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				//Le a proxima linha para testar no while
				line = br.readLine();
			}
			//Criação do PipeLine que calcula a media
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0,(x,y)-> x+y/list.size());
			System.out.println("Average price: " + String.format("%.2f", avg));
			//Comparator testa as String com ToUpper
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
	//Criacao do PipeLine que imprime os nome com preco abaixo da media em ordem descrescente
			List<String> name = 
					//Inversao de Lista para String
					list.stream()
					//Filtra pelo preço menor que avg
					.filter(p -> p.getPrice() < avg )
					//map trazendo o nome ordenado inversamente "reversed"
					.map(p -> p.getName()).sorted(comp.reversed())
					//inversao de String para list
					.collect(Collectors.toList());
			//ForEach imprimindo os nomes
			name.forEach(System.out :: println);
					
//Exceção File
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
sc.close();
	}

}
