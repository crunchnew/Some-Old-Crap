package pl.test.enties;

public class KlientFirmowy extends Klient {
	private String nip;
	private String nazwaFirmy;
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getNazwaFirmy() {
		return nazwaFirmy;
	}
	public void setNazwaFirmy(String nazwaFirmy) {
		this.nazwaFirmy = nazwaFirmy;
	}
	@Override
	public String toString() {
		
		return this.getId() + " " + this.getImie() +  " " + this.getNazwisko() + " " + this.getNazwaFirmy() + " " + this.getNip();
	}
}
