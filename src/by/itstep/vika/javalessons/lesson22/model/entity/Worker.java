package by.itstep.vika.javalessons.lesson22.model.entity;

public class Worker {
    private String name;
    private int age;
    private double salary;
    private boolean alive;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Worker(String name, int age, double salary, boolean alive) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.alive = alive;
    }
    public String getInfo(){
        return "Worker - " + name + ": age = " + age + ", salary" + salary + ", is alive = " + (alive ? "yes" :"no");
    }
}
