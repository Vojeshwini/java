class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate choco1 = new Chocolate("Lindt", "Milk", 100.0, 250.0, "Hazelnut", false, true, false, "Switzerland", "10 Feb 2024", "10 Feb 2025", 30, true, false, "Wrapper", "Smooth", false, false, "Bar", false);
        Chocolate choco2 = new Chocolate("Cadbury", "Dark", 120.0, 200.0, "Classic", true, false, false, "India", "5 Jan 2024", "5 Jan 2025", 70, false, false, "Box", "Creamy", false, false, "Square", true);
        Chocolate choco3 = new Chocolate("Ferrero Rocher", "Truffle", 200.0, 500.0, "Chocolate & Hazelnut", false, true, false, "Italy", "15 Dec 2023", "15 Dec 2024", 40, true, false, "Gift Box", "Crunchy", true, false, "Sphere", true);
        
        System.out.println("Chocolate 1 Details:");
        System.out.println("Brand: " + choco1.brand);
        System.out.println("Type: " + choco1.type);
        System.out.println("Weight: " + choco1.weight + " g");
        System.out.println("Price: " + choco1.price + " INR");
        System.out.println("Flavor: " + choco1.flavor);
        System.out.println("Is Dark: " + choco1.isDark);
        System.out.println("Has Nuts: " + choco1.hasNuts);
        System.out.println("Is Sugar-Free: " + choco1.isSugarFree);
        System.out.println("Country of Origin: " + choco1.countryOfOrigin);
        System.out.println("Manufacturing Date: " + choco1.manufacturingDate);
        System.out.println("Expiry Date: " + choco1.expiryDate);
        System.out.println("Cocoa Percentage: " + choco1.cocoaPercentage + "%");
        System.out.println("Is Organic: " + choco1.isOrganic);
        System.out.println("Is Vegan: " + choco1.isVegan);
        System.out.println("Packaging Type: " + choco1.packagingType);
        System.out.println("Texture: " + choco1.texture);
        System.out.println("Has Caramel: " + choco1.hasCaramel);
        System.out.println("Has Fruits: " + choco1.hasFruits);
        System.out.println("Shape: " + choco1.shape);
        System.out.println("Is Gift Packed: " + choco1.isGiftPacked);
        System.out.println();
        
        System.out.println("Chocolate 2 Details:");
        System.out.println("Brand: " + choco2.brand);
        System.out.println("Type: " + choco2.type);
        System.out.println("Weight: " + choco2.weight + " g");
        System.out.println("Price: " + choco2.price + " INR");
        System.out.println("Flavor: " + choco2.flavor);
        System.out.println("Is Dark: " + choco2.isDark);
        System.out.println("Has Nuts: " + choco2.hasNuts);
        System.out.println("Is Sugar-Free: " + choco2.isSugarFree);
        System.out.println("Country of Origin: " + choco2.countryOfOrigin);
        System.out.println("Manufacturing Date: " + choco2.manufacturingDate);
        System.out.println("Expiry Date: " + choco2.expiryDate);
        System.out.println("Cocoa Percentage: " + choco2.cocoaPercentage + "%");
        System.out.println("Is Organic: " + choco2.isOrganic);
        System.out.println("Is Vegan: " + choco2.isVegan);
        System.out.println("Packaging Type: " + choco2.packagingType);
        System.out.println("Texture: " + choco2.texture);
        System.out.println("Has Caramel: " + choco2.hasCaramel);
        System.out.println("Has Fruits: " + choco2.hasFruits);
        System.out.println("Shape: " + choco2.shape);
        System.out.println("Is Gift Packed: " + choco2.isGiftPacked);
        System.out.println();
        
        System.out.println("Chocolate 3 Details:");
        System.out.println("Brand: " + choco3.brand);
        System.out.println("Type: " + choco3.type);
        System.out.println("Weight: " + choco3.weight + " g");
        System.out.println("Price: " + choco3.price + " INR");
        System.out.println("Flavor: " + choco3.flavor);
        System.out.println("Is Dark: " + choco3.isDark);
        System.out.println("Has Nuts: " + choco3.hasNuts);
        System.out.println("Is Sugar-Free: " + choco3.isSugarFree);
        System.out.println("Country of Origin: " + choco3.countryOfOrigin);
        System.out.println("Manufacturing Date: " + choco3.manufacturingDate);
        System.out.println("Expiry Date: " + choco3.expiryDate);
        System.out.println("Cocoa Percentage: " + choco3.cocoaPercentage + "%");
        System.out.println("Is Organic: " + choco3.isOrganic);
        System.out.println("Is Vegan: " + choco3.isVegan);
        System.out.println("Packaging Type: " + choco3.packagingType);
        System.out.println("Texture: " + choco3.texture);
        System.out.println("Has Caramel: " + choco3.hasCaramel);
        System.out.println("Has Fruits: " + choco3.hasFruits);
        System.out.println("Shape: " + choco3.shape);
        System.out.println("Is Gift Packed: " + choco3.isGiftPacked);
    }
}
