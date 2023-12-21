public class Etudiant implements Comparable<Etudiant>{  
	
	private String cne; 
	private String nom; 
	private PFE projet; 
	
	public Etudiant(String cne , String nom ,PFE projet ) {
		this.cne = cne;
		this.nom = nom;
		this.projet = projet ;
	}
	public int compareTo(Etudiant etudiant) {
		if(this == etudiant ) {
			return 1;
		}
		if(this.cne.equals(etudiant.cne) && this.nom.equals(nom) && this.projet.equals(etudiant.projet)) {
			return 1;
		}else {
			return -1;
		}
	}
	public String getCne() {
		return cne;
	}
	public void setCne(String cne) {
		this.cne = cne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public PFE getProjet() {
		return projet;
	}
	public void setProjet(PFE projet) {
		this.projet = projet;
	} 
} 