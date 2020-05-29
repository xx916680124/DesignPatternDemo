package com.example.designpatterndemo.bulider;



/**
 * author : xx
 * time : 2020/5/28 20:02
 * describe :
 **/
public class Preson {
    private String name;
    private int age;
    private String sex;
    public static class Builder{
        Preson preson;
        public Builder() {
            preson =new Preson();
        }

        public Builder setName(String name) {
            preson.setName(name);
            return this;
        }

        public Builder setAge(int age) {
            preson.setAge(age);
            return this;
        }

        public Builder setSex(String sex) {
            preson.setSex(sex);
            return this;
        }

        public Preson bulid(){
            return preson;
       }
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
