package drzewo;

public class Drzewo {

	private int wiek;
	private int wysokosc;
	private String nazwa;

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	public void setWysokosc(int wysokosc) {
		this.wysokosc = wysokosc;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getSzczegoly() {
		return nazwa + " wysokosc " + wysokosc + " wiek " + wiek;
	}
}
