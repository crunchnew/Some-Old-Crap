package pl.test.enties;

public class KlientZagraniczny extends Klient {

	private int id_klient_zagraniczny;
	private String companyName;
	
	public int getId_klient_zagraniczny() {
		return id_klient_zagraniczny;
	}
	public void setId_klient_zagraniczny(int id_klient_zagraniczny) {
		this.id_klient_zagraniczny = id_klient_zagraniczny;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Override
	public String toString() {
		
		return this.getId() + " " + this.getImie() +  " " + this.getNazwisko() + " " + this.getCompanyName();
	}
	
}
