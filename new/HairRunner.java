class HairRunner {
    public static void main(String[] args) {
        Hair hair = new Hair();

        System.out.println("Color: " + hair.color);
        System.out.println("Length: " + hair.length);
        System.out.println("Is Curly: " + hair.isCurly);
        System.out.println("Texture: " + hair.texture);

        hair.color = "Black";
        hair.length = 12.5;
        hair.isCurly = false;
        hair.texture = "Silky";

        System.out.println("Updated Color: " + hair.color);
        System.out.println("Updated Length: " + hair.length + " inches");
        System.out.println("Updated Is Curly: " + hair.isCurly);
        System.out.println("Updated Texture: " + hair.texture);
    }
}
