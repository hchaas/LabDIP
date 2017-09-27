package dip.lab2.student.solution1;

public class Startup {

    public static void main(String[] args) {
        TipCalculator newTip = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 55);
        TipCalculatorService tipThis = new TipCalculatorService();
        double thisTip = tipThis.getTip(newTip);
        
        System.out.println("Tip is: " + thisTip);
    }

}
