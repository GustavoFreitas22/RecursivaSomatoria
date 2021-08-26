package view;

import controller.RecursivaSomatoria;

public class Main {
		public static void main(String[] args) {
			RecursivaSomatoria soma = new RecursivaSomatoria();

			int numero = 5;
			int aux = numero;

			numero = soma.recursiva(numero, aux);
			System.out.println(numero);
		}
	}

