package drzewo;

public class RaportDrzewo implements RaportDrzewoBuildier {

	int wiek;
	int wysokosc;
	String nazwa;

	public RaportDrzewo(String nazwa, Drzewo drzewo) {
		wiek = drzewo.getWiek();
		wysokosc = drzewo.getWysokosc();
		this.nazwa = nazwa;
	}

	// @Override
	// public RaportDrzewo getOpis() {
	//
	// }

	

}
