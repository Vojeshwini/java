class SatelliteRunner {
    public static void main(String[] args) {
        Satellite sat1 = new Satellite("Hubble", "Telescope", 11110, 13.2, 4.2, "April 24, 1990", "Space Shuttle Discovery", "Low Earth Orbit", 
                                       7.5, 30, false, true, true, true, "USA", "NASA", true, "Astronomy", "X-band", 2800);
        Satellite sat2 = new Satellite("GSAT-30", "Communication", 3357, 3.1, 2.0, "January 17, 2020", "Ariane 5", "Geostationary Orbit", 
                                       3.07, 15, false, true, true, false, "India", "ISRO", true, "Telecommunication", "Ku-band", 6000);
        Satellite sat3 = new Satellite("Sentinel-1A", "Earth Observation", 2300, 2.5, 1.5, "April 3, 2014", "Soyuz", "Sun-Synchronous Orbit", 
                                       7.5, 12, false, true, true, true, "Europe", "ESA", true, "Radar Imaging", "C-band", 5200);
        
        System.out.println("Satellite 1 Details:");
        System.out.println("Name: " + sat1.name);
        System.out.println("Type: " + sat1.type);
        System.out.println("Weight: " + sat1.weight + " kg");
        System.out.println("Height: " + sat1.height + " m");
        System.out.println("Width: " + sat1.width + " m");
        System.out.println("Launch Date: " + sat1.launchDate);
        System.out.println("Launch Vehicle: " + sat1.launchVehicle);
        System.out.println("Orbit Type: " + sat1.orbitType);
        System.out.println("Speed: " + sat1.speed + " km/s");
        System.out.println("Lifespan: " + sat1.lifespan + " years");
        System.out.println("Is Manned: " + sat1.isManned);
        System.out.println("Has Solar Panels: " + sat1.hasSolarPanels);
        System.out.println("Has Communication System: " + sat1.hasCommunicationSystem);
        System.out.println("Has Scientific Instruments: " + sat1.hasScientificInstruments);
        System.out.println("Country of Origin: " + sat1.countryOfOrigin);
        System.out.println("Manufacturer: " + sat1.manufacturer);
        System.out.println("Is Operational: " + sat1.isOperational);
        System.out.println("Purpose: " + sat1.purpose);
        System.out.println("Frequency Band: " + sat1.frequencyBand);
        System.out.println("Power Output: " + sat1.powerOutput + " W");
        System.out.println();
        
        System.out.println("Satellite 2 Details:");
        System.out.println("Name: " + sat2.name);
        System.out.println("Type: " + sat2.type);
        System.out.println("Weight: " + sat2.weight + " kg");
        System.out.println("Height: " + sat2.height + " m");
        System.out.println("Width: " + sat2.width + " m");
        System.out.println("Launch Date: " + sat2.launchDate);
        System.out.println("Launch Vehicle: " + sat2.launchVehicle);
        System.out.println("Orbit Type: " + sat2.orbitType);
        System.out.println("Speed: " + sat2.speed + " km/s");
        System.out.println("Lifespan: " + sat2.lifespan + " years");
        System.out.println("Is Manned: " + sat2.isManned);
        System.out.println("Has Solar Panels: " + sat2.hasSolarPanels);
        System.out.println("Has Communication System: " + sat2.hasCommunicationSystem);
        System.out.println("Has Scientific Instruments: " + sat2.hasScientificInstruments);
        System.out.println("Country of Origin: " + sat2.countryOfOrigin);
        System.out.println("Manufacturer: " + sat2.manufacturer);
        System.out.println("Is Operational: " + sat2.isOperational);
        System.out.println("Purpose: " + sat2.purpose);
        System.out.println("Frequency Band: " + sat2.frequencyBand);
        System.out.println("Power Output: " + sat2.powerOutput + " W");
        System.out.println();

        System.out.println("Satellite 3 Details:");
        System.out.println("Name: " + sat3.name);
        System.out.println("Type: " + sat3.type);
        System.out.println("Weight: " + sat3.weight + " kg");
        System.out.println("Height: " + sat3.height + " m");
        System.out.println("Width: " + sat3.width + " m");
        System.out.println("Launch Date: " + sat3.launchDate);
        System.out.println("Launch Vehicle: " + sat3.launchVehicle);
        System.out.println("Orbit Type: " + sat3.orbitType);
        System.out.println("Speed: " + sat3.speed + " km/s");
        System.out.println("Lifespan: " + sat3.lifespan + " years");
        System.out.println("Is Manned: " + sat3.isManned);
        System.out.println("Has Solar Panels: " + sat3.hasSolarPanels);
        System.out.println("Has Communication System: " + sat3.hasCommunicationSystem);
        System.out.println("Has Scientific Instruments: " + sat3.hasScientificInstruments);
        System.out.println("Country of Origin: " + sat3.countryOfOrigin);
        System.out.println("Manufacturer: " + sat3.manufacturer);
        System.out.println("Is Operational: " + sat3.isOperational);
        System.out.println("Purpose: " + sat3.purpose);
        System.out.println("Frequency Band: " + sat3.frequencyBand);
        System.out.println("Power Output: " + sat3.powerOutput + " W");
        System.out.println();
    }
}
