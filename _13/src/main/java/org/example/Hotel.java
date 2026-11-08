package org.example;

public class Hotel {
    private String name;
    private String city;
    private int stars;
    private int rooms;//всего комнат
    private int availableRooms;//доступные комнаты
    public Hotel(String name, String city, int stars, int rooms) throws InvalidHotelDataException{
        if(stars<1 || stars>5 ){
            throw new InvalidHotelDataException("Некоректное количество звезд: ");
        }
        if(rooms<0){throw new InvalidHotelDataException("Такое количество комнат невозможно");}
        this.name=name;
        this.city=city;
        this.stars=stars;
        this.rooms=rooms;
        this.availableRooms = rooms;
    }
    public void bookRoom() throws RoomNotAvailableException {
        if (availableRooms <= 0)throw new RoomNotAvailableException("В отеле " + name + " нет свободных номеров");
        availableRooms--;
        System.out.println("Номер забранирован в отеле " + name);
    }
    public void checkOut()throws InvalidHotelDataException{
        if (availableRooms > rooms)throw new InvalidHotelDataException("В этом отеле и так пусты все номера");
        availableRooms++;
        System.out.println("Номер свободен "  + name);
    }
    @Override
    public String toString() {
        return String.format("%s в г. %s (звезды %d, количество номеров: %d, количество свободных номеров: %d)", name, city, stars,rooms,availableRooms);
    }
}