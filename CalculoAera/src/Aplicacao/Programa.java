package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Circulo;
import entites.Retangulo;
import entites.Calculo;
import entites.enums.Cores;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Calculo> list = new ArrayList<>();
		System.out.println("Informe a quantidade de figuras");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Figura #" + i + "  dados:");
			System.out.print("A figura � retangulo ou circulo (r/c)");
			char ch = sc.next().charAt(0);
			System.out.println("Preto, Branco ou Verde");
			Cores cores = Cores.valueOf(sc.next()) ;
			if (ch == 'r') {
				System.out.println("Altura: ");
				double altura =sc.nextDouble();
				System.out.println("Largura: ");
				double largura =sc.nextDouble();
				list.add(new Retangulo(cores, altura, largura));
			}
			else {
				System.out.println("Informe o raio");
				double raio = sc.nextDouble();
				list.add(new Circulo(cores, raio));
			}
			
		}
		System.out.println();
		System.out.println("Areas das figuras");
		for(Calculo calculo : list) {
		System.out.println(String.format("%.2f", calculo.area()));
	}
		sc.close();
	}

}
