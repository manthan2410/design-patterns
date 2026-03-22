public class Pent implements Cloneable{

    private static Pent pent;
    private Pent(){

    }

    public static Pent getPent(){
        if(pent==null)
        {
            pent=new Pent();
        }
        return pent;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
//        return super.clone();
        //to fix singlen breaking from clone
        return pent;
    }
}
