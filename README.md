# Vehicle

A simple Java console application that demonstrates core **Object-Oriented Programming (OOP)** concepts — inheritance, method overriding, constructor chaining, and interfaces — using a small vehicle/transport simulation.

## Overview

The app models vehicles and how they transport people or goods:

- **`Vehicle`** — base class holding shared attributes (`manufactureYear`, `price`) and a `displayVehicle()` method.
- **`Car`** and **`Aeroplane`** — subclasses that extend `Vehicle`, add their own attributes (`carType`, `ccValue`, `modelNo`, `capacity`), and override `displayVehicle()`, calling `super.displayVehicle()` to reuse the parent output.
- **`Transporter`** — an interface with a single method, `howToTransport()`, implemented by `CarTransporter` (on the road) and `AeroplaneTransporter` (in the air).
- **`Main`** — instantiates a 2022 Sedan car and a Boeing 747 aeroplane, displays their details, and prints how each is transported.

## Class Hierarchy

```
   Vehicle (base class)
     ▲         ▲
     │         │
   Car    Aeroplane

   Transporter (interface)
     ▲                ▲
     │                │
CarTransporter  AeroplaneTransporter
```

### OOP Concepts Demonstrated

| Concept | Where |
|---|---|
| Inheritance | `Car`, `Aeroplane` extend `Vehicle` |
| Constructor chaining | `super(year, price)` calls in subclass constructors |
| Method overriding | `displayVehicle()` in both subclasses |
| Reusing parent behavior | `super.displayVehicle()` inside overrides |
| Interface | `Transporter` |
| Interface implementation | `CarTransporter`, `AeroplaneTransporter` |

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or later

### Compile and Run

```bash
cd src
javac *.java
java Main
```

### Expected Output

```
Manufacture Year: 2022
Price: 20000.0
Car Type: Sedan
CC Value: 1500.0
The car is on the road.
Manufacture Year: 2020
Price: 1000000.0
Model No: Boeing 747
Capacity: 500
The aeroplane is in the air.
```

## Project Structure

```
Vehicle/
├── src/
│   ├── Vehicle.java      # Base class
│   ├── Car.java          # Car subclass
│   ├── Aeroplane.java    # Aeroplane subclass
│   └── Main.java         # Transporter interface, implementations, and main method
├── .idea/                # IDE configuration
└── .gitignore
```
