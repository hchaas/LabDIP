
package dip.lab3.student.solution1;

import java.util.Scanner;

public class KeyboardMessageReader implements Reader{
    private String message;
    
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
