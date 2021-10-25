package test;
import  Code.Capteurs;
import lejos.hardware.port.Port;

public class TestCapteurs {

	public static void main(String[] args) {
		
		Capteurs c =new Capteurs();
		
		c.allumerCapteurSon();
		c.getDistance();
		//c.getDistance();

	}

}
