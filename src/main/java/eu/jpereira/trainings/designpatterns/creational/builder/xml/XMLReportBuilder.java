package eu.jpereira.trainings.designpatterns.creational.builder.xml;

import java.util.Iterator;

import eu.jpereira.trainings.designpatterns.creational.builder.HTMLReportBody;
import eu.jpereira.trainings.designpatterns.creational.builder.model.RaportBuilder;
import eu.jpereira.trainings.designpatterns.creational.builder.model.ReportBody;
import eu.jpereira.trainings.designpatterns.creational.builder.model.SaleEntry;
import eu.jpereira.trainings.designpatterns.creational.builder.model.SoldItem;

public class XMLReportBuilder implements RaportBuilder {

	ReportBody xmlRaport;

	XMLReportBuilder() {
		xmlRaport = new XMLReportBody();
	}

	@Override
	public ReportBody getRaportBody() {
		return xmlRaport;
	}

	@Override
	public void buildSaleEntry(SaleEntry saleEntry) {
		HTMLReportBody reportBody = new HTMLReportBody();

		reportBody.putContent("<span class=\"customerName\">");
		reportBody.putContent(saleEntry.getCustomer().getName());
		reportBody.putContent("</span><span class=\"customerPhone\">");
		reportBody.putContent(saleEntry.getCustomer().getPhone());
		reportBody.putContent("</span>");

		reportBody.putContent("<items>");

		Iterator<SoldItem> it = saleEntry.getSoldItems().iterator();
		while (it.hasNext()) {
			SoldItem soldEntry = it.next();
			reportBody.putContent("<item><name>");
			reportBody.putContent(soldEntry.getName());
			reportBody.putContent("</name><quantity>");
			reportBody.putContent(soldEntry.getQuantity());
			reportBody.putContent("</quantity><price>");
			reportBody.putContent(soldEntry.getUnitPrice());
			reportBody.putContent("</price></item>");
		}
		reportBody.putContent("</items>");

	}

}
