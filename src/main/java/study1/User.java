package study1;

public class User {
    private int age = 0;
    private String nameUser = "";

    public User(String nameUser) {
        this.nameUser = nameUser;
    }
    public User(int currentAge, String currentName) {
        age = currentAge;
        nameUser = currentName;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Enter age less then 0. Default age equals " + this.age);
        } else {
        this.age = age;
        }
    }
    public int getAge(){
        return this.age;
    }
    public String getNameUser(){
        return nameUser;
    }
    public void setNameUser(String name){
        nameUser = name;
    }
    public void sayHello(){
        System.out.println("Hello, my name is " + nameUser + ". I am " + age + " years old!");
    }
}
