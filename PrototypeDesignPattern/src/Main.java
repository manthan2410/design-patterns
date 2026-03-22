//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

     NetworkConnection n1=new NetworkConnection();
     n1.setIp("4200");
     n1.loadData();
        System.out.println(n1);
     try{
         NetworkConnection n2=(NetworkConnection) n1.clone();
         System.out.println(n2);
     } catch (CloneNotSupportedException e) {
         e.printStackTrace();
     }
    }
}