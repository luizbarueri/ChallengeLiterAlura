package com.challenge.literalura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiteraluraApplication {

	public static void main(String[] args) {

		SpringApplication.run(LiteraluraApplication.class, args);

		Scanner leitura = new Scanner(System.in);

		boolean fim = true;
		int opcao = 0;
		String opcaoIdioma = "pt";

		while (fim) {
			System.out.println("1- buscar livro pelo titulo");
			System.out.println("2- listar livros registrados");
			System.out.println("3- listar autores registrados");
			System.out.println("4- listar autores vivos em um determinado ano");
			System.out.println("5- listar livros em um determinado idioma");
			System.out.println("0- sair");

			try {
				opcao = leitura.nextInt();
				switch (opcao) {
					case 1:
						System.out.println("Insira o nome do livro que voce deseja procurar");
						String nomeLivro = leitura.next().toString();
						System.out.println("---------LIVRO---------------");
						System.out.println("Livro buscado: " + nomeLivro);
						System.out.println("-----------------------------");
						break;
					case 5:
						System.out.println("Insira o idioma para realizar a busca");
						System.out.println("es- espanhol");
						System.out.println("en- ingles");
						System.out.println("fr- frances");
						System.out.println("pt- portugues");
						opcaoIdioma = leitura.next();
						switch (opcaoIdioma) {
							case "es":
								System.out.println("Buscado idioma: " + opcaoIdioma);
								break;
							case "en":
								System.out.println("Buscado idioma: " + opcaoIdioma);
								break;
							case "fr":
								System.out.println("Buscado idioma: " + opcaoIdioma);
								break;
							case "pt":
								System.out.println("Buscado idioma: " + opcaoIdioma);
								break;
							default:
								System.out.println("idioma inválido na busca");
								break;
						}
					case 0:
						System.out.println("Programa finalizado");
						fim = false;
						break;
					default:
						System.out.println("Opção inválida! :> " + opcao);
						break;
				}
			} catch (Exception e) {
				System.out.println("Erro! Digite um número válido de 1 a 5");
				fim = false;
			}

		}

	}

}
