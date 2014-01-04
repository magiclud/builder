package drzewo;


public class LisciasteDrzewo implements DrzewoBuilder {
	private Drzewo drzewo;

	public LisciasteDrzewo() {
		drzewo = new Drzewo();
	}

	@Override
	public void buildWiek() {
		System.out.println("ustawiam wiek");
		drzewo.setWiek(110);

	}

	@Override
	public void buildWysokosc() {
		System.out.println("ustawoiam wysokosc");
		drzewo.setWysokosc(50);

	}

	@Override
	public Drzewo getDrzewo() {
		return drzewo;
	}

	@Override
	public void buildNazwa() {
		System.out.println("ustawiam nazwe");
		drzewo.setNazwa("Sosna");

	}

}
