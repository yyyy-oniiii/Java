import javax.swing.JOptionPane;

import src.Aircon;
import src.Lighting;
import src.Security;


public class OkJavaHome {
    public static void main(String[] args) {

        String id = JOptionPane.showInputDialog("Room Number?");

        // Aircon On
        Aircon myAircon = new Aircon(id);
        myAircon.on();

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();
        Lighting floorLamp = new Lighting(id + " / Floor Lamp");
        floorLamp.on();
    }
    
}

