package java_inheritance_shop;

public class Cuffie extends Prodotto {
	private String colore;
	private boolean wireless;

	Cuffie(int codice, String nome, String marca, double prezzo, int iva, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	@Override
	public String toString() {
		return super.toString() + "\ncolore: " + getColore() + "\nwireless: " + isWireless();
	}
}
