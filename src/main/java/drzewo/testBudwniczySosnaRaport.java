package drzewo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testBudwniczySosnaRaport {

	@Test
	public void testDzilaniaBudowniczegoGdyMamWiekIWysokosc() {
		Drzewo drzewo = new Drzewo();
		drzewo.setWiek(111);
		drzewo.setWysokosc(123);

		// SosnaRaportBudowniczy calyRaport = new SosnaRaport(drzewo);
		// SosnaDirector crateRaport = new SosnaDirector(calyRaport);
		// RaportDrzewo raportSosna = crateRaport.wezRaport();
		DrzewoRaportBudowniczy calyRaport = new SosnaRaportBudwoniczy(drzewo);
		calyRaport.buildWiek();
		calyRaport.buildWysokosc();
		RaportDrzewo raport = calyRaport.getRaport();

		assertEquals(raport.getOpis(), "Sosna wiek 111 wysokosc 123");
	}

	@Test
	public void testDzilaniaBudowniczegoGdyMamWiek() {
		Drzewo drzewo = new Drzewo();
		drzewo.setWiek(111);

		DrzewoRaportBudowniczy calyRaport = new SosnaRaportBudwoniczy(drzewo);
		calyRaport.buildWiek();
		calyRaport.buildWysokosc();
		RaportDrzewo raport = calyRaport.getRaport();

		assertEquals(raport.getOpis(), "Sosna wiek 111");
	}

	@Test
	public void testDzilaniaBudowniczegoGdyMamWysokosc() {
		Drzewo drzewo = new Drzewo();
		drzewo.setWysokosc(123);

		// DrzewoRaportBudowniczy calyRaport = new DrzewoRaportBudowniczy();
		DrzewoRaportBudowniczy calyRaport = new SosnaRaportBudwoniczy(drzewo);
		calyRaport.buildWiek();
		calyRaport.buildWysokosc();
		RaportDrzewo raport = calyRaport.getRaport();

		assertEquals(raport.getOpis(), "Sosna wysokosc 123");
	}
}
