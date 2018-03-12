package pl.test.enties;

import java.util.Date;

public class KlientPrywatny extends Klient {
	private Date data_urodzenia;

	public Date getData_urodzenia() {
		return data_urodzenia;
	}

	public void setData_urodzenia(Date data_urodzenia) {
		this.data_urodzenia = data_urodzenia;
	}
	
	@Override
	public String toString() {
		return this.getId() + " " + this.getImie() +  " " + this.getNazwisko() + " " + this.getData_urodzenia();
	}
	
}
