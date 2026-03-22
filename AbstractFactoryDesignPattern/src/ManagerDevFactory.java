public class ManagerDevFactory extends EmployeeAbstractFactory{
    public Employee createEmployee()
    {
        return new Manager();
    }
}
