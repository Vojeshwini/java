class TerraceRunner {
    public static void main(String[] args) {
        Terrace terrace = new Terrace(); 

        
        System.out.println("Is Concrete: " + terrace.isConcrete);
        System.out.println("Cost: " + terrace.cost);
        System.out.println("Is Water Resistant: " + terrace.isWaterResistant);
        System.out.println("Area: " + terrace.area);

        
        terrace.isConcrete = true;
        terrace.cost = 10000;
        terrace.isWaterResistant = true;
        terrace.area = 25;

     
        System.out.println("Updated Is Concrete: " + terrace.isConcrete);
        System.out.println("Updated Cost: " + terrace.cost);
        System.out.println("Updated Is Water Resistant: " + terrace.isWaterResistant);
        System.out.println("Updated Area: " + terrace.area + " sqft");
    }
}
