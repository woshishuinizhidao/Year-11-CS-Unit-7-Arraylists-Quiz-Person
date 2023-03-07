public class Person {

    private String lastName;
    private String firstName;
    private int age;
    public Person(String l, String f, int a){
        this.lastName=l;
        this.firstName=f;
        this.age = a;
    }

    public String getLastName(){return lastName;}
    public String getFirstName(){return firstName;}
    public int getAge(){return age;}

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String toString(){
        return lastName + firstName + age;
    }

}
