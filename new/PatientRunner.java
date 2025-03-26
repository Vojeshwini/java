class PatientRunner {
    public static void main(String[] args) {
        Patient patient = new Patient();

        System.out.println("Name: " + patient.name);
        System.out.println("Age: " + patient.age);
        System.out.println("Is Admitted: " + patient.isAdmitted);
        System.out.println("Disease: " + patient.disease);

        patient.name = "Rahul";
        patient.age = 45;
        patient.isAdmitted = true;
        patient.disease = "Flu";

        System.out.println("Updated Name: " + patient.name);
        System.out.println("Updated Age: " + patient.age);
        System.out.println("Updated Is Admitted: " + patient.isAdmitted);
        System.out.println("Updated Disease: " + patient.disease);
    }
}
