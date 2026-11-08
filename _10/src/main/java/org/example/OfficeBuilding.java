package org.example;

public class OfficeBuilding implements Buildable{
    String address;
    int floor;
    int companies;

    public OfficeBuilding(String address, int floors, int companies){
        this.address=address;
        this.floor=floors;
        this.companies=companies;
    }

    public String getAddress() {
        return address;
    }

    public int getFloor() {
        return floor;
    }

    public int getCompanies() {
        return companies;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setCompanies(int companies) {
        this.companies = companies;
    }
    @Override
    public void build() {
        System.out.println("Строим офисное здание по адресу " + address);
    }

    @Override
    public int getFloors() {
        return floor;
    }

}
