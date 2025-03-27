class DroneRunner {
    public static void main(String[] args) {
        Drone drone1 = new Drone(1500, "DJI", "Phantom 4", 1.38, 30.0, 7.0, 6000, true, 20, true, "China", 2, true, "15 Jan 2023", 4, true, 72.0, true, true, "Remote");
        Drone drone2 = new Drone(1200, "Parrot", "Anafi", 0.32, 25.0, 4.0, 2700, true, 21, true, "France", 1, false, "10 March 2022", 4, false, 55.0, true, true, "App");
        Drone drone3 = new Drone(2000, "Autel Robotics", "EVO II", 1.19, 40.0, 9.0, 7100, true, 48, true, "USA", 3, true, "5 Dec 2023", 6, true, 80.0, true, true, "Both");
        
        System.out.println("Drone 1 Details:");
        System.out.println("Price: " + drone1.price);
        System.out.println("Brand: " + drone1.brand);
        System.out.println("Model: " + drone1.model);
        System.out.println("Weight: " + drone1.weight + " kg");
        System.out.println("Max Flight Time: " + drone1.maxFlightTime + " mins");
        System.out.println("Max Range: " + drone1.maxRange + " km");
        System.out.println("Battery Capacity: " + drone1.batteryCapacity + " mAh");
        System.out.println("Has Camera: " + drone1.hasCamera);
        System.out.println("Camera Resolution: " + drone1.cameraResolution + " MP");
        System.out.println("GPS Enabled: " + drone1.isGPSenabled);
        System.out.println("Country of Origin: " + drone1.countryOfOrigin);
        System.out.println("Warranty Period: " + drone1.warrantyPeriod + " years");
        System.out.println("Obstacle Avoidance: " + drone1.hasObstacleAvoidance);
        System.out.println("Manufactured Date: " + drone1.manufacturedDate);
        System.out.println("Number of Rotors: " + drone1.numberOfRotors);
        System.out.println("Has Night Vision: " + drone1.hasNightVision);
        System.out.println("Max Speed: " + drone1.maxSpeed + " km/h");
        System.out.println("Has Auto Return: " + drone1.hasAutoReturn);
        System.out.println("Supports Live Streaming: " + drone1.supportsLiveStreaming);
        System.out.println("Control Type: " + drone1.controlType);
        System.out.println();
        
        System.out.println("Drone 2 Details:");
        System.out.println("Price: " + drone2.price);
        System.out.println("Brand: " + drone2.brand);
        System.out.println("Model: " + drone2.model);
        System.out.println("Weight: " + drone2.weight + " kg");
        System.out.println("Max Flight Time: " + drone2.maxFlightTime + " mins");
        System.out.println("Max Range: " + drone2.maxRange + " km");
        System.out.println("Battery Capacity: " + drone2.batteryCapacity + " mAh");
        System.out.println("Has Camera: " + drone2.hasCamera);
        System.out.println("Camera Resolution: " + drone2.cameraResolution + " MP");
        System.out.println("GPS Enabled: " + drone2.isGPSenabled);
        System.out.println("Country of Origin: " + drone2.countryOfOrigin);
        System.out.println("Warranty Period: " + drone2.warrantyPeriod + " years");
        System.out.println("Obstacle Avoidance: " + drone2.hasObstacleAvoidance);
        System.out.println("Manufactured Date: " + drone2.manufacturedDate);
        System.out.println("Number of Rotors: " + drone2.numberOfRotors);
        System.out.println("Has Night Vision: " + drone2.hasNightVision);
        System.out.println("Max Speed: " + drone2.maxSpeed + " km/h");
        System.out.println("Has Auto Return: " + drone2.hasAutoReturn);
        System.out.println("Supports Live Streaming: " + drone2.supportsLiveStreaming);
        System.out.println("Control Type: " + drone2.controlType);
        System.out.println();
        
        System.out.println("Drone 3 Details:");
        System.out.println("Price: " + drone3.price);
        System.out.println("Brand: " + drone3.brand);
        System.out.println("Model: " + drone3.model);
        System.out.println("Weight: " + drone3.weight + " kg");
        System.out.println("Max Flight Time: " + drone3.maxFlightTime + " mins");
        System.out.println("Max Range: " + drone3.maxRange + " km");
        System.out.println("Battery Capacity: " + drone3.batteryCapacity + " mAh");
        System.out.println("Has Camera: " + drone3.hasCamera);
        System.out.println("Camera Resolution: " + drone3.cameraResolution + " MP");
        System.out.println("GPS Enabled: " + drone3.isGPSenabled);
        System.out.println("Country of Origin: " + drone3.countryOfOrigin);
        System.out.println("Warranty Period: " + drone3.warrantyPeriod + " years");
        System.out.println("Obstacle Avoidance: " + drone3.hasObstacleAvoidance);
        System.out.println("Manufactured Date: " + drone3.manufacturedDate);
        System.out.println("Number of Rotors: " + drone3.numberOfRotors);
        System.out.println("Has Night Vision: " + drone3.hasNightVision);
        System.out.println("Max Speed: " + drone3.maxSpeed + " km/h");
        System.out.println("Has Auto Return: " + drone3.hasAutoReturn);
        System.out.println("Supports Live Streaming: " + drone3.supportsLiveStreaming);
        System.out.println("Control Type: " + drone3.controlType);
        System.out.println();
    }
}
