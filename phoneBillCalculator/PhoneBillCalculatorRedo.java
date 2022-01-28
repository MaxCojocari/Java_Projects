package phoneBillCalculator;

import java.util.Scanner;

public class PhoneBillCalculatorRedo {

    public static void main(String[] args) {

        PhoneBillCalculatorRedo calculator = new PhoneBillCalculatorRedo();

        PhoneBill newBill1 = new PhoneBill();
        newBill1.setId("qwerty541");
        newBill1.setOverageMinutes(34);
        newBill1.setPlanFee(12);
        newBill1.printBill();

        PhoneBill newBill2 = new PhoneBill("tyui931");
        newBill2.setOverageMinutes(26.5);
        newBill2.setPlanFee(7.15);
        newBill2.printBill();

        PhoneBill newBill3 = calculator.createNewBill();
        newBill3.printBill();
    }

    public PhoneBill createNewBill(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the ID of bill:");
        String id = input.next();

        System.out.println("Enter base cost of the plan:");
        double planFee = input.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = input.nextDouble();

        input.close();

        return new PhoneBill(id, overageMinutes, planFee);
    }
}
