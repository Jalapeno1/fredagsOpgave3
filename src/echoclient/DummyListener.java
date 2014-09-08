/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package echoclient;

/**
 *
 * @author Jonas
 */
public class DummyListener implements echoListener.EchoListener
{

    @Override
    public void messageReceived(String msg)
    {
        System.out.println("IT WORKED "+msg);
    }
    
}
