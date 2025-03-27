class CabRunner {
    public static void main(String[] args) {
        Cab cab1 = new Cab(1200000, "Toyota", "Innova", "Diesel", 101, "10 Jan 2024", "SUV", 15.0, 2000.0, 7, true, true, false, 5, 1500.0, "White", "India", false, false, false, true);
        Cab cab2 = new Cab(2500000, "Mercedes", "E-Class", "Petrol", 202, "5 March 2023", "Sedan", 12.0, 2500.0, 5, true, true, false, 4, 1700.0, "Black", "Germany", true, false, true, true);
        Cab cab3 = new Cab(1800000, "Tesla", "Model 3", "Electric", 303, "12 Aug 2022", "Sedan", 500.0, 0.0, 5, true, true, true, 8, 1600.0, "Red", "USA", true, false, true, true);

        System.out.println("Cab1: " + cab1.price + ", " + cab1.brand + ", " + cab1.model + ", " + cab1.fuelType + ", " + cab1.modelId + ", " + cab1.manufacturedDate + ", " + cab1.type + ", " + cab1.mileage + ", " + cab1.engineCapacity + ", " + cab1.seatingCapacity + ", " + cab1.hasAirConditioning + ", " + cab1.hasGPS + ", " + cab1.isElectric + ", " + cab1.warrantyPeriod + ", " + cab1.weight + ", " + cab1.color + ", " + cab1.countryOfOrigin + ", " + cab1.isLuxury + ", " + cab1.isConvertible + ", " + cab1.hasSunroof + ", " + cab1.hasAutomaticTransmission);

        System.out.println("Cab2: " + cab2.price + ", " + cab2.brand + ", " + cab2.model + ", " + cab2.fuelType + ", " + cab2.modelId + ", " + cab2.manufacturedDate + ", " + cab2.type + ", " + cab2.mileage + ", " + cab2.engineCapacity + ", " + cab2.seatingCapacity + ", " + cab2.hasAirConditioning + ", " + cab2.hasGPS + ", " + cab2.isElectric + ", " + cab2.warrantyPeriod + ", " + cab2.weight + ", " + cab2.color + ", " + cab2.countryOfOrigin + ", " + cab2.isLuxury + ", " + cab2.isConvertible + ", " + cab2.hasSunroof + ", " + cab2.hasAutomaticTransmission);

        System.out.println("Cab3: " + cab3.price + ", " + cab3.brand + ", " + cab3.model + ", " + cab3.fuelType + ", " + cab3.modelId + ", " + cab3.manufacturedDate + ", " + cab3.type + ", " + cab3.mileage + ", " + cab3.engineCapacity + ", " + cab3.seatingCapacity + ", " + cab3.hasAirConditioning + ", " + cab3.hasGPS + ", " + cab3.isElectric + ", " + cab3.warrantyPeriod + ", " + cab3.weight + ", " + cab3.color + ", " + cab3.countryOfOrigin + ", " + cab3.isLuxury + ", " + cab3.isConvertible + ", " + cab3.hasSunroof + ", " + cab3.hasAutomaticTransmission);
    }
}