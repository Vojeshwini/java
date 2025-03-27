class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin1 = new Dustbin(1200, "CleanMax", "Plastic", "Round", 101, "10 Jan 2024", "Bio-Waste", 15.0, 60.0, 30.0, true, true, false, 2, 2.5, "Blue", "India", true, false, true, true);
        Dustbin dustbin2 = new Dustbin(2500, "EcoBin", "Steel", "Rectangle", 202, "5 March 2023", "Recyclable", 25.0, 80.0, 40.0, true, true, true, 3, 5.0, "Green", "Germany", false, true, false, true);
        Dustbin dustbin3 = new Dustbin(999, "BinGo", "Metal", "Square", 303, "12 Aug 2022", "General", 10.0, 50.0, 25.0, false, false, false, 1, 3.0, "Black", "USA", false, true, false, false);

        System.out.println("Dustbin1: " + dustbin1.price + ", " + dustbin1.brand + ", " + dustbin1.material + ", " + dustbin1.shape + ", " + dustbin1.modelId + ", " + dustbin1.manufacturedDate + ", " + dustbin1.type + ", " + dustbin1.capacity + ", " + dustbin1.height + ", " + dustbin1.width + ", " + dustbin1.hasLid + ", " + dustbin1.isRecyclable + ", " + dustbin1.hasPedal + ", " + dustbin1.warrantyPeriod + ", " + dustbin1.weight + ", " + dustbin1.color + ", " + dustbin1.countryOfOrigin + ", " + dustbin1.isSmartDustbin + ", " + dustbin1.isPortable + ", " + dustbin1.isCustomizable + ", " + dustbin1.hasWheels);

        System.out.println("Dustbin2: " + dustbin2.price + ", " + dustbin2.brand + ", " + dustbin2.material + ", " + dustbin2.shape + ", " + dustbin2.modelId + ", " + dustbin2.manufacturedDate + ", " + dustbin2.type + ", " + dustbin2.capacity + ", " + dustbin2.height + ", " + dustbin2.width + ", " + dustbin2.hasLid + ", " + dustbin2.isRecyclable + ", " + dustbin2.hasPedal + ", " + dustbin2.warrantyPeriod + ", " + dustbin2.weight + ", " + dustbin2.color + ", " + dustbin2.countryOfOrigin + ", " + dustbin2.isSmartDustbin + ", " + dustbin2.isPortable + ", " + dustbin2.isCustomizable + ", " + dustbin2.hasWheels);

        System.out.println("Dustbin3: " + dustbin3.price + ", " + dustbin3.brand + ", " + dustbin3.material + ", " + dustbin3.shape + ", " + dustbin3.modelId + ", " + dustbin3.manufacturedDate + ", " + dustbin3.type + ", " + dustbin3.capacity + ", " + dustbin3.height + ", " + dustbin3.width + ", " + dustbin3.hasLid + ", " + dustbin3.isRecyclable + ", " + dustbin3.hasPedal + ", " + dustbin3.warrantyPeriod + ", " + dustbin3.weight + ", " + dustbin3.color + ", " + dustbin3.countryOfOrigin + ", " + dustbin3.isSmartDustbin + ", " + dustbin3.isPortable + ", " + dustbin3.isCustomizable + ", " + dustbin3.hasWheels);
    }
}
