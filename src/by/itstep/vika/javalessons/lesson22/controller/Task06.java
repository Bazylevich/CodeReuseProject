package by.itstep.vika.javalessons.lesson22.controller;

import by.itstep.vika.javalessons.lesson22.model.entity.MarkNote;
import by.itstep.vika.javalessons.lesson22.model.entity.Student;

public class Task06 {
    public static void main(String[] args) {
        MarkNote note = new MarkNote();

        Student student1 = new Student("Alex", 20, note, true);
        System.out.println(student1.getInfo());

        Student student2 = new Student("Alex", 20, note, true);
        System.out.println(student2.getInfo());
    }
}