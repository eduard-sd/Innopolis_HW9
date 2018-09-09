package ru.sayakhov;

public class Adult extends Human {
    private String job;

    public Adult(String name, String job) {
        super(name);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


}
