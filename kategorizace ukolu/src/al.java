import java.util.*;

public class al {
	public ArrayList<Ukol> AL = new ArrayList<Ukol>();
	
	public void pridatUkol (Ukol a) {
		AL.add(a);
	}
	
	public Collection najdiUkol (String nazev) {
		
		ArrayList<Ukol> ft = new ArrayList<Ukol>();
		
		for(Ukol a1:ft) {
			if(a1.ukol.contains(nazev)) {
				ft.add(a1);
			}
			
		}
		
		Collection coll2 = ft; 
		
		return coll2;
		
	}
	
}
