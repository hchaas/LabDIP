
package dip.lab3.student.solution1;

public class ConsoleMessageWriter implements Writer{
    private String message;
    
    public final void setMessage(String message){
        if (message == null || message.isEmpty()){
            throw new IllegalArgumentException("Invalid message entry.");
        }
        else{
            this.message = message;
        }
    }
    
    @Override
    public final void writeMessage(){
        System.out.println(message);
    }
}
