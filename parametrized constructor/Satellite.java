class Satellite {
    String name;
    String type;
    double weight;
    double height;
    double width;
    String launchDate;
    String launchVehicle;
    String orbitType;
    double speed;
    double lifespan;
    boolean isManned;
    boolean hasSolarPanels;
    boolean hasCommunicationSystem;
    boolean hasScientificInstruments;
    String countryOfOrigin;
    String manufacturer;
    boolean isOperational;
    String purpose;
    String frequencyBand;
    double powerOutput;
    
    public Satellite(String name, String type, double weight, double height, double width, String launchDate, String launchVehicle, 
                     String orbitType, double speed, double lifespan, boolean isManned, boolean hasSolarPanels, boolean hasCommunicationSystem,
                     boolean hasScientificInstruments, String countryOfOrigin, String manufacturer, boolean isOperational, 
                     String purpose, String frequencyBand, double powerOutput) {
        System.out.println("Details of the Satellite");
        
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.launchDate = launchDate;
        this.launchVehicle = launchVehicle;
        this.orbitType = orbitType;
        this.speed = speed;
        this.lifespan = lifespan;
        this.isManned = isManned;
        this.hasSolarPanels = hasSolarPanels;
        this.hasCommunicationSystem = hasCommunicationSystem;
        this.hasScientificInstruments = hasScientificInstruments;
        this.countryOfOrigin = countryOfOrigin;
        this.manufacturer = manufacturer;
        this.isOperational = isOperational;
        this.purpose = purpose;
        this.frequencyBand = frequencyBand;
        this.powerOutput = powerOutput;
    }
}
