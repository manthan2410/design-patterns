import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception,CloneNotSupportedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Student stu1=Student.getStudent();
        System.out.println(stu1.hashCode());

        Student stu2=Student.getStudent();
        System.out.println(stu2.hashCode());

        Parent par1=Parent.getParent();
        System.out.println(par1.hashCode());
        Parent par2=Parent.getParent();
        System.out.println(par2.hashCode());

        Teacher tar1=Teacher.getTeacher();
        System.out.println(tar1.hashCode());
        Teacher tar2=Teacher.getTeacher();
        System.out.println(tar2.hashCode());
        //break singelton pattern using reflection api
        System.out.println("break singleton");
//        Pen p1=Pen.getPen();
//        System.out.println("pen1"+p1.hashCode());
//        Pen p2=Pen.getPen();
//        System.out.println("pen2"+p2.hashCode());

//        Constructor<Pen> constructor=Pen.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Pen p3=(Pen)constructor.newInstance();
//        System.out.println("after taking from reflection api"+p3.hashCode());
        //to fix above reflection api wala return exception or use enum.

//        Pen p4=Pen.INSTANCE;
//        System.out.println("after taking from enum "+p4.hashCode());
//        System.out.println("after taking from enum "+p4.getDemo());


        //break singelton pattern using deserialization
        Pencil pencil1=Pencil.getPencil();
        System.out.println("pencil"+pencil1.hashCode());
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        os.writeObject(pencil1);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
    Pencil pencil2=    (Pencil)ois.readObject();
        System.out.println("After deserialization pencil"+pencil2.hashCode());


        //break singleton using clonable

        Pent p1=Pent.getPent();
        System.out.println("Pent1"+p1.hashCode());

        Pent p2=(Pent) p1.clone();
        System.out.println("Pent2"+p2.hashCode());
    }
}