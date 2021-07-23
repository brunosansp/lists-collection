package com.brunosan.lists;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList();
		
		clientes.add(new Cliente(1L, "Bruno"));
		clientes.add(new Cliente(2L, "Talita"));
		
		clientes.forEach(cliente -> System.out.printf("ID: %d, Nome: %s%n",
				cliente.getId(), cliente.getNome()));
	}
}
