class AK47 {
    String manufacturer;
    String model;
    String caliber;
    double weight; 
    double length; 
    double muzzleVelocity; 
    int magazineCapacity;
    String countryOfOrigin;
    String serialNumber;
    String finish;

    public AK47() {
    }

    public AK47(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public AK47(String manufacturer, String model) {
        this(manufacturer);
        this.model = model;
    }

    public AK47(String manufacturer, String model, String caliber) {
        this(manufacturer, model);
        this.caliber = caliber;
    }

    public AK47(String manufacturer, String model, String caliber, double weight) {
        this(manufacturer, model, caliber);
        this.weight = weight;
    }

    public AK47(String manufacturer, String model, String caliber, double weight, double length) {
        this(manufacturer, model, caliber, weight);
        this.length = length;
    }

    public AK47(String manufacturer, String model, String caliber, double weight, double length, double muzzleVelocity) {
        this(manufacturer, model, caliber, weight, length);
        this.muzzleVelocity = muzzleVelocity;
    }

    public AK47(String manufacturer, String model, String caliber, double weight, double length, double muzzleVelocity, int magazineCapacity) {
        this(manufacturer, model, caliber, weight, length, muzzleVelocity);
        this.magazineCapacity = magazineCapacity;
    }

    public AK47(String manufacturer, String model, String caliber, double weight, double length, double muzzleVelocity, int magazineCapacity, String countryOfOrigin) {
        this(manufacturer, model, caliber, weight, length, muzzleVelocity, magazineCapacity);
        this.countryOfOrigin = countryOfOrigin;
    }

    public AK47(String manufacturer, String model, String caliber, double weight, double length, double muzzleVelocity, int magazineCapacity, String countryOfOrigin, String serialNumber) {
        this(manufacturer, model, caliber, weight, length, muzzleVelocity, magazineCapacity, countryOfOrigin);
        this.serialNumber = serialNumber;
    }

    public AK47(String manufacturer, String model, String caliber, double weight, double length, double muzzleVelocity, int magazineCapacity, String countryOfOrigin, String serialNumber, String finish) {
        this(manufacturer, model, caliber, weight, length, muzzleVelocity, magazineCapacity, countryOfOrigin, serialNumber);
        this.finish = finish;
    }

    public void info() {
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Model: " + this.model);
        System.out.println("Caliber: " + this.caliber);
        System.out.println("Weight: " + this.weight + " kg");
        System.out.println("Length: " + this.length + " cm");
        System.out.println("Muzzle Velocity: " + this.muzzleVelocity + " m/s");
        System.out.println("Magazine Capacity: " + this.magazineCapacity);
        System.out.println("Country of Origin: " + this.countryOfOrigin);
        System.out.println("Serial Number: " + this.serialNumber);
        System.out.println("Finish: " + this.finish);
    }
}