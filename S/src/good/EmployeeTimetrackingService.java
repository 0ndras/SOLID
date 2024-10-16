package good;

public class EmployeeTimetrackingService {
    public EmployeeTimetrackingService(){}
    public String reportHours(GoodEmployee a) {
        return String.format("%s worked %d hours.\n", a.getName(), a.getHours());
    }
}
