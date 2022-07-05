package by.itstep.vika.javalessons.lesson22.controller;

import by.itstep.vika.javalessons.lesson22.model.entity.Human;
import by.itstep.vika.javalessons.lesson22.model.entity.Loafer;
import by.itstep.vika.javalessons.lesson22.model.entity.Student;
import by.itstep.vika.javalessons.lesson22.model.entity.Worker;

public class Task03 {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.setAge(20);
//        human.setAlive(true);
//        human.setName("Alex");

//        System.out.println(human.getInfo());

        Student student = new Student("Alex", 20,10,true);
        Worker worker = new Worker("Peter", 25, 3000,true);
        Loafer loafer = new Loafer("Nikplay",40, 2, true);

        System.out.println(student.getInfo());
        System.out.println(worker.getInfo());
        System.out.println(loafer.getInfo());
    }
}
