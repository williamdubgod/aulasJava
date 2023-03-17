package program;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.http.ParseException;
import org.json.JSONException;

import model.Filmes;
import service.API;

public class Programa {
		
		public static void main(String[] args) throws ParseException, JSONException, IOException {
			Scanner ler = new Scanner(System.in);
			
			API apiFilm = new API();
			HashMap<Integer, Filmes> filme = apiFilm.getFilmes();
			
			System.out.print(apiFilm.printFilmes(filme));
			while(true)
				System.out.print(apiFilm.getOpcao(filme));

		}

}