public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory fac)
    {
        return fac.createEmployee();
    }
}
