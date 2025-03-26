class SirenRunner {
    public static void main(String[] args) {
        Siren siren = new Siren();

        System.out.println("Type: " + siren.type);
        System.out.println("Volume: " + siren.volume);
        System.out.println("Is Loud: " + siren.isLoud);
        System.out.println("Price: " + siren.price);

        siren.type = "Fire Alarm";
        siren.volume = 120;
        siren.isLoud = true;
        siren.price = 3500.00;

        System.out.println("Updated Type: " + siren.type);
        System.out.println("Updated Volume: " + siren.volume + " dB");
        System.out.println("Updated Is Loud: " + siren.isLoud);
        System.out.println("Updated Price: " + siren.price + " INR");
    }
}
