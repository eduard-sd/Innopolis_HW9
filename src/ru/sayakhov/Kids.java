package ru.sayakhov;

public class Kids extends Human {
    private String school;

    public Kids(String name, String school) {
        super(name);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void swim() {
        System.out.println("I`m "+name+", i CANN`T swimming");
    }
}
