class Drone {
    int price;
    String brand;
    String model;
    double weight;
    double maxFlightTime;
    double maxRange;
    int batteryCapacity;
    boolean hasCamera;
    int cameraResolution;
    boolean isGPSenabled;
    String countryOfOrigin;
    int warrantyPeriod;
    boolean hasObstacleAvoidance;
    String manufacturedDate;
    int numberOfRotors;
    boolean hasNightVision;
    double maxSpeed;
    boolean hasAutoReturn;
    boolean supportsLiveStreaming;
    String controlType;
    
    public Drone(int price, String brand, String model, double weight, double maxFlightTime, double maxRange,
                 int batteryCapacity, boolean hasCamera, int cameraResolution, boolean isGPSenabled, String countryOfOrigin,
                 int warrantyPeriod, boolean hasObstacleAvoidance, String manufacturedDate, int numberOfRotors,
                 boolean hasNightVision, double maxSpeed, boolean hasAutoReturn, boolean supportsLiveStreaming, String controlType) {
        System.out.println("Details of the drone");
        
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.maxFlightTime = maxFlightTime;
        this.maxRange = maxRange;
        this.batteryCapacity = batteryCapacity;
        this.hasCamera = hasCamera;
        this.cameraResolution = cameraResolution;
        this.isGPSenabled = isGPSenabled;
        this.countryOfOrigin = countryOfOrigin;
        this.warrantyPeriod = warrantyPeriod;
        this.hasObstacleAvoidance = hasObstacleAvoidance;
        this.manufacturedDate = manufacturedDate;
        this.numberOfRotors = numberOfRotors;
        this.hasNightVision = hasNightVision;
        this.maxSpeed = maxSpeed;
        this.hasAutoReturn = hasAutoReturn;
        this.supportsLiveStreaming = supportsLiveStreaming;
        this.controlType = controlType;
    }
}