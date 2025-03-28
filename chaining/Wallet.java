class Wallet {

    String brand;
    double price;
    String color;
    boolean isLeather;
    int cardSlots;
    boolean hasCoinPocket;
    double weight;
    String material;
    String closureType;
    boolean isWaterResistant;

    public Wallet() {}

    public Wallet(String brand) {
        this.brand = brand;
    }

    public Wallet(String brand, double price) {
        this(brand);
        this.price = price;
    }

    public Wallet(String brand, double price, String color) {
        this(brand, price);
        this.color = color;
    }

    public Wallet(String brand, double price, String color, boolean isLeather) {
        this(brand, price, color);
        this.isLeather = isLeather;
    }

    public Wallet(String brand, double price, String color, boolean isLeather, int cardSlots) {
        this(brand, price, color, isLeather);
        this.cardSlots = cardSlots;
    }

    public Wallet(String brand, double price, String color, boolean isLeather, int cardSlots, boolean hasCoinPocket) {
        this(brand, price, color, isLeather, cardSlots);
        this.hasCoinPocket = hasCoinPocket;
    }

    public Wallet(String brand, double price, String color, boolean isLeather, int cardSlots, boolean hasCoinPocket, double weight) {
        this(brand, price, color, isLeather, cardSlots, hasCoinPocket);
        this.weight = weight;
    }

    public Wallet(String brand, double price, String color, boolean isLeather, int cardSlots, boolean hasCoinPocket, double weight, String material) {
        this(brand, price, color, isLeather, cardSlots, hasCoinPocket, weight);
        this.material = material;
    }

    public Wallet(String brand, double price, String color, boolean isLeather, int cardSlots, boolean hasCoinPocket, double weight, String material, String closureType) {
        this(brand, price, color, isLeather, cardSlots, hasCoinPocket, weight, material);
        this.closureType = closureType;
    }

    public Wallet(String brand, double price, String color, boolean isLeather, int cardSlots, boolean hasCoinPocket, double weight, String material, String closureType, boolean isWaterResistant) {
        this(brand, price, color, isLeather, cardSlots, hasCoinPocket, weight, material, closureType);
        this.isWaterResistant = isWaterResistant;
    }

    public void info() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("Is Leather: " + this.isLeather);
        System.out.println("Card Slots: " + this.cardSlots);
        System.out.println("Has Coin Pocket: " + this.hasCoinPocket);
        System.out.println("Weight: " + this.weight + "g");
        System.out.println("Material: " + this.material);
        System.out.println("Closure Type: " + this.closureType);
        System.out.println("Is Water Resistant: " + this.isWaterResistant);
        System.out.println("----------------------------------");
    }
}