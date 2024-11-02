package exo4;

public class Enseignant extends personne {
	private String[] modules = new String[4];
	//constructor
	public Enseignant(String nom,String prenom, int age) {
		super(nom,prenom,age);
	}
	//getters and setters
	public void setModules(String[] modules) {
		this.modules=modules;
	}
	public String[] getModules() {
		return modules;
	}
	//methods
	@Override
	public String toString() {
		String n=" ";
		for(int i=0;i<modules.length;i++) {
			n=n+modules[i]+", ";
		}
		return super.toString()+" modules enseignés:"+n;
	}
}
