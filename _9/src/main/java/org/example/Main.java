package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Professional[] profess = new Professional[5];
        profess[0] = new Doctor("Иван", 10, 4.8, "Кардиология");
        profess[1] = new Doctor("Сергей", 4, 5, "Хирургия");
        profess[2] = new Doctor("Кирилл", 16, 3.8, "Педиатрия");
        profess[3] = new Engineer("Антон", 7, 4.5, "Мост");
        profess[4] = new Engineer("Петр", 5, 3.5, "Сцена");

        for (Professional p : profess) {
            p.displayInfo();
            p.work();
            p.getResponsibilities();
        }
    }
}
