package org.norns;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
        System.out.println("This is test!");
    }
    @Test
    public void answer(){
        Message sendMessage = new Message();
        Message incomMessage = new Message();
        assertTrue(true);

    }
}
