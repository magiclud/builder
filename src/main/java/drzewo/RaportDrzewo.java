package drzewo;

public class RaportDrzewo {

	private String nazwa;
	private int wiek;
	private int wysokosc;

	public RaportDrzewo(int wiek, int wysokosc, String nazwa) {
		this.nazwa = nazwa;
		this.wiek = wiek;
		this.wysokosc = wysokosc;
	}

	public String getOpis() {
		if (wiek <= 0 && wysokosc <= 0) {
			return nazwa;
		}
		if (wiek <= 0) {
			return nazwa + " wysoksoc " + wysokosc;
		}
		if (wysokosc <= 0) {
			return nazwa + " wiek " + wiek;
		}
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
