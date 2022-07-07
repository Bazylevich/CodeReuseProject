package by.itstep.vika.javalessons.lesson22.controller;

import by.itstep.vika.javalessons.lesson22.model.entity.*;

public class Task07 {
    public static void main(String[] args) {
//        Human human = new Student();

//        human = new Loafer();

        Human[] humans = { new Worker("Alex", 40, 3000, true),
                           new Student("Peter", 20, 10, true),
                           new Loafer("Anna", 18, 8, true)
        };
        Killer.justDoIt(humans);

        System.out.println(Killer.view(humans));

    }
}
