class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket(500000000, "SpaceX", "Falcon 9", 549054, 27000.0, 200000, 400000, true, 9, true, "USA", 10, true, "30 March 2017", 22800, true, 7607, true, true, "RP-1");
        Rocket rocket2 = new Rocket(900000000, "NASA", "SLS", 2600000, 40000.0, 450000, 2900000, false, 4, false, "USA", 15, true, "16 Nov 2022", 95000, true, 39000, true, true, "LH2");
        Rocket rocket3 = new Rocket(350000000, "Blue Origin", "New Glenn", 1300000, 31000.0, 400000, 1500000, true, 7, true, "USA", 12, false, "2024", 45000, true, 17000, false, true, "Methane");
        
        System.out.println("Rocket 1 Details:");
        System.out.println("Price: " + rocket1.price);
        System.out.println("Brand: " + rocket1.brand);
        System.out.println("Model: " + rocket1.model);
        System.out.println("Weight: " + rocket1.weight + " kg");
        System.out.println("Max Speed: " + rocket1.maxSpeed + " km/h");
        System.out.println("Max Altitude: " + rocket1.maxAltitude + " km");
        System.out.println("Fuel Capacity: " + rocket1.fuelCapacity + " liters");
        System.out.println("Has Reusable Stages: " + rocket1.hasReusableStages);
        System.out.println("Number of Engines: " + rocket1.numberOfEngines);
        System.out.println("Has Autonomous Landing: " + rocket1.hasAutonomousLanding);
        System.out.println("Country of Origin: " + rocket1.countryOfOrigin);
        System.out.println("Warranty Period: " + rocket1.warrantyPeriod + " years");
        System.out.println("Has Escape System: " + rocket1.hasEscapeSystem);
        System.out.println("Launch Date: " + rocket1.launchDate);
        System.out.println("Payload Capacity: " + rocket1.payloadCapacity + " kg");
        System.out.println("Has AI Control: " + rocket1.hasAIControl);
        System.out.println("Thrust: " + rocket1.thrust + " kN");
        System.out.println("Has Crew Support: " + rocket1.hasCrewSupport);
        System.out.println("Supports Satellite Deployment: " + rocket1.supportsSatelliteDeployment);
        System.out.println("Fuel Type: " + rocket1.fuelType);
        System.out.println();
        
        System.out.println("Rocket 2 Details:");
        System.out.println("Price: " + rocket2.price);
        System.out.println("Brand: " + rocket2.brand);
        System.out.println("Model: " + rocket2.model);
        System.out.println("Weight: " + rocket2.weight + " kg");
        System.out.println("Max Speed: " + rocket2.maxSpeed + " km/h");
        System.out.println("Max Altitude: " + rocket2.maxAltitude + " km");
        System.out.println("Fuel Capacity: " + rocket2.fuelCapacity + " liters");
        System.out.println("Has Reusable Stages: " + rocket2.hasReusableStages);
        System.out.println("Number of Engines: " + rocket2.numberOfEngines);
        System.out.println("Has Autonomous Landing: " + rocket2.hasAutonomousLanding);
        System.out.println("Country of Origin: " + rocket2.countryOfOrigin);
        System.out.println("Warranty Period: " + rocket2.warrantyPeriod + " years");
        System.out.println("Has Escape System: " + rocket2.hasEscapeSystem);
        System.out.println("Launch Date: " + rocket2.launchDate);
        System.out.println("Payload Capacity: " + rocket2.payloadCapacity + " kg");
        System.out.println("Has AI Control: " + rocket2.hasAIControl);
        System.out.println("Thrust: " + rocket2.thrust + " kN");
        System.out.println("Has Crew Support: " + rocket2.hasCrewSupport);
        System.out.println("Supports Satellite Deployment: " + rocket2.supportsSatelliteDeployment);
        System.out.println("Fuel Type: " + rocket2.fuelType);
        System.out.println();
        
        System.out.println("Rocket 3 Details:");
        System.out.println("Price: " + rocket3.price);
        System.out.println("Brand: " + rocket3.brand);
        System.out.println("Model: " + rocket3.model);
        System.out.println("Weight: " + rocket3.weight + " kg");
        System.out.println("Max Speed: " + rocket3.maxSpeed + " km/h");
        System.out.println("Max Altitude: " + rocket3.maxAltitude + " km");
        System.out.println("Fuel Capacity: " + rocket3.fuelCapacity + " liters");
        System.out.println("Has Reusable Stages: " + rocket3.hasReusableStages);
        System.out.println("Number of Engines: " + rocket3.numberOfEngines);
        System.out.println("Has Autonomous Landing: " + rocket3.hasAutonomousLanding);
        System.out.println("Country of Origin: " + rocket3.countryOfOrigin);
        System.out.println("Warranty Period: " + rocket3.warrantyPeriod + " years");
        System.out.println("Has Escape System: " + rocket3.hasEscapeSystem);
        System.out.println("Launch Date: " + rocket3.launchDate);
        System.out.println("Payload Capacity: " + rocket3.payloadCapacity + " kg");
        System.out.println("Has AI Control: " + rocket3.hasAIControl);
        System.out.println("Thrust: " + rocket3.thrust + " kN");
        System.out.println("Has Crew Support: " + rocket3.hasCrewSupport);
        System.out.println("Supports Satellite Deployment: " + rocket3.supportsSatelliteDeployment);
        System.out.println("Fuel Type: " + rocket3.fuelType);
    }
}