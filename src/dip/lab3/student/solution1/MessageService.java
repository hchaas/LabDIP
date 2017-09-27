
package dip.lab3.student.solution1;

public class MessageService {
    public String readMessage(Reader reader){
        if (reader == null){
            throw new IllegalArgumentException("Must specify a reader.");
        }
        else{
            return reader.readMessage();
        }
    }
    
    public void writeMessage(Writer writer){
        if (writer == null){
            throw new IllegalArgumentException("Must specify a writer.");
        }
        else writer.writeMessage();
    }
}
