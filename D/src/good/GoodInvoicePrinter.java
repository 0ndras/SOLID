package good;

public class GoodInvoicePrinter implements PrintingService {
    public GoodInvoicePrinter(){}

    public void print(com.solid.i.Invoice invoice) {
        System.out.println("Printing invoice by good " + invoice);
    }
}
