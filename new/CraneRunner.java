class CraneRunner {
    public static void main(String[] args) {
        Crane crane = new Crane();

        System.out.println("Type: " + crane.type);
        System.out.println("Capacity: " + crane.capacity);
        System.out.println("Is Mobile: " + crane.isMobile);
        System.out.println("Price: " + crane.price);

        crane.type = "Tower Crane";
        crane.capacity = 20.0;
        crane.isMobile = false;
        crane.price = 500000.00;

        System.out.println("Updated Type: " + crane.type);
        System.out.println("Updated Capacity: " + crane.capacity + " tons");
        System.out.println("Updated Is Mobile: " + crane.isMobile);
        System.out.println("Updated Price: " + crane.price + " INR");
    }
}
