package java_inheritance_shop;

import java_inheritance_shop.Prodotto;

public class Main {

	public static void main(String[] args) {
		Prodotto Kart = new Prodotto("Kart", "Kart 125cc e 250cc", 350);
		System.out.println("Codice Prodotto = "+Kart.codice);
		Kart.printBasePrice(Kart.prezzo);
		Kart.printivaPrice(Kart.prezzo);
		Kart.printFullName(Kart.codice,  Kart.nome);
		
	}

}