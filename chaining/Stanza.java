class Stanza {
    String name;
    double area;
    boolean isFurnished;
    boolean hasWindows;
    double ceilingHeight;
    String flooringType;
    double ventilationFactor;
    double lightingEfficiency;
    String wallColor;
    double doorWidth;

    public Stanza() {}

    public Stanza(String name) {
        this.name = name;
    }

    public Stanza(String name, double area) {
        this(name);
        this.area = area;
    }

    public Stanza(String name, double area, boolean isFurnished) {
        this(name, area);
        this.isFurnished = isFurnished;
    }

    public Stanza(String name, double area, boolean isFurnished, boolean hasWindows) {
        this(name, area, isFurnished);
        this.hasWindows = hasWindows;
    }

    public Stanza(String name, double area, boolean isFurnished, boolean hasWindows, double ceilingHeight) {
        this(name, area, isFurnished, hasWindows);
        this.ceilingHeight = ceilingHeight;
    }

    public Stanza(String name, double area, boolean isFurnished, boolean hasWindows, double ceilingHeight, String flooringType) {
        this(name, area, isFurnished, hasWindows, ceilingHeight);
        this.flooringType = flooringType;
    }

    public Stanza(String name, double area, boolean isFurnished, boolean hasWindows, double ceilingHeight, String flooringType, double ventilationFactor) {
        this(name, area, isFurnished, hasWindows, ceilingHeight, flooringType);
        this.ventilationFactor = ventilationFactor;
    }

    public Stanza(String name, double area, boolean isFurnished, boolean hasWindows, double ceilingHeight, String flooringType, double ventilationFactor, double lightingEfficiency) {
        this(name, area, isFurnished, hasWindows, ceilingHeight, flooringType, ventilationFactor);
        this.lightingEfficiency = lightingEfficiency;
    }

    public Stanza(String name, double area, boolean isFurnished, boolean hasWindows, double ceilingHeight, String flooringType, double ventilationFactor, double lightingEfficiency, String wallColor) {
        this(name, area, isFurnished, hasWindows, ceilingHeight, flooringType, ventilationFactor, lightingEfficiency);
        this.wallColor = wallColor;
    }

    public Stanza(String name, double area, boolean isFurnished, boolean hasWindows, double ceilingHeight, String flooringType, double ventilationFactor, double lightingEfficiency, String wallColor, double doorWidth) {
        this(name, area, isFurnished, hasWindows, ceilingHeight, flooringType, ventilationFactor, lightingEfficiency, wallColor);
        this.doorWidth = doorWidth;
    }

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Area: " + this.area);
        System.out.println("Is Furnished: " + this.isFurnished);
        System.out.println("Has Windows: " + this.hasWindows);
        System.out.println("Ceiling Height: " + this.ceilingHeight);
        System.out.println("Flooring Type: " + this.flooringType);
        System.out.println("Ventilation Factor: " + this.ventilationFactor);
        System.out.println("Lighting Efficiency: " + this.lightingEfficiency);
        System.out.println("Wall Color: " + this.wallColor);
        System.out.println("Door Width: " + this.doorWidth);
    }
}