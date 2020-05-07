package org.norns;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class InfoBot extends TelegramLongPollingBot {
    private Listener listener = new Listener();
    @Override
    public void onUpdateReceived(Update update){
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        sendMessage = listener.incom(update.getMessage());
        try {
            execute(sendMessage);
        }
        catch (TelegramApiException e){
            System.out.println(e);
        }

    }

    @Override
    public String getBotUsername(){
        return "";
    }

    @Override
    public String getBotToken(){
        return "";
    }

}
