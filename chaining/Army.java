class Army {
    String branch;
    int personnelCount;
    boolean isDeployed;
    String currentTheater;
    String commandingOfficer;
    String primaryWeaponSystem;
    double budget;
    String trainingLocation;
    String vehicleType;
    String communicationSystem;

    public Army() {
    }

    public Army(String branch) {
        this.branch = branch;
    }

    public Army(String branch, int personnelCount) {
        this(branch);
        this.personnelCount = personnelCount;
    }

    public Army(String branch, int personnelCount, boolean isDeployed) {
        this(branch, personnelCount);
        this.isDeployed = isDeployed;
    }

    public Army(String branch, int personnelCount, boolean isDeployed, String currentTheater) {
        this(branch, personnelCount, isDeployed);
        this.currentTheater = currentTheater;
    }

    public Army(String branch, int personnelCount, boolean isDeployed, String currentTheater, String commandingOfficer) {
        this(branch, personnelCount, isDeployed, currentTheater);
        this.commandingOfficer = commandingOfficer;
    }

    public Army(String branch, int personnelCount, boolean isDeployed, String currentTheater, String commandingOfficer, String primaryWeaponSystem) {
        this(branch, personnelCount, isDeployed, currentTheater, commandingOfficer);
        this.primaryWeaponSystem = primaryWeaponSystem;
    }

    public Army(String branch, int personnelCount, boolean isDeployed, String currentTheater, String commandingOfficer, String primaryWeaponSystem, double budget) {
        this(branch, personnelCount, isDeployed, currentTheater, commandingOfficer, primaryWeaponSystem);
        this.budget = budget;
    }

    public Army(String branch, int personnelCount, boolean isDeployed, String currentTheater, String commandingOfficer, String primaryWeaponSystem, double budget, String trainingLocation) {
        this(branch, personnelCount, isDeployed, currentTheater, commandingOfficer, primaryWeaponSystem, budget);
        this.trainingLocation = trainingLocation;
    }

    public Army(String branch, int personnelCount, boolean isDeployed, String currentTheater, String commandingOfficer, String primaryWeaponSystem, double budget, String trainingLocation, String vehicleType) {
        this(branch, personnelCount, isDeployed, currentTheater, commandingOfficer, primaryWeaponSystem, budget, trainingLocation);
        this.vehicleType = vehicleType;
    }

    public Army(String branch, int personnelCount, boolean isDeployed, String currentTheater, String commandingOfficer, String primaryWeaponSystem, double budget, String trainingLocation, String vehicleType, String communicationSystem) {
        this(branch, personnelCount, isDeployed, currentTheater, commandingOfficer, primaryWeaponSystem, budget, trainingLocation, vehicleType);
        this.communicationSystem = communicationSystem;
    }

    public void info() {
        System.out.println("Branch: " + this.branch);
        System.out.println("Personnel Count: " + this.personnelCount);
        System.out.println("Is Deployed: " + this.isDeployed);
        System.out.println("Current Theater: " + this.currentTheater);
        System.out.println("Commanding Officer: " + this.commandingOfficer);
        System.out.println("Primary Weapon System: " + this.primaryWeaponSystem);
        System.out.println("Budget: " + this.budget);
        System.out.println("Training Location: " + this.trainingLocation);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Communication System: " + this.communicationSystem);
    }
}

