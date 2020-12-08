package DesignPattern.Builder;


public class Person {
    private String name;
    private String mailId;
    private int id;
    private  int age; //If any new member is being addde we have to add that like this.

    public Person(Builder builder) {
        this.name = builder.name;
        this.mailId = builder.mailId;
        this.id = builder.id;
        this.age = builder.age; //If any new member is being addde we have to add that like this.
    }


    public static class Builder{
        private String name;
        private String mailId;
        private int id;
        private  int age; //If any new member is being addde we have to add that like this.

        public Builder(String name, String mailId) { //WE DONT NEED TO MAKE ANY CHANGE HERE
            this.name = name;
            this.mailId = mailId;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setAge(int age) { //If any new member is being addde we have to add that like this.
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mailId='" + mailId + '\'' +
                ", id=" + id +
                ", age=" + age  + //If any new member is being addde we have to add that like this.
                '}';
    }
}
