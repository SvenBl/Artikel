
public class Artikel {
	private String artikelbezeichnung;
	private double preis;
	
	public Artikel(String artikelbezeichnung, double preis){
		this.artikelbezeichnung = artikelbezeichnung;
		this.preis = preis;
	}
	
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getArtikelbezeichnung() {
		return artikelbezeichnung;
	}
	public void setArtikelbezeichnung(String artikelbezeichnung) {
		this.artikelbezeichnung = artikelbezeichnung;
	}
	
	
}
