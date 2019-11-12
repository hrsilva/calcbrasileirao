package bin;

import java.util.Scanner;

import cli.MenuPrincipalCLI;
import gui.Menu;
import postgres.BancoFactoryDAO;
import postgres.ResultadoDAO;

public class Main {

	public static void main(String[] args) {

		
		Scanner b = new Scanner(System.in);
		/*
		int a; = b.nextInt();

		if (a == 1) {
			new Menu().inicia();

		} else {
			new MenuPrincipalCLI().inicia();
		}
		*/
		BancoFactoryDAO bd = new BancoFactoryDAO();
		
		BancoFactoryDAO a1= new BancoFactoryDAO();
		ResultadoDAO resultado = a1.getResultado();
		System.out.println("derrotas "+resultado.getResultado(1).getDerrotas());
		System.out.println("vitorias "+resultado.getResultado(1).getVitorias());
		System.out.println("pontuacao "+resultado.getResultado(1).getPontos());
	}
}
