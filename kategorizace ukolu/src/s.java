import java.util.*;
public class s {

	HashSet<Ukol> set=new HashSet<Ukol>(); 
	
	public void pridatUkol (Ukol c) {
		set.add(c);
	}
	
	public Collection najdiUkol (String nazev) {
	
	Iterator<Ukol> itr=set.iterator();
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}
	return (Collection) itr;
	}
}
