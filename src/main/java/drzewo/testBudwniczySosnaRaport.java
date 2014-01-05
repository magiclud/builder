package drzewo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testBudwniczySosnaRaport {

	@Test
	public void testDzilaniaBudowniczego() {
		Drzewo drzewo = new Drzewo();
		drzewo.setWiek(111);
		drzewo.setWysokosc(123);

		// SosnaRaportBudowniczy calyRaport = new SosnaRaport(drzewo);
		// SosnaDirector crateRaport = new SosnaDirector(calyRaport);
		// RaportDrzewo raportSosna = crateRaport.wezRaport();
		SosnaRaportBudowniczy calyRaport = new SosnaRaport(drzewo);
		calyRaport.buildWiek();
		calyRaport.buildWysokosc();
		RaportDrzewo raport = calyRaport.getRaport();

		assertEquals(raport.getOpis(), "Sosna wiek 111 wysokosc 123");
	}

}
