import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Program nefunguje, snažil jsem se ještì na to pøijít
		//Ale už tahle to odevzdávám o hodinu pozdìji, tak alespoò tahle
		//Omlouvám se
		
		Ukol uk1 = new Ukol("Koupit mouku", Priorita.DULEZITE_NENALEHAVE);
		Ukol uk2 = new Ukol("Koupit rohlik", Priorita.NEDULEZITE_NALEHAVE);
		Ukol uk3 = new Ukol("Odjed na nakup", Priorita.DULEZITE_NENALEHAVE);
		Ukol uk4 = new Ukol("Jdi si hrát", Priorita.NEDULEZITE_NENALEHAVE);
		Ukol uk5 = new Ukol("Kup si psa", Priorita.DULEZITE_NENALEHAVE);
		Ukol uk6 = new Ukol("Prodej kocku", Priorita.DULEZITE_NENALEHAVE);
		Ukol uk7 = new Ukol("Jed na motorce", Priorita.DULEZITE_NENALEHAVE);
		Ukol uk8 = new Ukol("Jdi do autoskoly", Priorita.DULEZITE_NENALEHAVE);
		Ukol uk9 = new Ukol("Zacvic si", Priorita.DULEZITE_NENALEHAVE);
		Ukol uk10 = new Ukol("Zahraj si hry", Priorita.DULEZITE_NENALEHAVE);
		Ukol uk11 = new Ukol("Vypni pocitac", Priorita.NEDULEZITE_NENALEHAVE);
		Ukol uk12 = new Ukol("Najdi si praci", Priorita.DULEZITE_NALEHAVE);
		
		al arrayList = new al();
		hm linkedList = new hm();
		s hashSet = new s();
		
		arrayList.pridatUkol (uk1);
		linkedList.pridatUkol (uk2);
		hashSet.pridatUkol (uk3);
		arrayList.pridatUkol (uk4);
		linkedList.pridatUkol (uk5);
		hashSet.pridatUkol (uk6);
		arrayList.pridatUkol (uk7);
		linkedList.pridatUkol (uk8);
		hashSet.pridatUkol (uk9);
		arrayList.pridatUkol (uk10);
		linkedList.pridatUkol (uk11);
		hashSet.pridatUkol (uk12);
		
		
		arrayList.najdiUkol("Koupit");
		linkedList.najdiUkol("Koupit");
		hashSet.najdiUkol("Koupit");
		
		

	}
}
