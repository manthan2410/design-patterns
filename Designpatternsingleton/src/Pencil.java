import java.io.Serializable;

public class Pencil implements Serializable {
    private static Pencil pencil;
    private Pencil(){

    }

    public static Pencil getPencil(){
        if(pencil==null)
        {
            pencil=new Pencil();
        }
        return pencil;
    }
    //to fix breaking of singleton from deserialization
    public Object readResolve()
    {
        return pencil;
    }
}
