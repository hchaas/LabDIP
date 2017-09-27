
package dip.lab3.student.solution1;

public class Startup {
    public static void main(String[] args) {
//        TipCalculator newTip = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 55);
//        TipCalculatorService tipThis = new TipCalculatorService();
//        double thisTip = tipThis.getTip(newTip);
        
//        System.out.println("Tip is: " + thisTip);
        Reader reader = new KeyboardInput();
        MessageService thisReader = new MessageService();
        String myMessage = thisReader.readMessage(reader);
        
        Writer writer = new GUIOutput();
        MessageService thisWriter = new MessageService();
        thisWriter.writeMessage(writer);
        
    }
}