package org.example;

public class Drama extends Film {
    private int oscar;

    public Drama(String title, int id, double duration, int oscar) {
        super(title, id, duration);
        this.oscar = oscar;
    }

    public int getOscar() {
        return oscar;
    }

    public void setOscar(int oscar) {
        this.oscar = oscar;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(", количество оскоров: " + oscar + " штук\n");
    }
}
