package drzewo;

public class RaportDrzewo implements RaportDrzewoBuildier {

	private Drzewo drzewo;

	RaportDrzewo(Drzewo drzewo) {
		this.drzewo = drzewo;

	}

	public String getOpis() {
		return drzewo.getSzczegoly();
	}


}
