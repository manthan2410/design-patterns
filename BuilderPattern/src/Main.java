//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

      User u=new User.userBuilder().setName("Manthan").setId("1").build();
      System.out.println(u);

        User u2= User.userBuilder.builder().setName("Manthan").setId("1").build();
        System.out.println(u2);
        
    }
}