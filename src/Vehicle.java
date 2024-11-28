public class Vehicle {
    protected int manufactureYear;
    protected double price;
    public Vehicle(int year, double price)
    {
        this.manufactureYear = year;
        this.price = price;
    }
    public void displayVehicle()
    {
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Price: " + price);
    }
}
