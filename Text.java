import java.util.ArrayList;


public class Text implements Rechnung {
	public ArrayList<Artikel> liste = new ArrayList<Artikel>();

	@Override
	public void drucken(){
		for(Artikel k : liste){
			System.out.println(k.getArtikelbezeichnung()+": "+ k.getPreis());
		}
	}

	@Override
	public void add(Artikel artikel) {
		liste.add(artikel);		
	}


}
