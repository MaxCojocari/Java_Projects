package phoneBillCalculator;

public class PhoneBill {
    private String id;
    private double overageMinutes;
    private double planFee;


    public PhoneBill(){
        id = "";
        overageMinutes = 0;
        planFee = 0;
    }

    public PhoneBill(String id){
        this.id = id;
        overageMinutes = 0;
        planFee = 0;
    }

    public PhoneBill(String id, double overageMinutes, double planFee){
        this.id = id;
        this.overageMinutes = overageMinutes;
        this.planFee = planFee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getOverageMinutes() {
        return overageMinutes;
    }

    public void setOverageMinutes(double nrAllotedMinutes) {
        this.overageMinutes = nrAllotedMinutes;
    }

    public double getPlanFee() {
        return planFee;
    }

    public void setPlanFee(double planFee) {
        this.planFee = planFee;
    }

    public double overageFee(){
        return overageMinutes * 0.25;
    }

    public double taxCalculator(){
        return (planFee + overageFee()) * 0.15;
    }

    public double finalTotal() {
        return planFee + overageFee() + taxCalculator();
    }

    public void printBill(){
        System.out.println("Phone Bill Statement");
        System.out.println("Bill's ID: " + id);
        System.out.println("Plan: $" + String.format("%.2f", planFee));
        System.out.println("Overage: $" + String.format("%.2f", overageFee()));
        System.out.println("Tax: $" + String.format("%.2f", taxCalculator()));
        System.out.println("Total: $" + String.format("%.2f", finalTotal()));
    }
}
