public class Aeroplane extends Vehicle {
    private String modelNo;
    private int capacity;

    public Aeroplane(String modelNo, int capacity, int year, double price) {
        super(year, price);
        this.modelNo = modelNo;
        this.capacity = capacity;
    }

    @Override
    public void displayVehicle() {
        super.displayVehicle();
        System.out.println("Model No: " + modelNo);
        System.out.println("Capacity: " + capacity);
    }
}