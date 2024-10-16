package good;

public class SomeOtherGoodInvoicePrinter implements SomeOtherGoodInvoicePrinter_I {
    @Override
    public void someOtherPrintMethod(com.solid.i.Invoice invoice) {
        System.out.println("Printing the invoice in a totally different way "
                + invoice);
    }
}
