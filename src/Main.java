interface Transporter {
    void howToTransport();
}

class CarTransporter implements Transporter {
    @Override
    public void howToTransport() {
        System.out.println("The car is on the road.");
    }
}

class AeroplaneTransporter implements Transporter {
    @Override
    public void howToTransport() {
        System.out.println("The aeroplane is in the air.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Sedan", 1500, 2022, 20000);
        Aeroplane aeroplane = new Aeroplane("Boeing 747", 500, 2020, 1000000);
        CarTransporter carTransporter = new CarTransporter();
        AeroplaneTransporter aeroplaneTransporter = new AeroplaneTransporter();
        car.displayVehicle();
        carTransporter.howToTransport();
        aeroplane.displayVehicle();
        aeroplaneTransporter.howToTransport();
    }
}