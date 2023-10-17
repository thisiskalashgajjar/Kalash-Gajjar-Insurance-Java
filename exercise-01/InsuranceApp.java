import java.util.Scanner;

public class InsuranceApp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int noOfPolicies = 2;

        Insurance[] policies = new Insurance[noOfPolicies];

        for (int i = 0; i < noOfPolicies; i++){
            System.out.println("Please enter the type of insurance (Health/Life): ");
            String insuranceType = input.nextLine();

            System.out.println("Enter the monthly cost: ");
            double monthlyCost = input.nextDouble();

            input.nextLine();

            if (insuranceType.equalsIgnoreCase("Health")){
                policies[i] = new Health(insuranceType);
            } else if (insuranceType.equalsIgnoreCase("Life")){
                policies[i] = new Life(insuranceType);
            } else {
                System.out.println("Invalid insurance type. Please enter 'Health' or 'Life'.");
                i--;
                continue;
            }

            policies[i].setInsuranceCost(monthlyCost);
        }

        System.out.println("\nInsurance Information: ");
        for (Insurance policy : policies) {
            policy.displayInfo();
            System.out.println();
        }

        input.close();
    }
}