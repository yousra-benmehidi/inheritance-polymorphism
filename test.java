package exo4;
import java.util.*;

public class test {
public static void meilleurNote(ArrayList<Etudiant> list) {
	float max=0;
	for(Etudiant item: list) {
		if(item.calculMoyenne()>max)
			max=item.calculMoyenne();
	}
	System.out.println("la meilleure moyenne est "+max);
}
	public static void main(String[] args) {
		/*
	personne person=new personne("mohammed","soualmi",50);
	Etudiant etud=new Etudiant("akram","mounoub",19);
	Enseignant ens=new Enseignant("islam","ali",30);
	person=ens;
	ens=person;
	etud=(Etudiant)person;
	*/
		Etudiant etud1=new Etudiant("akram","mounoub",19);
		int[] notes1 = new int[] {10,15,20,20,17};
		etud1.setNotes(notes1);
		Etudiant etud2=new Etudiant("akram","mounoub",19);
		int[] notes2 = new int[] {20,15,13,11,10};
		etud2.setNotes(notes2);
		Etudiant etud3=new Etudiant("akram","mounoub",19);
		int[] notes3 = new int[] {20,19,18,17,16};
		etud3.setNotes(notes3);
		ArrayList<Etudiant> list=new ArrayList<>() ;
		meilleurNote(list);
		
		/*System.out.println(etud);
		
		Enseignant ens=new Enseignant("islam","ali",30);
		String[] modules=new String[] {"ao","lm","tl","asd"};
		ens.setModules(modules);
		System.out.println(ens);*/
	}
}
