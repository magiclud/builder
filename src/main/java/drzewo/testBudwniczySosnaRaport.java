package drzewo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testBudwniczySosnaRaport {

	@Test
	public void testDzilaniaBudowniczegoGdyMamWiekIWysokosc() {

		// SosnaRaportBudowniczy calyRaport = new SosnaRaport(drzewo);
		// SosnaDirector crateRaport = new SosnaDirector(calyRaport);
		// RaportDrzewo raportSosna = crateRaport.wezRaport();
		DrzewoRaportBudowniczy calyRaport = new SosnaRaportBudwoniczy();
		calyRaport.buildWiek(111);
		calyRaport.buildWysokosc(123);
		RaportDrzewo raport = calyRaport.getRaport();

		assertEquals(raport.getOpis(), "Sosna wiek 111 wysokosc 123");
	}

	@Test
	public void testDzilaniaBudowniczegoGdyMamWiek() {

		DrzewoRaportBudowniczy calyRaport = new SosnaRaportBudwoniczy();
		calyRaport.buildWiek(111);
		RaportDrzewo raport = calyRaport.getRaport();

		assertEquals(raport.getOpis(), "Sosna wiek 111");
	}

	@Test
	public void testDzilaniaBudowniczegoGdyMamWysokosc() {
		// DrzewoRaportBudowniczy calyRaport = new DrzewoRaportBudowniczy();
		DrzewoRaportBudowniczy calyRaport = new SosnaRaportBudwoniczy();
		calyRaport.buildWysokosc(123);
		RaportDrzewo raport = calyRaport.getRaport();

		assertEquals(raport.getOpis(), "Sosna wysokosc 123");
	}
}
