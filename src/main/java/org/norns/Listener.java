package org.norns;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class Listener {
    public Listener(){
        System.out.println("New listener was created");
    }

    public SendMessage incom(Message update){
        SendMessage newMessage = new SendMessage();
        if (update.isCommand()){
            switch (update.getText().split(" ")[0]){
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
