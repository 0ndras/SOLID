package good;

public class EmployeeRepository {
    public EmployeeRepository(){
    }
    public void save(GoodEmployee a) {
        System.out.printf("%s saved to database.\n", a.getName());
    }
}
