/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.upb.etti.poo.chat_application.structs;

/**
 *
 * @author student
 */
public class PrivateMessage extends Message{
    
    private final String mRecipient;
    
    @Override
    public String toString(){
        
return "(priv)" + super.toString();
        
    }
    
    public PrivateMessage(String destination, String sender, String content){
        super(sender, content);
        mRecipient = destination;
     
    }
    
    public String getRecipient(){
        return mRecipient;
    }
}
