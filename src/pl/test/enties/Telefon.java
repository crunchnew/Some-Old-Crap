package pl.test.enties;

public class Telefon {
	
	private int id_telefon;
	private Klient klient;
	private String numer;
	private String model;
	
	public int getId_telefon() {
		return id_telefon;
	}
	public void setId_telefon(int id_telefon) {
		this.id_telefon = id_telefon;
	}
	public String getNumer() {
		return numer;
	}
	public void setNumer(String numer) {
		this.numer = numer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Klient getKlient() {
		return klient;
	}
	public void setKlient(Klient klient) {
		this.klient = klient;
	}

	@Override
	public String toString() {
		return numer + " " + model;
	}
	
}
