class BedRunner {
    public static void main(String[] args) {
        Bed bed = new Bed(); 

        System.out.println("Material: " + bed.material);
        System.out.println("Cost: " + bed.cost);
        System.out.println("Is Foldable: " + bed.isFoldable);
        System.out.println("Size: " + bed.size);

      
        bed.material = "Wood";
        bed.cost = 15000;
        bed.isFoldable = false;
        bed.size = 6.5;

 
        System.out.println("Updated Material: " + bed.material);
        System.out.println("Updated Cost: " + bed.cost);
        System.out.println("Updated Is Foldable: " + bed.isFoldable);
        System.out.println("Updated Size: " + bed.size + " feet");
    }
}
