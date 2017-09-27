
package dip.lab3.student.solution1;

import java.util.Scanner;

public class KeyboardInput implements Reader{
    private String message;
    
    public void KeyboardInput(String message){
        this.setMessage();
    }
    
    public final String getMessage(){
        return message;
    }
    
    public final void setMessage(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter message: ");
        String keyboardMessage = keyboard.nextLine();
        
        if (keyboardMessage == null || keyboardMessage.isEmpty()){
            throw new IllegalArgumentException("Invalid entry.");
        }
        else{
            keyboardMessage = message;
        }
    }
    
    
    @Override
    public final String readMessage(){
        return message;
    }
}
