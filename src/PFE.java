import java.util.*;

public class PFE { 
	
	private String sujet; 
	private Encadrant encadrant; 
	private Set<Etudiant> groupe; 
 
	public PFE(String sujet, Encadrant encadrant) {
		this.groupe= new HashSet();
		this.sujet = sujet;
		this.encadrant = encadrant;
	} 

	public void ajouterEtudiant(Etudiant etudiant){
		this.groupe.add(etudiant);
	} 

	public void supprimerEtudiant(Etudiant etudiant) {
		this.groupe.remove(etudiant);
	} 

	public void remplacerEtudiant(Etudiant etudiant1, Etudiant etudiant2) {
		this.groupe.remove(etudiant1);
		this.groupe.add(etudiant2);
	}

	public void ajouterGroupe(Set<Etudiant> groupe) {
		this.groupe = groupe; 
	} 

	public void viderGroupe() {
		this.groupe.removeAll(this.groupe);
	};

	public void remplacerGroupe(Set<Etudiant> nouveauGroupe){
		this.viderGroupe();
		this.groupe.addAll(nouveauGroupe);
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public Encadrant getEncadrant() {
		return encadrant;
	}

	public void setEncadrant(Encadrant encadrant) {
		this.encadrant = encadrant;
	}

	public Set<Etudiant> getGroupe() {
		return groupe;
	}

	public void setGroupe(Set<Etudiant> groupe) {
		this.groupe = groupe;
	} 
} 