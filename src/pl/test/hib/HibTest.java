package pl.test.hib;

import pl.test.enties.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibTest {

	public static void main(String[] args) {
	boolean cos = true;
	
	Configuration config = new Configuration().configure();
	SessionFactory factory = config.buildSessionFactory();
	Session hibSession = factory.openSession();
	
	if ( cos == true ) {
		List l = hibSession.createQuery("SELECT k.id from Klient k").list();
		
		System.out.println(l.size());
	
		List<Klient> l2 = hibSession.createQuery("FROM Klient").list();
		for( Klient o: l2) {
			System.out.println( o.toString() );
			}
//		
//		List l3 = hibSession.createQuery("From Klient").list();
//		for( Object o: l3) {
//			Klient temp = (Klient) o;
//			System.out.println( temp.toString());
//			}
		
		//KlientFirmowy kl = (KlientFirmowy) hibSession.get(KlientFirmowy.class, 10);
		KlientZagraniczny kl = (KlientZagraniczny) hibSession.get(KlientZagraniczny.class,10);
		System.out.println( "Klient nr 10: " + kl.toString() );
		
		for(Telefon z : kl.getTelefony() ){
			System.out.println(z.toString());
		}
		
		Map<String,String> telMap = kl.getNumeryModele();
	     
	      for (Iterator iter = telMap.entrySet().iterator(); iter.hasNext();) {
	    	  Map.Entry e = (Map.Entry) iter.next();
	    	  
	    	  System.out.println("For loop  ->" + e.getValue() + "<- ->" + e.getKey() + "<-");
	    	}
	      
	      for(Entry<String,String> e: kl.getNumeryModele().entrySet()) {
	    	  System.out.println("For loop II ->" + e.getKey() + "<- ->" +e.getValue()  + "<-" + kl.toString()) ;  
	      }
		
	//	Zamowienie zam = (Zamowienie) hibSession.get(Zamowienie.class, 1);
	//	System.out.println( "Zamowienie nr 1: " + zam.toString() + zam.getKlient().toString());
		
		} // if
	else {
		Transaction tr = hibSession.beginTransaction();

			Klient klient = new Klient();
			klient.setImie("Bob");
			klient.setNazwisko("Smirnof");
		
			Set<Zamowienie> zbior = new HashSet<Zamowienie>();
			
			Zamowienie zamowienie = new Zamowienie();
			zamowienie.setAdres("Dallas Oil Valley 34th 67890");
			zamowienie.setData(new Date());
			zamowienie.setKlient(klient);
			zbior.add(zamowienie);
			
			Zamowienie zamowienie2 = new Zamowienie();
			zamowienie2.setAdres("Los Angeles Alley Cat 34");
			zamowienie2.setData(new Date());
			zamowienie2.setKlient(klient);
			zbior.add(zamowienie2);
			
			klient.setZamowienia(zbior);
			hibSession.persist(klient);
		
		tr.commit();	
	}
	if(3 != 3) {
		Transaction tr = hibSession.beginTransaction();
		
			Klient klientTest = new Klient("Michail","Gorbaczew");
			Set<Telefon> zbiorTelefonow = new HashSet<Telefon>();
			final int iloscTelefonow = 3;
			Telefon[] tel = new Telefon[iloscTelefonow];
			for(int i =0; i < iloscTelefonow;i++) {
				tel[i] = new Telefon();
				tel[i].setKlient(klientTest);
			}
			tel[0].setModel("Samsung");
			tel[0].setNumer("077-4613319");
			
			tel[1].setModel("LG");
			tel[1].setNumer("077-4618861");
			
			tel[2].setModel("Motorolla");
			tel[2].setNumer("077-4618869");
			
			for(Telefon t: tel){
				zbiorTelefonow.add(t);
			}
			
//			zbiorTelefonow.add(tel[0]);
//			zbiorTelefonow.add(tel[1]);
//			zbiorTelefonow.add(tel[2]);
			
			klientTest.setTelefony(zbiorTelefonow);
			hibSession.persist(klientTest);
			
			tr.commit();
		}
	
	if(3 != 3) {
		Transaction tr = hibSession.beginTransaction();
		Telefon tel = new Telefon();
		tel.setModel("CoŒ jak Nokia");
		tel.setNumer("012-07707770");
		tel.setKlient((Klient) hibSession.get(Klient.class, 10));
		hibSession.persist(tel);
		tr.commit();
	}
	}// public static void main(String[] args) {
}
