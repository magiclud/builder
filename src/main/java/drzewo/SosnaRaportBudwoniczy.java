package drzewo;

public class SosnaRaportBudwoniczy implements DrzewoRaportBudowniczy {

	String nazwa = "Sosna";
	int wysokosc;
	int wiek;
	Drzewo drzewo = new Drzewo();;
	RaportDrzewo raport;
	
	public SosnaRaportBudwoniczy(Drzewo drzewo) {
		
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

