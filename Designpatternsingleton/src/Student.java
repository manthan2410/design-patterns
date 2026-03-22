public class Student {
    //lazy way
    private static Student student;
    private Student(){

    }

    public static Student getStudent(){
        if(student==null)
        {
            student=new Student();
        }
        return student;
    }
}
