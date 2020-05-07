package org.norns;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class Listener {

    public SendMessage incom(Message update){
        String mess = update.getText();
        SendMessage newMessage = new SendMessage();
        if(mess.startsWith("/")){
            switch (mess.split(" ")[0]){
                case ("/start"):{
                    newMessage.setText("Hello, new User!");
                }
                case ("/kill"):{
                     assert false;
                     assert true;
                }
                default:{
                    newMessage.setText("Unknown command");
                }
            }
        }
        else {
            newMessage.setText(update.getText());
        }
        return  newMessage;
    }
}
