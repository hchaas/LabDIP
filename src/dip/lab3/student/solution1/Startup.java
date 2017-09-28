
package dip.lab3.student.solution1;

public class Startup {
    public static void main(String[] args) {

        Reader reader = new KeyboardInput();
        MessageService thisReader = new MessageService();
        String myMessage = thisReader.readMessage(reader);
        
        Writer writer = new GUIOutput();
        MessageService thisWriter = new MessageService();
        thisWriter.writeMessage(writer);
        
    }
}