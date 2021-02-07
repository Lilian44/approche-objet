package fr.diginamic.formes;

public class Cercle extends Forme {
 double rayon;
 
 public Cercle(double rayon) {
	super();
	this.rayon = rayon;
}
public void calculerSurface() {
	 System.out.println(3.14*(this.rayon*this.rayon));
 }
 public void calculerPerimetre() {
	 System.out.println(2*3.14*this.rayon);
	 
 }

}
