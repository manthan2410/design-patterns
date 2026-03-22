public class Teacher {
    //lazy loading with thread safety or multi threading environment;
    private static Teacher teacher;
    private Teacher()
    {

    }

    public static Teacher getTeacher()
    {
        if(teacher==null)
        {
            synchronized (Teacher.class)
            {
                if (teacher==null)
                {
                    teacher=new Teacher();
                }
            }
        }
        return teacher;
    }
}
