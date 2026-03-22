//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

       Employee emp= EmployeeFactory.getEmployee(new AndroidDevFactory());
       System.out.println("android developer "+emp.salary());

        Employee emp2= EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println("Web developer "+emp2.salary());

        Employee emp3= EmployeeFactory.getEmployee(new ManagerDevFactory());
        System.out.println("Manager" +
                " developer "+emp3.salary());
    }
}