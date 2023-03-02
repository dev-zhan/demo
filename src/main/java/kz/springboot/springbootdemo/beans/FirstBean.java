package kz.springboot.springbootdemo.beans;

public class FirstBean {
    private String name;
    private int age;
    public FirstBean(){
        this.name="No Name";
        this.age=0;
    }
    public FirstBean(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getText(){
        return this.name+" "+this.age+"years old";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
