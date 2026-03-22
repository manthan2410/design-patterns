//public class Pen {
//    private static Pen pen;
//    private Pen()
//    {
//      if(pen!=null){
//          throw new RuntimeException("you are trying to break singleton pattern");
//      }
//    }
//
//    public static Pen getPen()
//    {
//        if(pen==null)
//        {
//            pen=new Pen();
//        }
//        return pen;
//    }
//}

public enum Pen{
    INSTANCE;

    public String getDemo()
    {
        return "returning from enum";
    }
}
