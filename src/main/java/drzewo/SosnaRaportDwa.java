package drzewo;


public class SosnaRaportDwa {

	String nazwa = "Sosna";
	int wysokosc;
	Drzewo drzewo;
	RaportDrzewo raport;

	public SosnaRaportDwa(Drzewo drzewo) {

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
		return raport.getOpis();
	}

}
