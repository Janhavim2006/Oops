abstract class Appliance {
    String brand;
    String model;
    int powerRating; // in watts
    String powerSource;

    Appliance(String brand, String model, int powerRating, String powerSource) {
        this.brand = brand;
        this.model = model;
        this.powerRating = powerRating;
        this.powerSource = powerSource;
    }

    abstract double calculateDailyUsage();  // in hours/day
    abstract double getMaxVoltage();        // in volts

    double calculateDailyConsumption() {
        return (powerRating * calculateDailyUsage()) / 1000.0; // kWh
    }

    void displayInfo() {
        System.out.println("\n--- Appliance Info ---");
        System.out.println("Type        : " + this.getClass().getSimpleName());
        System.out.println("Brand       : " + brand);
        System.out.println("Model       : " + model);
        System.out.println("Power Rating: " + powerRating + "W");
        System.out.println("Power Source: " + powerSource);
    }
}

// Subclass: Fan
class Fan extends Appliance {
    Fan(String brand, String model, int powerRating, String powerSource) {
        super(brand, model, powerRating, powerSource);
    }

    double calculateDailyUsage() {
        return 6.0;
    }

    double getMaxVoltage() {
        return 240.0;
    }
}

// Subclass: AirConditioner
class AirConditioner extends Appliance {
    AirConditioner(String brand, String model, int powerRating, String powerSource) {
        super(brand, model, powerRating, powerSource);
    }

    double calculateDailyUsage() {
        return 8.0;
    }

    double getMaxVoltage() {
        return 220.0;
    }
}

// Subclass: Refrigerator
class Refrigerator extends Appliance {
    Refrigerator(String brand, String model, int powerRating, String powerSource) {
        super(brand, model, powerRating, powerSource);
    }

    double calculateDailyUsage() {
        return 24.0;
    }

    double getMaxVoltage() {
        return 230.0;
    }
}

public class MainAppliance{
    public static void main(String[] args) {
        Appliance fan = new Fan("Usha", "Swift", 75, "Electric");
        Appliance ac = new AirConditioner("LG", "DualCool", 1500, "Electric");
        Appliance fridge = new Refrigerator("Samsung", "RT28", 200, "Electric");

        Appliance[] appliances = { fan, ac, fridge };

        for (Appliance app : appliances) {
            app.displayInfo();
            System.out.printf("Daily Usage       : %.2f hours\n", app.calculateDailyUsage());
            System.out.printf("Max Voltage       : %.2f V\n", app.getMaxVoltage());
            System.out.printf("Daily Consumption : %.2f kWh\n", app.calculateDailyConsumption());
            System.out.println();
        }
    }
}
