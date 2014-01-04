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

	@Override
	public RaportDrzewo getOpis(String nazwa) {
		return new RaportDrzewo(nazwa);
	}

	@Override
	public RaportDrzewo getOpis(String nazwa, int wysokosc) {
		return new RaportDrzewo(nazwa, wysokosc);
	}

	@Override
	public RaportDrzewo getOpis(String nazwa, int wysokosc, int wiek) {
		// TODO Auto-generated method stub
		return new RaportDrzewo(nazwa, wysokosc, wiek);
	}


}
