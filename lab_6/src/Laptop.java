public class Laptop {

    private String brand;
    private int ram;
    private int storage;
    private double price;
    private int number;
    private static int tick;

    /*
    public int getNumber(){return number;}
    public void setNumber(int number){this.number=number;}

    public Laptop(String brand,int ram, int storage, double price, int number){
    this.(brand,ram,storage,price);
    this.number=number;
    }

    Laptop l1 = new Laptop;
    l1.metod();

    Laptop.statMetod();

 */
    public static int stMetod(){

        return tick;

    }
     public void nonStMetod(){
        System.out.print(brand);
        System.out.print(ram);
        System.out.print(storage);
        System.out.print(price);
        System.out.print(number);
        System.out.print(tick);
    }


















































    public Laptop(String brand,int ram,int storage, double price){
        this.brand=brand;
        this.ram=ram;
        this.storage=storage;
        this.price=price;
    }

    public String getBrand(){return brand; }
    public int  getRam(){return ram;}
    public int getStorage(){return storage;}
    public double getPrice(){return price;}

    public void setBrand(String brand){this.brand=brand;}
    public void setRam(int ram){this.ram=ram;}
    public void setStorage(int storage){this.storage=storage;}
    public void setPrice(double price){this.price=price;}

    public double applyDiscount(double discountPercent){
        return price * (1 - discountPercent / 100);
    }
    @Override
    public String toString() {
        return String.format("%s (Память: %d, Хранилище: %d, Цена: %.2f)",brand,ram, storage,price);
    }
}
