//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        //tightly coupled
       Employee emp=new WebDeveloper();
        System.out.println("employee created"+emp.salary());

      Employee emp2=  EmployeeFactory.getEmployee("WE-B Developer");
        System.out.println("employee created of web using factory dp"+emp2.salary());
    }
}