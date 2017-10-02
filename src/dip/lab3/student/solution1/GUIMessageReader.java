
package dip.lab3.student.solution1;
import javax.swing.JOptionPane;

public class GUIMessageReader implements Reader{
    private String message;
    
    public final void setMessage(){        
        message = JOptionPane.showInputDialog(null, "Enter message here:");
        if (message == null || message.isEmpty()){
            throw new IllegalArgumentException("Invalid message.");
        }
    }
    
    @Override
    public final String readMessage(){
        return message;
    }
}
