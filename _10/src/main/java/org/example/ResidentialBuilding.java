package org.example;

public class ResidentialBuilding implements Buildable, Habitable {
    String address;
    int floor;
    int apartments;

    public ResidentialBuilding(String address, int floor, int apartments) {
        this.address = address;
        this.floor = floor;
        this.apartments = apartments;
    }

    public String getAddress() {
        return address;
    }

    public int getFloor() {
        return floor;
    }

    public int getApartments() {
        return apartments;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    @Override
    public void build() {
        System.out.println("Строим жилой дом по адресу " + address);
    }

    @Override
    public int getFloors() {
        return floor;
    }

    @Override
    public void live() {
        System.out.println("В доме по адресу " + address + " проживают жильцы в " + apartments + " квартирах");
    }

    @Override
    public int getCapacity() {
        return apartments * 3;
    }
}
