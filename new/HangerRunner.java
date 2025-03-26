class HangerRunner {
    public static void main(String[] args) {
        Hanger hanger = new Hanger(); 

      
        System.out.println("Material: " + hanger.material);
        System.out.println("Capacity: " + hanger.capacity);
        System.out.println("Is Foldable: " + hanger.isFoldable);
        System.out.println("Price: " + hanger.price);

        hanger.material = "Wood";
        hanger.capacity = 5;
        hanger.isFoldable = true;
        hanger.price = 250.75;

        System.out.println("Updated Material: " + hanger.material);
        System.out.println("Updated Capacity: " + hanger.capacity);
        System.out.println("Updated Is Foldable: " + hanger.isFoldable);
        System.out.println("Updated Price: " + hanger.price + " INR");
    }
}
