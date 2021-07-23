package com.brunosan.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo01 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Bruno");
		nomes.add("Talita");
		nomes.add("Davi");
		nomes.add("Sophia");
		nomes.add("Noah");
		nomes.add("7belo");
	
//		Tradicional
//		for (int i = 0; i < nomes.size(); i++) {
//			System.out.println("Nome: " + nomes.get(i));
//		}
		
		
//		Usando enhanced-for
//		for (String nome : nomes) {
//			System.out.println("Nome: " + nome);
//		}
		
		
//		Usando forEach
//		nomes.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String nome) {
//				System.out.println("Nome: " + nome);
//			}
//			
//		});
		
		
//		Usando forEach com Lambda Expression
//		nomes.forEach(nome -> {
//			System.out.println("Nome: " + nome);
//		});
		
		
//		Usando forEach com method reference
		nomes.forEach(System.out::println);
		
	}
}
