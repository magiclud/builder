package drzewo;


public class SosnaRaportWiek implements SosnaRaportBudowniczy {

	String nazwa = "Sosna";
	int wiek;
	Drzewo drzewo;
	RaportDrzewo raport;

	public SosnaRaportWiek(Drzewo drzewo) {

		wiek = drzewo.getWiek();
	}

	public Drzewo getDrzewo() {
		return drzewo;
	}

	public RaportDrzewo getRaport() {
		return new RaportDrzewo(drzewo, nazwa);
	}

	@Override
	public void buildWiek() {
		drzewo.setWiek(wiek);
	}

	@Override
	public void buildWysokosc() {
		// TODO Auto-generated method stub

	}

}
