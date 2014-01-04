package drzewo;

public interface RaportDrzewoBuildier {

	public RaportDrzewo getOpis(String nazwa);

	public RaportDrzewo getOpis(String nazwa, int wysokosc);

	public RaportDrzewo getOpis(String nazwa, int wysokosc, int wiek);

}
