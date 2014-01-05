package drzewo;


public class WzorzecBuilderMain {
	DrzewoBuilder drzewo;
	RaportDrzewoBuildier raport;

	public WzorzecBuilderMain(DrzewoBuilder drzewo) {
		super();
		this.drzewo = drzewo;
	}

	public void stworzDrzewo() {
		this.drzewo.buildWiek();
		this.drzewo.buildWysokosc();
	}

	public Drzewo wezDrzewo() {
		return this.drzewo.getDrzewo();
	}

	public static void main(String[] args) {
		DrzewoBuilder lisciasteDrzewo = new LisciasteDrzewo();
		WzorzecBuilderMain utworzDrrzewo = new WzorzecBuilderMain(lisciasteDrzewo);
		utworzDrrzewo.stworzDrzewo();
		Drzewo pobierzDrzewo = utworzDrrzewo.wezDrzewo();
		// RaportDrzewoBuildier raport = new RaportDrzewo(pobierzDrzewo);

	}
}
