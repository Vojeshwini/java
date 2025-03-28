class BulbRunner {
    public static void main(String[] args) {
        String brand = "Philips";
        double wattage = 10.0;
        boolean isOn = false;
        String color = "Warm White";
        String bulbType = "LED";
        int lifespanHours = 15000;
        double price = 5.99;
        String lightOutput = "800 lumens";
        String energyEfficiencyRating = "A+";
        String serialNumber = "PH123456789";

        Bulb bulb0 = new Bulb();
        Bulb bulb1 = new Bulb(brand);
        Bulb bulb2 = new Bulb(brand, wattage);
        Bulb bulb3 = new Bulb(brand, wattage, isOn);
        Bulb bulb4 = new Bulb(brand, wattage, isOn, color);
        Bulb bulb5 = new Bulb(brand, wattage, isOn, color, bulbType);
        Bulb bulb6 = new Bulb(brand, wattage, isOn, color, bulbType, lifespanHours);
        Bulb bulb7 = new Bulb(brand, wattage, isOn, color, bulbType, lifespanHours, price);
        Bulb bulb8 = new Bulb(brand, wattage, isOn, color, bulbType, lifespanHours, price, lightOutput);
        Bulb bulb9 = new Bulb(brand, wattage, isOn, color, bulbType, lifespanHours, price, lightOutput, energyEfficiencyRating);
        Bulb bulb10 = new Bulb(brand, wattage, isOn, color, bulbType, lifespanHours, price, lightOutput, energyEfficiencyRating, serialNumber);

        bulb0.info();
        bulb1.info();
        bulb2.info();
        bulb3.info();
        bulb4.info();
        bulb5.info();
        bulb6.info();
        bulb7.info();
        bulb8.info();
        bulb9.info();
        bulb10.info();
    }
}