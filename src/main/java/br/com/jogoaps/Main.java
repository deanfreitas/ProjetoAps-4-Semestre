package br.com.jogoaps;

import java.io.IOException;

public class Main {

	public static void main(String arg[]) {
		try {
			new InicioJogo().setVisible(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
