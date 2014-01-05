package drzewo;


public class SosnaRaportWysokosc implements SosnaRaportBudowniczy {

	String nazwa = "Sosna";
	int wysokosc;
	Drzewo drzewo;
	RaportDrzewo raport;

	public SosnaRaportWysokosc(Drzewo drzewo) {

		wysokosc = drzewo.getWysokosc();
	}

	public void buildWysokosc(int wysokosc) {
		drzewo.setWysokosc(wysokosc);

	}

	public Drzewo getDrzewo() {
		// TODO Auto-generated method stub
		return drzewo;
	}

	public RaportDrzewo getRaport() {
		return new RaportDrzewo(wysokosc, nazwa);
	}

	@Override
	public void buildWiek() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildWysokosc() {
		drzewo.setWysokosc(wysokosc);
		
	}

}
