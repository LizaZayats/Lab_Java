public class Report {
    static void generateReport(Employee[] emp) {
        String st = "ФИО";
        String st2 = "Зарплата";
        System.out.printf("%-15s | %10s %n",st,st2);
        for (Employee e : emp) {
            System.out.printf("%-15.15s | %10.2f руб.%n", e.getFullName(), e.getSalary());
        }
    }
}