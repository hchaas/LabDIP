
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

public class GUIOutput implements Writer{
    private String message;
    
    public void GUIOutput(String message){
        this.setMessage(message);
    }
    
    public final String getMessage(){
        return message;
    }
    
    public final void setMessage(String message){
        if (message == null || message.isEmpty()){
            throw new IllegalArgumentException("Invalid message");
        }
        else {
            this.message = message;
        }
    }
    
    @Override
    public final void writeMessage(){
        JOptionPane.showMessageDialog(null,message);
    }
}
