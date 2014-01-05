package drzewo;

public class SosnaRaportBudwoniczy implements DrzewoRaportBudowniczy {

	String nazwa = "Sosna";
	Drzewo drzewo = new Drzewo();
	

	@Override
	public RaportDrzewo getRaport(){
		return new RaportDrzewo(drzewo, nazwa);
	}

	@Override
	public void buildWiek(int wiek) {
		drzewo.setWiek(wiek);

	}

	@Override
	public void buildWysokosc(int wysokosc) {
		drzewo.setWysokosc(wysokosc);

	}

};

