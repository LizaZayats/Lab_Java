//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Athlete a1 = new Athlete("Иван", "Плавание", 3);
    Athlete a2 = new Athlete("Мария", "Бег", 5);
    Athlete a3 = new Athlete("Пётр", "Бокс", 7);
    Athlete a4 = new Athlete("Анна", "Гимнастика", 4);
    Athlete a5 = new Athlete("Сергей", "Футбол", 2);

    System.out.printf("Среднее число медалей: %.2f%n", Athlete.getAverageMedals());
}
