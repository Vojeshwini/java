class DusterRunner {
    public static void main(String[] args) {
        Duster duster1 = new Duster(300, "Scotch-Brite", "Microfiber", "Blue", 101, "10 Jan 2024", "Handheld", 25.0, 10.0, true, true, 2, 0.5, "India", true, false);
        Duster duster2 = new Duster(450, "Mr. Clean", "Cotton", "Yellow", 202, "5 March 2023", "Floor", 40.0, 12.0, true, false, 3, 0.8, "USA", false, false);
        Duster duster3 = new Duster(600, "Dyson", "Synthetic", "Red", 303, "12 Aug 2022", "Electric", 30.0, 15.0, false, true, 5, 1.2, "UK", true, true);

        System.out.println("Duster1: ""Price:" + duster1.price + "BRAND:" + duster1.brand + "MATERIAL:" + duster1.material + "COLOR:" + duster1.color + "MODEL ID:" + duster1.modelId + " MANUFACTURED DATE:" + duster1.manufacturedDate + "TYPE:" + duster1.type + "LENGTH:" + duster1.length + "WIDTH:" + duster1.width + "IS  REUSABLE:" + duster1.isReusable + "IS ECOFRIENDLY:" + duster1.isEcoFriendly + "WARRANTY PERIOD:" + duster1.warrantyPeriod + "WEIGHT:" + duster1.weight + "COUNTRY OF ORIGIN:" + duster1.countryOfOrigin + "HAS EXTENDABLE HANDLE: " + duster1.hasExtendableHandle + "IS ELECTRIC:" + duster1.isElectric);

        System.out.println("Duster2: " + duster2.price + ", " + duster2.brand + ", " + duster2.material + ", " + duster2.color + ", " + duster2.modelId + ", " + duster2.manufacturedDate + ", " + duster2.type + ", " + duster2.length + ", " + duster2.width + ", " + duster2.isReusable + ", " + duster2.isEcoFriendly + ", " + duster2.warrantyPeriod + ", " + duster2.weight + ", " + duster2.countryOfOrigin + ", " + duster2.hasExtendableHandle + ", " + duster2.isElectric);

        System.out.println("Duster3: " + duster3.price + ", " + duster3.brand + ", " + duster3.material + ", " + duster3.color + ", " + duster3.modelId + ", " + duster3.manufacturedDate + ", " + duster3.type + ", " + duster3.length + ", " + duster3.width + ", " + duster3.isReusable + ", " + duster3.isEcoFriendly + ", " + duster3.warrantyPeriod + ", " + duster3.weight + ", " + duster3.countryOfOrigin + ", " + duster3.hasExtendableHandle + ", " + duster3.isElectric);
    }
}
