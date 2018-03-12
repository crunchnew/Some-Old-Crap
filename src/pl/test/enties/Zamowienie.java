package pl.test.enties;

import java.util.Date;

public class Zamowienie {
	private int id_zamowienie;
	private Date data;
	private String adres;
	private Klient klient;
	
	public int getId_zamowienie() {
		return id_zamowienie;
	}
	public void setId_zamowienie(int id_zamowienie) {
		this.id_zamowienie = id_zamowienie;
	}

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public Klient getKlient() {
		return klient;
	}
	public void setKlient(Klient klient) {
		this.klient = klient;
	}
	
	public String toString() {
		return data.toString() + " " + this.adres;
	}
}
