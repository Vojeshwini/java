class StanzaRunner {
    public static void main(String[] args) {
        String name = "Living Room";
        double area = 250.0;
        boolean isFurnished = true;
        boolean hasWindows = true;
        double ceilingHeight = 10.0;
        String flooringType = "Marble";
        double ventilationFactor = 0.8;
        double lightingEfficiency = 90.0;
        String wallColor = "Beige";
        double doorWidth = 3.0;

        Stanza stanza1 = new Stanza();
        Stanza stanza2 = new Stanza(name);
        Stanza stanza3 = new Stanza(name, area);
        Stanza stanza4 = new Stanza(name, area, isFurnished);
        Stanza stanza5 = new Stanza(name, area, isFurnished, hasWindows);
        Stanza stanza6 = new Stanza(name, area, isFurnished, hasWindows, ceilingHeight);
        Stanza stanza7 = new Stanza(name, area, isFurnished, hasWindows, ceilingHeight, flooringType);
        Stanza stanza8 = new Stanza(name, area, isFurnished, hasWindows, ceilingHeight, flooringType, ventilationFactor);
        Stanza stanza9 = new Stanza(name, area, isFurnished, hasWindows, ceilingHeight, flooringType, ventilationFactor, lightingEfficiency);
        Stanza stanza10 = new Stanza(name, area, isFurnished, hasWindows, ceilingHeight, flooringType, ventilationFactor, lightingEfficiency, wallColor);
        Stanza stanza11 = new Stanza(name, area, isFurnished, hasWindows, ceilingHeight, flooringType, ventilationFactor, lightingEfficiency, wallColor, doorWidth);

        stanza1.info();
        stanza2.info();
        stanza3.info();
        stanza4.info();
        stanza5.info();
        stanza6.info();
        stanza7.info();
        stanza8.info();
        stanza9.info();
        stanza10.info();
        stanza11.info();
    }
}