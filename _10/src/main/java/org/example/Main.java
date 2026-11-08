package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ResidentialBuilding[] homes = {
                new ResidentialBuilding("ул. Ленина, 1", 9, 32),
                new ResidentialBuilding("ул. Ленина, 2", 10, 22),
                new ResidentialBuilding("ул. Ленина, 3", 5, 70)
        };

        OfficeBuilding[] offices = {
                new OfficeBuilding("пр. Независимости, 5", 10, 25),
                new OfficeBuilding("пр. Независимости, 10", 12, 20)
        };

        System.out.println("Жилые дома");
        for (int i = 0; i < homes.length; i++) {
            ResidentialBuilding h = homes[i];
            h.build();
            h.live();
            System.out.println("Этажей: " + h.getFloors());
            System.out.println("Вместимость: " + h.getCapacity());
        }

        System.out.println("Офисы");
        for (int i = 0; i < offices.length; i++) {
            OfficeBuilding o = offices[i];
            o.build();
            System.out.println("Этажей: " + o.getFloors());
        }


    }
}
