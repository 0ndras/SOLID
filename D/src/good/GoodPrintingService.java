package good;

public class GoodPrintingService {
    public GoodPrintingService(PrintingService a){}
    public void print(com.solid.i.Invoice invoice) {
        System.out.println("Printing invoice " + invoice);
    }
}
