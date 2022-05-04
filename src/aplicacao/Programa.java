package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Empregados;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* REGISTRAR OS DADOS DOS EMPREGADOS */
		List<Empregados> lista  = new ArrayList<>();
		
		System.out.print("Quantos empregados serão registrados? ");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			sc.nextLine();
			System.out.println("EMPREGADO: " + i);
			System.out.print("ID: ");
			int id = sc.nextInt();
			while (hasId(lista, id)) {
				System.out.print("Id já existente, tente novamente:  ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("NOME: ");
			String nome = sc.nextLine();
			System.out.print("SALÁRIO: ");
			double salario = sc.nextDouble();
			
			lista.add(new Empregados(id, nome, salario));
		}
		
		/* AUMENTO DO SALÁRIO */
		System.out.println();
		System.out.print("Digite o ID do funcionário que terá o aumento: ");
		int id = sc.nextInt();
		
		Empregados emp = lista.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println();
			System.out.println("ID incorreto.");
		}
		else {
			System.out.print("Digite a porcentagem do aumento: ");
			int X = sc.nextInt();
			emp.aumentoSalario(X);
		}
		
		System.out.println();
		System.out.println("Lista dos empregados: ");
		for (Empregados x : lista) {
			System.out.println(x);
		}
		
		
		sc.close();

	}

	private static boolean hasId(List<Empregados> lista, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
