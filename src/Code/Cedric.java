package Code;
import Code.Capteurs;
import Code.Moteurs;
import Code.Pinces;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.Port;
import lejos.robotics.Color;
import lejos.robotics.RegulatedMotor;

public class Cedric  {
	final static Port p1=lejos.hardware.port.SensorPort.S1;
	final static Port p2=lejos.hardware.port.SensorPort.S2;
	final static Port p3=lejos.hardware.port.SensorPort.S3;
	Capteurs c;
	Moteurs m;
	Pinces p;
	final static int vitesse =200;
	final static int acceleration=200;
	
	static final Port C = lejos.hardware.port.MotorPort.C;
	static final Port A= lejos.hardware.port.MotorPort.A;
	static final Port D = lejos.hardware.port.MotorPort.D;
	
	//il faudrait finir de créer le constructeur permettant d'initialiser tous les attibuts de cédric
	
	public Cedric() {
	    c =new Capteurs();
	    m= new Moteurs();
	    p= new Pinces();

	}
	
	
	
}
