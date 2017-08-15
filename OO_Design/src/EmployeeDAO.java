
public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        System.out.println("Saved Employee To DB: " + employee);
    }

    public void deleteEmployee(Employee employee) {
        System.out.println("Deleted Employee from DB: " + employee);
    }
}
