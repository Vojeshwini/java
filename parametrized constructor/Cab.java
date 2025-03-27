class Cab {
    int price;
    String brand;
    String model;
    String fuelType;
    int modelId;
    String manufacturedDate;
    String type;
    double mileage;
    double engineCapacity;
    int seatingCapacity;
    boolean hasAirConditioning;
    boolean hasGPS;
    boolean isElectric;
    int warrantyPeriod;
    double weight;
    String color;
    String countryOfOrigin;
    boolean isLuxury;
    boolean isConvertible;
    boolean hasSunroof;
    boolean hasAutomaticTransmission;

    public Cab(int price, String brand, String model, String fuelType, int modelId, String manufacturedDate, String type, double mileage, double engineCapacity, int seatingCapacity, boolean hasAirConditioning, boolean hasGPS, boolean isElectric, int warrantyPeriod, double weight, String color, String countryOfOrigin, boolean isLuxury, boolean isConvertible, boolean hasSunroof, boolean hasAutomaticTransmission) {
        System.out.println("Details of cab");

        this.price = price;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.modelId = modelId;
        this.manufacturedDate = manufacturedDate;
        this.type = type;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        this.seatingCapacity = seatingCapacity;
        this.hasAirConditioning = hasAirConditioning;
        this.hasGPS = hasGPS;
        this.isElectric = isElectric;
        this.warrantyPeriod = warrantyPeriod;
        this.weight = weight;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;
        this.isLuxury = isLuxury;
        this.isConvertible = isConvertible;
        this.hasSunroof = hasSunroof;
        this.hasAutomaticTransmission = hasAutomaticTransmission;
    }
}
