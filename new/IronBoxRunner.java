class IronBoxRunner {
    public static void main(String[] args) {
        IronBox ironBox = new IronBox();

        System.out.println("Brand: " + ironBox.brand);
        System.out.println("Power: " + ironBox.power);
        System.out.println("Is Steam: " + ironBox.isSteam);
        System.out.println("Price: " + ironBox.price);

        ironBox.brand = "Philips";
        ironBox.power = 1500;
        ironBox.isSteam = true;
        ironBox.price = 2500.00;

        System.out.println("Updated Brand: " + ironBox.brand);
        System.out.println("Updated Power: " + ironBox.power + " watts");
        System.out.println("Updated Is Steam: " + ironBox.isSteam);
        System.out.println("Updated Price: " + ironBox.price + " INR");
    }
}
