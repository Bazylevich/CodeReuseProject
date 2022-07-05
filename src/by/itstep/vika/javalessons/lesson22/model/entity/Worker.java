package by.itstep.vika.javalessons.lesson22.model.entity;

public class Worker extends Human{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Worker(String name, int age, double salary, boolean alive) {
       setAge(age);
       setName(name);
       setAlive(alive);
        // this.name = name;
       // this.age = age;
        this.salary = salary;
       // this.alive = alive;
    }
    public String getInfo(){
        return "Worker - " + getName() + ": age = " + getAge() + ", salary" + salary + ", is alive = " + (isAlive() ? "yes" :"no");
    }
}
