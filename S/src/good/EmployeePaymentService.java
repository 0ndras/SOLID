package good;

public class EmployeePaymentService {
    public EmployeePaymentService(EmployeeAdditionalPaymentService a) {
    }
    public int calculatePay(GoodEmployee a) {
        switch (a.getStatus()) {
            case "A":
                return 1;
            case "B":
                return 2;
            default:
                return 0;
        }
    }
}
