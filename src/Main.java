import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
    	
        Etudiant etudiant1 = new Etudiant("CNE123", "ayman", null);
        Etudiant etudiant2 = new Etudiant("CNE456", "ilyass", null);
        
        Encadrant encadrant = new Encadrant("Nsssim");

        PFE pfe = new PFE("CV APP", encadrant);
        PFE pf= new PFE("kaka", encadrant);
        
        Set projects = new HashSet();
        projects.add(pfe);
        projects.add(pf);
        
        encadrant.setProjets(projects);
        
        pfe.ajouterEtudiant(etudiant1);
        pfe.ajouterEtudiant(etudiant2);

        System.out.println("Initial PFE Information:");
        displayPFEInfo(pfe);

        etudiant1.setProjet(pfe); 
        etudiant2.setProjet(pfe);

        
        System.out.println("\nUpdated PFE Information:");
        displayPFEInfo(pfe);

        Etudiant newEtudiant = new Etudiant("CNE789", "lala om sidi", null);
        pfe.remplacerEtudiant(etudiant1, newEtudiant);

        System.out.println("\nPFE Information after Replacement:");
        displayPFEInfo(pfe);

        Set<Etudiant> newGroup = new HashSet<>();
        newGroup.add(new Etudiant("CNE101", "Hamid", null));
        newGroup.add(new Etudiant("CNE102", "Nonos", null));

        pfe.remplacerGroupe(newGroup);

        System.out.println("\nPFE Information after Replacing the Entire Group:");
        displayPFEInfo(pfe);
        
       
        
        
        
        
        
        
        System.out.println("Encadrant: " + pfe.getEncadrant().getNom() + "nbr = " + encadrant.NombreEtudiantsParEncadrant());
    }

    // Helper method to display PFE information
    private static void displayPFEInfo(PFE pfe) {
        System.out.println("PFE Sujet: " + pfe.getSujet());
        System.out.println("Encadrant: " + pfe.getEncadrant().getNom());

        System.out.println("Etudiants in the PFE:");
        for (Etudiant etudiant : pfe.getGroupe()) {
            System.out.println("- " + etudiant.getNom() + " (" + etudiant.getCne() + ")");
        }

        System.out.println("---------------");
    }
    

}
