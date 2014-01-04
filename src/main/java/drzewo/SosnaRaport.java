package drzewo;

public class SosnaRaport  {

	String nazwa = "Sosna";
	int wysokosc;
	int wiek;
	Drzewo drzewo;
	RaportDrzewo raport;
	
	public SosnaRaport(Drzewo drzewo) {
		
		wiek = drzewo.getWiek();
	}

	
	public void buildWiek(int wiek) {
		drzewo.setWiek(wiek);

	}

	public Drzewo getDrzewo() {
		// TODO Auto-generated method stub
		return drzewo;
	}

	public RaportDrzewo getRaport(){
		raport = new RaportDrzewo(nazwa, drzewo);
		return raport.getOpis();
	}

};

