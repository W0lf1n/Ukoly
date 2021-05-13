import java.util.*;
public class hm  {
	
	public LinkedList<Ukol> lList = new LinkedList<Ukol>();
	
	public void pridatUkol (Ukol b) {
		lList.add(b);
	}
	
	public Collection najdiUkol (String nazev) {
	
	Iterator<Ukol> itr=lList.iterator();
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}
	return (Collection) itr;
	}
	
}
