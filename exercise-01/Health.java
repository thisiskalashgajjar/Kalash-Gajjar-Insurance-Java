public class Health extends Insurance{
    public Health(String insuranceType){
        super(insuranceType);
    }

    @Override
    public void setInsuranceCost(double monthlyCost){
        this.monthlyCost = monthlyCost;
    }
    @Override
    public void displayInfo(){
        System.out.println("Insurance Type: " + getInsuranceType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}