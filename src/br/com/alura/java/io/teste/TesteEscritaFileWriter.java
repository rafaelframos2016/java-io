package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		long ini = System.currentTimeMillis();
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("teste");
		bw.newLine();
		bw.write("lkadjfkdjk as kak fdsj");
		bw.close();
		long fim = System.currentTimeMillis();

		System.out.println("Tempo decorrrido: " + (fim - ini)
				+ " milissegundos");
	}

}
