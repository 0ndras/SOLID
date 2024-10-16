package good;

public class GoodInvoicePrinter implements GoodInvoicePrinter_I {
    @Override
    public void print(com.solid.i.Invoice invoice) {
        System.out.println("Printing invoice " + invoice);
    }

    @Override
    public void printComplexInvoice(com.solid.i.ComplexInvoice complexInvoice) {
        System.out.println("Printing complex invoice " + complexInvoice);
    }
}
