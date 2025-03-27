class Brush {
    String brand;
    String type;
    String bristleMaterial;
    String handleMaterial;
    String color;
    double length;
    double width;
    boolean isWashable;
    boolean isSynthetic;
    boolean hasGrip;
    String usage;
    double price;
    String countryOfOrigin;
    String manufacturer;
    boolean isEcoFriendly;
    boolean isDurable;
    boolean hasReplaceableHead;
    int warrantyPeriod;
    double weight;
    String suitablePaintType;

    public Brush(String brand, String type, String bristleMaterial, String handleMaterial, String color, double length, double width,
                 boolean isWashable, boolean isSynthetic, boolean hasGrip, String usage, double price, String countryOfOrigin,
                 String manufacturer, boolean isEcoFriendly, boolean isDurable, boolean hasReplaceableHead, int warrantyPeriod,
                 double weight, String suitablePaintType) {
        System.out.println("Details of the Brush");
        
        this.brand = brand;
        this.type = type;
        this.bristleMaterial = bristleMaterial;
        this.handleMaterial = handleMaterial;
        this.color = color;
        this.length = length;
        this.width = width;
        this.isWashable = isWashable;
        this.isSynthetic = isSynthetic;
        this.hasGrip = hasGrip;
        this.usage = usage;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
        this.manufacturer = manufacturer;
        this.isEcoFriendly = isEcoFriendly;
        this.isDurable = isDurable;
        this.hasReplaceableHead = hasReplaceableHead;
        this.warrantyPeriod = warrantyPeriod;
        this.weight = weight;
        this.suitablePaintType = suitablePaintType;
    }
}

