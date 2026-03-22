public class Parent {
    //eager way
    private static Parent parent=new Parent();
    private Parent(){

    }

    public static Parent getParent()
    {
        return parent;
    }
}
