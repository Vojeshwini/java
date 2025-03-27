class Duster {
    int price;
    String brand;
    String material;
    String color;
    int modelId;
    String manufacturedDate;
    String type;
    double length;
    double width;
    boolean isReusable;
    boolean isEcoFriendly;
    int warrantyPeriod;
    double weight;
    String countryOfOrigin;
    boolean hasExtendableHandle;
    boolean isElectric;

    public Duster(int price, String brand, String material, String color, int modelId, String manufacturedDate, String type, double length, double width, boolean isReusable, boolean isEcoFriendly, int warrantyPeriod, double weight, String countryOfOrigin, boolean hasExtendableHandle, boolean isElectric) {
        System.out.println("Details of duster");
        
        this.price = price;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.modelId = modelId;
        this.manufacturedDate = manufacturedDate;
        this.type = type;
        this.length = length;
        this.width = width;
        this.isReusable = isReusable;
        this.isEcoFriendly = isEcoFriendly;
        this.warrantyPeriod = warrantyPeriod;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.hasExtendableHandle = hasExtendableHandle;
        this.isElectric = isElectric;
    }
}
