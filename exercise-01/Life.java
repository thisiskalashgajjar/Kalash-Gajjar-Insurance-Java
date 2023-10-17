public class Life extends Insurance{
    public Life(String insuranceType){
        super(insuranceType);
    }

    @Override
    public void setInsuranceCost(double monthlyCost){
        this.monthlyCost = monthlyCost;
    }
    @Override
    public void displayInfo(){
        System.out.println("Insurance Type: " + getInsuranceType());
        System.out.println("Monthly Cost: $" + monthlyCost);
    }
}