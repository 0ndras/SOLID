package com.solid.i;

import java.util.Date;

import bad.BadInvoicePrinter;
import bad.BadInvoicePrinter_I;
import bad.SomeOtherBadInvoicePrinter;
import good.GoodInvoicePrinter;
import good.GoodInvoicePrinter_I;
import good.SomeOtherGoodInvoicePrinter;
import good.SomeOtherGoodInvoicePrinter_I;

public class IMain {

	public static void main(String[] args) {
		testBadI();
		testGoodI();
	}

	private static void testBadI() {
		com.solid.i.Invoice invoice = new com.solid.i.Invoice(-132523);
		com.solid.i.ComplexInvoice complexInvoice = new com.solid.i.ComplexInvoice(21439, new Date());

		BadInvoicePrinter_I badInvoicePrinter = new BadInvoicePrinter();
		badInvoicePrinter.print(invoice);
		badInvoicePrinter.printComplexInvoice(complexInvoice);
		badInvoicePrinter.someOtherPrintMethod(invoice); //why should I be able to do this?
		
		BadInvoicePrinter_I someOtherBadInvoicePrinter = new SomeOtherBadInvoicePrinter();
		someOtherBadInvoicePrinter.print(invoice); //why should I be able to do this?
		someOtherBadInvoicePrinter.printComplexInvoice(complexInvoice); //why should I be able to do this?
		someOtherBadInvoicePrinter.someOtherPrintMethod(invoice);
	}

	private static void testGoodI() {
		com.solid.i.Invoice invoice = new com.solid.i.Invoice(423);
		com.solid.i.ComplexInvoice complexInvoice = new com.solid.i.ComplexInvoice(242, new Date());
		
		GoodInvoicePrinter_I goodInvoicePrinter = new GoodInvoicePrinter();
		goodInvoicePrinter.print(invoice);
		goodInvoicePrinter.printComplexInvoice(complexInvoice);
		// goodInvoicePrinter.someOtherPrintMethod(invoice); // unavailable! great.
		
		
		SomeOtherGoodInvoicePrinter_I someOtherGoodInvoicePrinter = new SomeOtherGoodInvoicePrinter();
		// other 2 methods are unavailable
		someOtherGoodInvoicePrinter.someOtherPrintMethod(invoice);
	}

}
