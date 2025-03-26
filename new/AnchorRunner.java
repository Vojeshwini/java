class AnchorRunner {
    public static void main(String[] args) {
        Anchor anchor = new Anchor();
        
        System.out.println("Material: " + anchor.material);
        System.out.println("Weight: " + anchor.weight);
        System.out.println("Is Rust Proof: " + anchor.isRustProof);
        System.out.println("Price: " + anchor.price);

        anchor.material = "Iron";
        anchor.weight = 15.5;
        anchor.isRustProof = true;
        anchor.price = 1200.00;

        System.out.println("Updated Material: " + anchor.material);
        System.out.println("Updated Weight: " + anchor.weight + " kg");
        System.out.println("Updated Is Rust Proof: " + anchor.isRustProof);
        System.out.println("Updated Price: " + anchor.price + " INR");
    }
}
