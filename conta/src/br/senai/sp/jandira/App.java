package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		System.out.println();

		Conta contaDaCarol = new Conta();
		Conta contaDaFreitas = new Conta();

		// Determine the Carol data account
		contaDaCarol.numero = "100-85";
		contaDaCarol.titular = "Carol Mendes";
		contaDaCarol.tipo = "Corrente";
		contaDaCarol.ativa = true;
		contaDaCarol.depositar(100);

		// Determine the Freitas data account
		contaDaFreitas.numero = "200-96";
		contaDaFreitas.titular = "Bia Freitas";
		contaDaFreitas.tipo = "Corrente";
		contaDaFreitas.ativa = true;
		contaDaFreitas.depositar(200);

		// See the account cash with the name
		System.out.println("Titular: " + contaDaCarol.titular);
		contaDaCarol.mostrarSaldoDaConta();
		System.out.println("----------------------------------");
		System.out.println("Titular: " + contaDaFreitas.titular);
		contaDaFreitas.mostrarSaldoDaConta();
		System.out.println("----------------------------------");

		// Put 100 dollars in Carol account

		contaDaCarol.depositar(57);

		// See the account cash with the name
		System.out.println("Titular: " + contaDaCarol.titular);
		contaDaCarol.mostrarSaldoDaConta();
		System.out.println("----------------------------------");
		System.out.println("Titular: " + contaDaFreitas.titular);
		contaDaFreitas.mostrarSaldoDaConta();
		System.out.println("----------------------------------");

		// Put 100 dollars in Carol account

		contaDaCarol.depositar(-20);

		// See the account cash with the name
		System.out.println("Titular: " + contaDaCarol.titular);
		contaDaCarol.mostrarSaldoDaConta();
		System.out.println("----------------------------------");
		System.out.println("Titular: " + contaDaFreitas.titular);
		contaDaFreitas.mostrarSaldoDaConta();
		System.out.println("----------------------------------");
	}

}
