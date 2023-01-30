package java_inheritance_shop;

public class Main {

		public static void main(String[] args) {


			
			
			
			Smartphone Telefono = new Smartphone(1, "S22", "Samsung", 550, 19, "87459874368546", 256);
			System.out.println(Telefono);
			System.out.println("---Prossimo Prodotto---");

			
			
			
			Televisore Television = new Televisore(2, "Samsung mega schermo", "Samsung", 500, 22, 22, false);
			System.out.println(Television);
			System.out.println("---Prossimo Prodotto---");

			
			
			
			Cuffie Cuff = new Cuffie(3, "Artic seals", "artic", 25, 22, "white", true);
			System.out.println(Cuff);
		}
	}

