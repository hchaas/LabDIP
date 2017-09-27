
package dip.lab2.student.solution1;

public class Startup {
//            AnimalAgeCalculator animalAge = new CatAgeCalculator(10);       
//        AnimalAgeService animalAgeService = new AnimalAgeService(animalAge);
//        double humanAge = animalAgeService.calculateHumanAge(10);
//        
//        System.out.println("The human age equivalent of this animal is " + humanAge + " years.");
    
    TipCalculator newTip = new FoodServiceTipCalculator(ServiceQuality.GOOD, 55);
    TipCalculatorService tipThis = new TipCalculatorService();
    double thisTip = tipThis.getTip(newTip);
    
    
}
