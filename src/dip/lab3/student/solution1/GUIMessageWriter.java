
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

public class GUIMessageWriter implements Writer{
    private String message;
    
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
