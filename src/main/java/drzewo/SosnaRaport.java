package drzewo;

public class SosnaRaport implements RaportDrzewoBuildier {

	String nazwa;
	int wysokosc;
	int wiek;

	public SosnaRaport(Drzewo drzewo, String nazwa) {
		this.nazwa = nazwa;
		wysokosc = drzewo.getWysokosc();
		wiek = drzewo.getWiek();
	}

	public RaportDrzewo getOpis() {
		// inne opcje
		// retiurn new RportDrzewo(nazwa);
		// return new ReportDrzewo(nazwa, wysokosc);
		return new RaportDrzewo(nazwa, wysokosc, wiek);
	}


}
