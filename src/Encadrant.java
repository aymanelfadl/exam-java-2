import java.util.HashSet;
import java.util.*;


public class Encadrant { 

	private String nom; 
	private Set<PFE> projets; 
	
	public Encadrant (String nom) {
		this.nom = nom ;
	}

	public Encadrant(String nom, Set<PFE> projets) {
		this.nom = nom ;
		this.projets = new HashSet();
		this.projets = projets;
	}
	

	public Encadrant(Encadrant encadrant){
		this.nom = encadrant.nom;
		this.projets = new HashSet();
		this.projets = encadrant.projets;
	}  

	public void ajouterProjet(PFE projet){
		this.projets.add(projet);
	} 


	public void supprimerProjet(PFE projet){
		this.projets.remove(projet);
	} 

	public int NombreEtudiantsParEncadrant(){
		int nbr = 0 ;
		for(PFE projet : projets) {
			for(Etudiant e : projet.getGroupe()) {
				nbr++;
			}
		}
		return nbr;} 

	public int NombrePFEParEncadrant(){
		int nbr = 0 ; 
		for(PFE projet : projets) {
			if(projet.getEncadrant().equals(this)) {
				nbr++;
			}
		}
		return nbr ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<PFE> getProjets() {
		return projets;
	}

	public void setProjets(Set<PFE> projets) {
		this.projets = projets;
	} 
}
