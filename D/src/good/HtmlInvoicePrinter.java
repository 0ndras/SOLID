package good;

public class HtmlInvoicePrinter implements PrintingService{
    public HtmlInvoicePrinter(){}
    public void print(com.solid.i.Invoice invoice) {
        System.out.println("Printing invoice by html " + invoice);
    }
}
