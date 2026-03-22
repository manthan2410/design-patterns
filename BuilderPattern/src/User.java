public class User {

    private final String name;
    private final String id;

    private User(userBuilder builder)
    {
        this.name=builder.name;
        this.id= builder.id;;
    }

    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }

    @Override
    public String  toString()
    {
        return this.name+this.id;
    }
    //inner class to create object
     static class userBuilder{
        private String name;
        private String id;
        public userBuilder()
        {

        }

        public userBuilder setName(String name)
        {
            this.name=name;
            return this;
        }
        public userBuilder setId(String id){
            this.id=id;
            return this;
        }

        public static userBuilder builder()
        {
            return new userBuilder();
        }
        public User build()
        {
            User u=new User(this);
            return u;
        }
    }
}
