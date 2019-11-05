package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			Integer agencia = Integer.valueOf(linhaScanner.nextInt());
			Integer numero = Integer.valueOf(linhaScanner.nextInt());
			String titular = linhaScanner.next();
			Double saldo = Double.valueOf(linhaScanner.nextDouble());

			Object[] arg = new Object[5];
			arg[0] = tipoConta;
			arg[1] = agencia;
			arg[2] = numero;
			arg[3] = titular;
			arg[4] = saldo;
			System.out.format(new Locale("pt", "BR"),"%s - %d-%d, %s: %f %n", arg);

			linhaScanner.close();
		}
		scanner.close();
	}

}