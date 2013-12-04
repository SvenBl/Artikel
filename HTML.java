import java.util.ArrayList;


public class HTML implements Rechnung{
	public ArrayList<Artikel> liste = new ArrayList<Artikel>();
		
	@Override
	public void drucken(){
		System.out.println("<table>");
		for(Artikel k : liste){
			System.out.println("<tr>");
			System.out.println("<td>"+k.getArtikelbezeichnung()+"</td>");
			System.out.println("<td>"+k.getPreis()+"</td>");
			System.out.println("</tr>");
		}
		
		System.out.println("</table>");
	}

	@Override
	public void add(Artikel artikel) {
		liste.add(artikel);		
	}

}
