import java.util.Scanner;
public class Input {

    public static void main (String [] alo){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the patient's name? ");
        String patient_name = scanner.nextLine();
        System.out.print("What is the patient's age? ");
        int patient_age = scanner.nextInt();
        System.out.print("What is the patient's weight? ");
        double patient_weight = scanner.nextDouble();
        System.out.print("Does the patient smokes? ");
        boolean patientS = scanner.nextBoolean();
        scanner.close();
        
        System.out.println();        
        System.out.println();
        System.out.println("Patient's Info:");
        System.out.println();
        System.out.println("patient's name: " + patient_name);
        System.out.println("patient's age: " + patient_age);
        System.out.println("patient's weight: " + patient_weight);
        System.out.println("Smoking Status: " + patientS);

    }
}
