class Bulb {
    String brand;
    double wattage;
    boolean isOn;
    String color;
    String bulbType;
    int lifespanHours;
    double price;
    String lightOutput;
    String energyEfficiencyRating;
    String serialNumber;

    public Bulb() {
    }

    public Bulb(String brand) {
        this.brand = brand;
    }

    public Bulb(String brand, double wattage) {
        this(brand);
        this.wattage = wattage;
    }

    public Bulb(String brand, double wattage, boolean isOn) {
        this(brand, wattage);
        this.isOn = isOn;
    }

    public Bulb(String brand, double wattage, boolean isOn, String color) {
        this(brand, wattage, isOn);
        this.color = color;
    }

    public Bulb(String brand, double wattage, boolean isOn, String color, String bulbType) {
        this(brand, wattage, isOn, color);
        this.bulbType = bulbType;
    }

    public Bulb(String brand, double wattage, boolean isOn, String color, String bulbType, int lifespanHours) {
        this(brand, wattage, isOn, color, bulbType);
        this.lifespanHours = lifespanHours;
    }

    public Bulb(String brand, double wattage, boolean isOn, String color, String bulbType, int lifespanHours, double price) {
        this(brand, wattage, isOn, color, bulbType, lifespanHours);
        this.price = price;
    }

    public Bulb(String brand, double wattage, boolean isOn, String color, String bulbType, int lifespanHours, double price, String lightOutput) {
        this(brand, wattage, isOn, color, bulbType, lifespanHours, price);
        this.lightOutput = lightOutput;
    }

    public Bulb(String brand, double wattage, boolean isOn, String color, String bulbType, int lifespanHours, double price, String lightOutput, String energyEfficiencyRating) {
        this(brand, wattage, isOn, color, bulbType, lifespanHours, price, lightOutput);
        this.energyEfficiencyRating = energyEfficiencyRating;
    }

    public Bulb(String brand, double wattage, boolean isOn, String color, String bulbType, int lifespanHours, double price, String lightOutput, String energyEfficiencyRating, String serialNumber) {
        this(brand, wattage, isOn, color, bulbType, lifespanHours, price, lightOutput, energyEfficiencyRating);
        this.serialNumber = serialNumber;
    }

    public void info() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Wattage: " + this.wattage);
        System.out.println("Is On: " + this.isOn);
        System.out.println("Color: " + this.color);
        System.out.println("Bulb Type: " + this.bulbType);
        System.out.println("Lifespan Hours: " + this.lifespanHours);
        System.out.println("Price: " + this.price);
        System.out.println("Light Output: " + this.lightOutput);
        System.out.println("Energy Efficiency Rating: " + this.energyEfficiencyRating);
        System.out.println("Serial Number: " + this.serialNumber);
    }
}

