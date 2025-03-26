class ShirtRunner {
    public static void main(String[] args) {
        Shirt shirt = new Shirt(); 

        
        System.out.println("Color: " + shirt.color);
        System.out.println("Size: " + shirt.size);
        System.out.println("Material: " + shirt.material);
 
        shirt.color = "Blue";
        shirt.size = 42;
        shirt.material = "Cotton";
        shirt.price = 1200.50;

 
        System.out.println("Updated Color: " + shirt.color);
        System.out.println("Updated Size: " + shirt.size);
        System.out.println("Updated Material: " + shirt.material);
        System.out.println("Updated Price: " + shirt.price + " INR");
    }
}
