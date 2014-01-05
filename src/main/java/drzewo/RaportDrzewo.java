package drzewo;

public class RaportDrzewo {

	private String nazwa;
	private int wiek;
	private int wysokosc;

	public RaportDrzewo(Drzewo drzewo, String nazwa) {
		this.nazwa = nazwa;
		wiek = drzewo.getWiek();
		wysokosc = drzewo.getWysokosc();
	}

	public String getOpis() {
		return nazwa + " wiek " + wiek + " wysoskosc " + wysokosc;

	}

	// @Override
	// public void buildWiek() {
	// drzewo.setWiek(wiek);
	//
	// }
	//
	// @Override
	// public void buildWysokosc() {
	// drzewo.setWysokosc(wysokosc);
	//
	// }
	//
	// @Override
	// public Drzewo getDrzewo() {
	// // TODO Auto-generated method stub
	// return drzewo;
	// }

}
