package exo4;

public class personne {
	private String nom,prenom;
	private int age;
	public personne(String nom,String prenom, int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "nom: "+nom+" prenom: "+prenom+" age: "+age;
	}
}
