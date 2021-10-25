package Code;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class Moteurs extends Cedric  {
	//initialisation des attributs des moteurs
	 private RegulatedMotor roueDroite ;
	 private RegulatedMotor roueGauche ;
	 
	 private int vitesse;
	 private int acceleration ;
	 
	 
	 //constructeur permettant d'initialiser les moteurs
	 public Moteurs () {
		 
	 roueDroite =new EV3LargeRegulatedMotor(this.D);
	 roueGauche =new EV3LargeRegulatedMotor(this.A);
	 
	 acceleration=this.acceleration;
	 vitesse=this.vitesse;
	 }
	 
	 //fonction permettant de se déplacer vers l'avant
	 public void avancer (int distance) {
		 roueDroite.setSpeed(vitesse);
		 roueGauche.setSpeed(vitesse);
		 roueDroite.forward();
		 roueGauche.forward();
		 Delay.msDelay(distance);
	 }
	 
	 //fonction permettant de faire marche arrière
	 public void arriere(int distance) {
		 roueDroite.backward();
		 roueGauche.backward();
		 Delay.msDelay(distance);
		// tourner(140);
		 arreter();
	 }
	 //fonction permettant d'arreter le robot

	public void arreter() {
		roueDroite.stop();
		roueGauche.stop();
		
	}
	//fonction permettant de tourner d'un angle i
	public void tourner( int angle) {
		if (angle >0)
			roueDroite.rotate(angle);
		else
			roueGauche.rotate(-angle);
	}
	
	//fonction permettant de faire un quart de tour
	public void quart_tour() {
		roueDroite.rotate(360);
		//roueGauche.rotate(-90);
	}
	
	//fonction permettant de faire un demi de tour
		public void demi_tour() {
			roueDroite.rotate(2*355);
			//roueGauche.rotate(180);
		}
	
	//fonction permettant de faire un  tour complet
		public void tour() {
			roueDroite.rotate(4*355);
			//roueGauche.rotate(360);
		}
	

}
