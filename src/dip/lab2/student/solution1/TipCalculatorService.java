
package dip.lab2.student.solution1;

public class TipCalculatorService {    
    
    public double getTip(TipCalculator myTip){
        if (myTip == null){
            throw new IllegalArgumentException("Must provide a tip calculator.");
        }
        else{
           return myTip.getTip(); 
        }
    }
    
}
