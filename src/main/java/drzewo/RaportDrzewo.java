package drzewo;

public class RaportDrzewo implements DrzewoBuilder {

	Drzewo drzewo;
	int wiek;
	int wysokosc;
	String nazwa;

	RaportDrzewo(Drzewo drzewo, String nazwa) {
		this.drzewo = drzewo;
		wiek = drzewo.getWiek();
		wysokosc = drzewo.getWysokosc();
		this.nazwa = nazwa;
		System.out.println(nazwa + " wiek " + drzewo.getWiek() + " wysokosc " + drzewo.getWysokosc());
	}

	@Override
	public void buildWiek() {
		drzewo.setWiek(wiek);

	}

	@Override
	public void buildWysokosc() {
		drzewo.setWysokosc(wysokosc);

	}

	@Override
	public Drzewo getDrzewo() {
		// TODO Auto-generated method stub
		return drzewo;
	}

}
