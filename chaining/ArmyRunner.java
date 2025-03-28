class ArmyRunner {
    public static void main(String[] args) {
        String branch = "Infantry";
        int personnelCount = 5000;
        boolean isDeployed = true;
        String currentTheater = "Middle East";
        String commandingOfficer = "General Smith";
        String primaryWeaponSystem = "M4 Carbine";
        double budget = 10000000.0;
        String trainingLocation = "Fort Benning";
        String vehicleType = "Humvee";
        String communicationSystem = "Satellite Radio";

        Army army0 = new Army();
        Army army1 = new Army(branch);
        Army army2 = new Army(branch, personnelCount);
        Army army3 = new Army(branch, personnelCount, isDeployed);
        Army army4 = new Army(branch, personnelCount, isDeployed, currentTheater);
        Army army5 = new Army(branch, personnelCount, isDeployed, currentTheater, commandingOfficer);
        Army army6 = new Army(branch, personnelCount, isDeployed, currentTheater, commandingOfficer, primaryWeaponSystem);
        Army army7 = new Army(branch, personnelCount, isDeployed, currentTheater, commandingOfficer, primaryWeaponSystem, budget);
        Army army8 = new Army(branch, personnelCount, isDeployed, currentTheater, commandingOfficer, primaryWeaponSystem, budget, trainingLocation);
        Army army9 = new Army(branch, personnelCount, isDeployed, currentTheater, commandingOfficer, primaryWeaponSystem, budget, trainingLocation, vehicleType);
        Army army10 = new Army(branch, personnelCount, isDeployed, currentTheater, commandingOfficer, primaryWeaponSystem, budget, trainingLocation, vehicleType, communicationSystem);

        army0.info();
        army1.info();
        army2.info();
        army3.info();
        army4.info();
        army5.info();
        army6.info();
        army7.info();
        army8.info();
        army9.info();
        army10.info();
    }
}