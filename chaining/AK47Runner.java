class AK47 {
    String manufacturer;
    String model;
    String caliber;
    double weight; // in kilograms
    double length; // in centimeters
    double muzzleVelocity; // in meters per second
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

class AK47Runner {
    public static void main(String[] args) {
        String manufacturer = "Izhmash";
        String model = "AK-47";
        String caliber = "7.62x39mm";
        double weight = 4.3;
        double length = 87.0;
        double muzzleVelocity = 715.0;
        int magazineCapacity = 30;
        String countryOfOrigin = "Soviet Union";
        String serialNumber = "AK47-12345";
        String finish = "Blued Steel";

        AK47 ak47_0 = new AK47();
        AK47 ak47_1 = new AK47(manufacturer);
        AK47 ak47_2 = new AK47(manufacturer, model);
        AK47 ak47_3 = new AK47(manufacturer, model, caliber);
        AK47 ak47_4 = new AK47(manufacturer, model, caliber, weight);
        AK47 ak47_5 = new AK47(manufacturer, model, caliber, weight, length);
        AK47 ak47_6 = new AK47(manufacturer, model, caliber, weight, length, muzzleVelocity);
        AK47 ak47_7 = new AK47(manufacturer, model, caliber, weight, length, muzzleVelocity, magazineCapacity);
        AK47 ak47_8 = new AK47(manufacturer, model, caliber, weight, length, muzzleVelocity, magazineCapacity, countryOfOrigin);
        AK47 ak47_9 = new AK47(manufacturer, model, caliber, weight, length, muzzleVelocity, magazineCapacity, countryOfOrigin, serialNumber);
        AK47 ak47_10 = new AK47(manufacturer, model, caliber, weight, length, muzzleVelocity, magazineCapacity, countryOfOrigin, serialNumber, finish);

        ak47_0.info();
        ak47_1.info();
        ak47_2.info();
        ak47_3.info();
        ak47_4.info();
        ak47_5.info();
        ak47_6.info();
        ak47_7.info();
        ak47_8.info();
        ak47_9.info();
        ak47_10.info();
    }
}