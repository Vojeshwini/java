class Chocolate {
    String brand;
    String type;
    double weight;
    double price;
    String flavor;
    boolean isDark;
    boolean hasNuts;
    boolean isSugarFree;
    String countryOfOrigin;
    String manufacturingDate;
    String expiryDate;
    int cocoaPercentage;
    boolean isOrganic;
    boolean isVegan;
    String packagingType;
    String texture;
    boolean hasCaramel;
    boolean hasFruits;
    String shape;
    boolean isGiftPacked;
    
    public Chocolate(String brand, String type, double weight, double price, String flavor, boolean isDark, boolean hasNuts, 
                     boolean isSugarFree, String countryOfOrigin, String manufacturingDate, String expiryDate, int cocoaPercentage, 
                     boolean isOrganic, boolean isVegan, String packagingType, String texture, boolean hasCaramel, boolean hasFruits, 
                     String shape, boolean isGiftPacked) {
        System.out.println("Details of the Chocolate");
        
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.flavor = flavor;
        this.isDark = isDark;
        this.hasNuts = hasNuts;
        this.isSugarFree = isSugarFree;
        this.countryOfOrigin = countryOfOrigin;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.cocoaPercentage = cocoaPercentage;
        this.isOrganic = isOrganic;
        this.isVegan = isVegan;
        this.packagingType = packagingType;
        this.texture = texture;
        this.hasCaramel = hasCaramel;
        this.hasFruits = hasFruits;
        this.shape = shape;
        this.isGiftPacked = isGiftPacked;
    }
}