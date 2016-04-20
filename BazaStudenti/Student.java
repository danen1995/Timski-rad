import java.io.Serializable;

public class Student implements Serializable {
	private String brIndeksa, imePrezime, dodatneAktivnosti;
	private double prosek;
	
	
	public Student(String brIndeksa, String imePrezime, String dodatneAktivnosti, double prosek) {
		super();
		this.brIndeksa = brIndeksa;
		this.imePrezime = imePrezime;
		this.dodatneAktivnosti = dodatneAktivnosti;
		this.prosek = prosek;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getDodatneAktivnosti() {
		return dodatneAktivnosti;
	}

	public void setDodatneAktivnosti(String dodatneAktivnosti) {
		this.dodatneAktivnosti = dodatneAktivnosti;
	}

	public double getProsek() {
		return prosek;
	}

	public void setProsek(double prosek) {
		this.prosek = prosek;
	}

}
