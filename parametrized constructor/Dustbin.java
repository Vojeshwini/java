class Dustbin {
    int price;
    String brand;
    String material;
    String shape;
    int modelId;
    String manufacturedDate;
    String type;
    double capacity;
    double height;
    double width;
    boolean hasLid;
    boolean isRecyclable;
    boolean hasPedal;
    int warrantyPeriod;
    double weight;
    String color;
    String countryOfOrigin;
    boolean isSmartDustbin;
    boolean isPortable;
    boolean isCustomizable;
    boolean hasWheels;

    public Dustbin(int price, String brand, String material, String shape, int modelId, String manufacturedDate, String type, double capacity, double height, double width, boolean hasLid, boolean isRecyclable, boolean hasPedal, int warrantyPeriod, double weight, String color, String countryOfOrigin, boolean isSmartDustbin, boolean isPortable, boolean isCustomizable, boolean hasWheels) {
        System.out.println("Details of dustbin");

        this.price = price;
        this.brand = brand;
        this.material = material;
        this.shape = shape;
        this.modelId = modelId;
        this.manufacturedDate = manufacturedDate;
        this.type = type;
        this.capacity = capacity;
        this.height = height;
        this.width = width;
        this.hasLid = hasLid;
        this.isRecyclable = isRecyclable;
        this.hasPedal = hasPedal;
        this.warrantyPeriod = warrantyPeriod;
        this.weight = weight;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;
        this.isSmartDustbin = isSmartDustbin;
        this.isPortable = isPortable;
        this.isCustomizable = isCustomizable;
        this.hasWheels = hasWheels;
    }
}
