class JamoonRunner {
    public static void main(String[] args) {
        Jamoon jamoon = new Jamoon();

        System.out.println("Flavor: " + jamoon.flavor);
        System.out.println("Quantity: " + jamoon.quantity);
        System.out.println("Is Sweet: " + jamoon.isSweet);
        System.out.println("Price: " + jamoon.price);

        jamoon.flavor = "Rose";
        jamoon.quantity = 10;
        jamoon.isSweet = true;
        jamoon.price = 200.00;

        System.out.println("Updated Flavor: " + jamoon.flavor);
        System.out.println("Updated Quantity: " + jamoon.quantity);
        System.out.println("Updated Is Sweet: " + jamoon.isSweet);
        System.out.println("Updated Price: " + jamoon.price + " INR");
    }
}
