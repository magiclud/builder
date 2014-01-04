package drzewo;

public class SosnaRaport implements RaportDrzewoBuildier {

	String nazwa;
	Drzewo drzewo;

	public SosnaRaport(Drzewo drzewo, String nazwa) {
		this.nazwa = nazwa;
	}

	public RaportDrzewo getOpis() {
		return new RaportDrzewo(drzewo, nazwa);
	}


}
