package Code;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.Port;
import lejos.robotics.RegulatedMotor;

public class Pinces extends Cedric {
	//déclaration des attributs du moteurs 
	private RegulatedMotor pinces;
	
	//initialisation du constructeur
	public Pinces () {
	pinces = new EV3LargeRegulatedMotor(this.C);
	}
	
	//fonction permettant d'ouvrir les pinces 
	public void ouvrirPinces( int ecart) {
		pinces.rotate(ecart*360);
	}
	
	//fonction permettant de fermer les pinces
	public void fermerPinces (int ecart) {
		pinces.rotate(-ecart*360);
	}
	
	//fonction permettant de savoir si les pinces sont ouvertes
	public boolean estOuvert () {
		return pinces.isMoving();
	}
}
