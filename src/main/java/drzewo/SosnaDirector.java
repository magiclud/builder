package drzewo;

public class SosnaDirector {

	SosnaRaportBudowniczy drzewo;
	RaportDrzewoBuildier raport;

	public SosnaDirector(SosnaRaportBudowniczy drzewo) {
		super();
		this.drzewo = drzewo;
	}

	public void stworzDrzewo() {
		this.drzewo.buildWiek();
		this.drzewo.buildWysokosc();
	}

	public RaportDrzewo wezRaport() {
		return this.drzewo.getRaport();
	}

	public static void main(String[] args) {
		DrzewoBuilder lisciasteDrzewo = new LisciasteDrzewo();
		WzorzecBuilderMain utworzDrrzewo = new WzorzecBuilderMain(lisciasteDrzewo);
		utworzDrrzewo.stworzDrzewo();
		Drzewo pobierzDrzewo = utworzDrrzewo.wezDrzewo();
		// RaportDrzewoBuildier raport = new RaportDrzewo(pobierzDrzewo);

	}
}
