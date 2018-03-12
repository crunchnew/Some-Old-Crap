package pl.test.enties;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Klient {
	private int id;
	private String imie;
	private String nazwisko;
	private Set<Zamowienie> zamowienia;
	private Set<Telefon> telefony;
	private Map<String,String> numeryModele = new HashMap<String,String>();
	
	
	public Klient(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	public Klient() {
		
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return this.getId() + " " + this.getImie() +  " " + this.getNazwisko() + " BASE";
	}
	public Set<Zamowienie> getZamowienia() {
		return zamowienia;
	}
	public void setZamowienia(Set<Zamowienie> zamowienia) {
		this.zamowienia = zamowienia;
	}
	public Set<Telefon> getTelefony() {
		return telefony;
	}
	public void setTelefony(Set<Telefon> telefony) {
		this.telefony = telefony;
	}
	public Map<String,String> getNumeryModele() {
		return numeryModele;
	}
	public void setNumeryModele(Map<String,String> numeryModele) {
		this.numeryModele = numeryModele;
	}
}
