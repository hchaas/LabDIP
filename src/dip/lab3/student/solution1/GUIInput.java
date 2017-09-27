
package dip.lab3.student.solution1;
import javax.swing.JOptionPane;

public class GUIInput implements Reader{
    private String message;
    
    public GUIInput(String message){
        
    }
    
    public final String getMessages(){
        return message;
    }
    
    public final void setMessages(){        
        String thisMessage = JOptionPane.showInputDialog(null, "Enter message here:");
        if (message == null || message.isEmpty()){
            throw new IllegalArgumentException("Invalid message.");
        }
        else{
            thisMessage = message;
        }
    }
    
    @Override
    public final String readMessage(){
        return message;
    }
}
