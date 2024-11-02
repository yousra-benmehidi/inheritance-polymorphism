package exo4;
import java.util.*;
public class Etudiant extends personne {
	private int[] notes=new int[5];
	private Enseignant[] profs = new Enseignant[5];
	//constructor
	public Etudiant(String nom,String prenom, int age) {
		super(nom,prenom,age);
	}
	//getters and setters
	public void setNotes(int[] notes) {
		this.notes=notes;
	}
	public int[] getNotes() {
		return notes;
	}
	//methods
	public void remplirNotes() {
		Scanner scr = new Scanner(System.in);
		for(int i=0;i<this.notes.length;i++) {
			notes[i]=scr.nextInt();
		}
	}
	public float calculMoyenne() {
		int s=0;
		for(int i=0;i<this.notes.length;i++) {
			s=s+notes[i];
		}
		return s/5;
	}
	public void affecterEns(Enseignant[] profs) {
		this.profs=profs;
	}
	@Override
	public String toString() {
		String n =" ";
		for(int i=0;i<notes.length;i++) {
			n=n+notes[i]+" ";
		}
		return super.toString()+" notes:"+n+" moyenne: "+this.calculMoyenne();
	}
}
