package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Actor actor = new Actor("Арина Михалевич", 9, "комедия");
        Singer singer = new Singer("Арина Михалевич", 35, "хэви-металл", "Зингер");
        Dancer dancer = new Dancer("Полина Ярошевич", 42, "хип-хоп", "шпагат в полете");

        System.out.println("Actor");
        actor.perform();
        actor.perform("Манипулятор-кукловод");
        actor.perform(250);

        System.out.println("Singer");
        singer.sing();
        singer.sing("Любимая песня Р");

        System.out.println("Dancer");
        dancer.special();
        dancer.special(44);

        System.out.println("Переопределение");
        Actor[] troupe = { actor, singer, dancer };
        for (Actor a : troupe) {
         a.getAwards();
        }
    }
}
