public class Car extends Vehicle
{
    private String carType;
    private double ccValue;

    public Car (String type, double cc, int year, double price)
    {
        super (year, price);
        this.carType = type;
        this.ccValue = cc;
    }
    @Override
    public void displayVehicle()
    {
        super.displayVehicle();
        System.out.println("Car Type: " + carType);
        System.out.println("CC Value: " + ccValue);
    }
}
