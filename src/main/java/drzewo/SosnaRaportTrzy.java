package drzewo;


public class SosnaRaportTrzy {

	String nazwa = "Sosna";
	int wysokosc;
	int wiek;
	Drzewo drzewo;
	RaportDrzewo raport;

	public SosnaRaportTrzy(Drzewo drzewo) {

		wysokosc = drzewo.getWysokosc();
	}

	public void buildWysokosc(int wysokosc) {
		drzewo.setWysokosc(wysokosc);

	}

	public void buildWiek(int wiek) {
		drzewo.setWiek(wiek);
	}

	public Drzewo getDrzewo() {
		return drzewo;
	}

	public RaportDrzewo getRaport() {
		return raport.getOpis();
	}

}
