package drzewo;

public class SosnaRaport implements SosnaRaportBudowniczy {

	String nazwa = "Sosna";
	int wysokosc;
	int wiek;
	Drzewo drzewo = new Drzewo();;
	RaportDrzewo raport;
	
	public SosnaRaport(Drzewo drzewo) {
		
		wiek = drzewo.getWiek();
		wysokosc = drzewo.getWysokosc();
	}

	@Override
	public RaportDrzewo getRaport(){
		return new RaportDrzewo(wiek, wysokosc, nazwa);
	}

	@Override
	public void buildWiek() {
		drzewo.setWiek(wiek);

	}

	@Override
	public void buildWysokosc() {
		drzewo.setWysokosc(wysokosc);

	}

};

