class Rocket {
    int price;
    String brand;
    String model;
    double weight;
    double maxSpeed;
    double maxAltitude;
    int fuelCapacity;
    boolean hasReusableStages;
    int numberOfEngines;
    boolean hasAutonomousLanding;
    String countryOfOrigin;
    int warrantyPeriod;
    boolean hasEscapeSystem;
    String launchDate;
    int payloadCapacity;
    boolean hasAIControl;
    double thrust;
    boolean hasCrewSupport;
    boolean supportsSatelliteDeployment;
    String fuelType;
    
    public Rocket(int price, String brand, String model, double weight, double maxSpeed, double maxAltitude,
                  int fuelCapacity, boolean hasReusableStages, int numberOfEngines, boolean hasAutonomousLanding, String countryOfOrigin,
                  int warrantyPeriod, boolean hasEscapeSystem, String launchDate, int payloadCapacity,
                  boolean hasAIControl, double thrust, boolean hasCrewSupport, boolean supportsSatelliteDeployment, String fuelType) {
        System.out.println("Details of the Rocket");
        
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.maxAltitude = maxAltitude;
        this.fuelCapacity = fuelCapacity;
        this.hasReusableStages = hasReusableStages;
        this.numberOfEngines = numberOfEngines;
        this.hasAutonomousLanding = hasAutonomousLanding;
        this.countryOfOrigin = countryOfOrigin;
        this.warrantyPeriod = warrantyPeriod;
        this.hasEscapeSystem = hasEscapeSystem;
        this.launchDate = launchDate;
        this.payloadCapacity = payloadCapacity;
        this.hasAIControl = hasAIControl;
        this.thrust = thrust;
        this.hasCrewSupport = hasCrewSupport;
        this.supportsSatelliteDeployment = supportsSatelliteDeployment;
        this.fuelType = fuelType;
    }
}
