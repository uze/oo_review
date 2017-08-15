
public class ClientModule {

    public static void main(String args[]){

        Employee employee = new Employee(1, "Bob", "Sales", false);

        ClientModule.hireNewEmployee(employee);

        printEmployeeReport(employee, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);

    }

    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
