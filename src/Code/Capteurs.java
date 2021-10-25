package Code;

import java.awt.Color ;

import  lejos.hardware.port.Port ;
import lejos.hardware.port.SensorPort ;
import  lejos.hardware.sensor.EV3ColorSensor ;
import  lejos.hardware.sensor.EV3TouchSensor ;
import  lejos.hardware.sensor.EV3UltrasonicSensor ;
import  lejos.robotics.SampleProvider ;
import  lejos.utility.Delay ;

public class Capteurs extends Cedric{
	
	
	// Initialisations des instances des capteurs( utraSons , couleurs et tactils)
	
	private EV3UltrasonicSensor capteurSon ;
	private EV3ColorSensor capteurCouleur ;
	private EV3TouchSensor capteurTouche ;
	
	//initialisation du constructeur reliant chaque capteur à son port
	public Capteurs() {
		 capteurSon = new EV3UltrasonicSensor(this.p2);
		 capteurCouleur = new EV3ColorSensor(this.p3);
		 capteurTouche = new EV3TouchSensor(this.p1);
		
	}
	
	
	//Capteur utrason
	  // attibut permettant de stocker la valeur d'une distance 
	private static  SampleProvider distance;
	private static float [] distances = new float[distance.sampleSize()];
	
	 // fonction permettante de  déterminer la distance mesurée par le capteur
	
	public float getDistance () {
		distance=capteurSon.getDistanceMode();
		distance.fetchSample(distances, 0);
		return distances[0];
	
	}
	
	// fonction permettant d'allumer le capteur d'ultraSon
	
	public void allumerCapteurSon() {
		capteurSon.enable();
		//
	}
	
	// fonction permettant d'éteindre le capteur d'ultraSon
	
	public void eteindreCapteurSon() {
		capteurSon.disable();
	}
	
	//fonction permettant de détectecter la couleur , renvoie l'indice d
	public double getCouleur() {
		return capteurCouleur.getColorID();
		
	}
	public boolean noir(double couleur) {
		return couleur==lejos.robotics.Color.BLACK;
	}
	public boolean blanc(double couleur) {
		return couleur==lejos.robotics.Color.WHITE;
	}
	public boolean bleu(double couleur) {
		return couleur==lejos.robotics.Color.BLUE;
	}
	public boolean vert(double couleur) {
		return couleur==lejos.robotics.Color.GREEN;
	}
	
	public boolean jaune(double couleur) {
		return couleur==lejos.robotics.Color.YELLOW;
	}
	public boolean rouge (double couleur) {
		return couleur==lejos.robotics.Color.RED;
	}
	
	
	public String couleurDetecte() {
		if (rouge(getCouleur()))
				return "rouge";
		else if (blanc(getCouleur()))
			return "blanc";
		else if (noir(getCouleur()))
			return "noir";
		else if (jaune(getCouleur()))
			return "jaune";
		else if (bleu(getCouleur()))
			return "bleu";
		else if (vert(getCouleur()))
			return "vert";
		else return "autre couleur";
			
	}
	
	// vérifie si on est au dela de la ligne blanche
//	public boolean campAdverse( int idxCouleur) {
//		return idxCouleur== ligneBlanche;
		}
	

	
	
	
	
	
	 


