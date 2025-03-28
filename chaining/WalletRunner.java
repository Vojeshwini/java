class WalletRunner {
    public static void main(String[] args) {
        String brand = "Fossil";
        double price = 2499.99;
        String color = "Brown";
        boolean isLeather = true;
        int cardSlots = 8;
        boolean hasCoinPocket = true;
        double weight = 150.5;
        String material = "Genuine Leather";
        String closureType = "Bifold";
        boolean isWaterResistant = false;

        Wallet wallet1 = new Wallet();
        Wallet wallet2 = new Wallet(brand);
        Wallet wallet3 = new Wallet(brand, price);
        Wallet wallet4 = new Wallet(brand, price, color);
        Wallet wallet5 = new Wallet(brand, price, color, isLeather);
        Wallet wallet6 = new Wallet(brand, price, color, isLeather, cardSlots);
        Wallet wallet7 = new Wallet(brand, price, color, isLeather, cardSlots, hasCoinPocket);
        Wallet wallet8 = new Wallet(brand, price, color, isLeather, cardSlots, hasCoinPocket, weight);
        Wallet wallet9 = new Wallet(brand, price, color, isLeather, cardSlots, hasCoinPocket, weight, material);
        Wallet wallet10 = new Wallet(brand, price, color, isLeather, cardSlots, hasCoinPocket, weight, material, closureType);
        Wallet wallet11 = new Wallet(brand, price, color, isLeather, cardSlots, hasCoinPocket, weight, material, closureType, isWaterResistant);

        wallet1.info();
        wallet2.info();
        wallet3.info();
        wallet4.info();
        wallet5.info();
        wallet6.info();
        wallet7.info();
        wallet8.info();
        wallet9.info();
        wallet10.info();
        wallet11.info();
    }
}