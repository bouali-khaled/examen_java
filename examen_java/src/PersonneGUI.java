import javax.swing.*;

class PersonneGUI {

    public static void main (String[] args) {

//creation de l etudiant et du profs
        Etudiant e = new Etudiant("hakim","khemisti", 22,12345,"M1");
        Profs p =  new Profs("tata","kiki",56,127,"MATH");

        //CREATION D UNE FENETRE
        JFrame frame = new JFrame("Personne GUI");
        frame.setSize(600, 400);

        // afficher  l'étudiant
        JLabel nomLabel_e = new JLabel("Nom : " + e.getNom());
        JLabel prenomLabel_e = new JLabel("Prenom : " + e.getPrenom());
        JLabel ageLabel_e = new JLabel("Age : " + e.getAge());
        JLabel idLabel_e = new JLabel("ID : " + e.getID());
        JLabel niveauLabel_e = new JLabel("Niveau : " + e.getNiveau());

        //  afficher le profs
        JLabel nomLabel_p = new JLabel("Nom : " + p.getNom());
        JLabel prenomLabel_p = new JLabel("Prenom : " + p.getPrenom());
        JLabel ageLabel_p = new JLabel("Age : " + p.getAge());
        JLabel idLabel_p = new JLabel("ID : " + p.getID_prof());
        JLabel moduleLabel_p = new JLabel("Module : " + p.getModule());

        //  regrouper les infos de l'étudiant
        JPanel etudiantPanel = new JPanel();
        etudiantPanel.add(nomLabel_e);
        etudiantPanel.add(prenomLabel_e);
        etudiantPanel.add(ageLabel_e);
        etudiantPanel.add(idLabel_e);
        etudiantPanel.add(niveauLabel_e);

        // regrouper les infos du profs
        JPanel professeurPanel = new JPanel();
        professeurPanel.add(nomLabel_p);
        professeurPanel.add(prenomLabel_p);
        professeurPanel.add(ageLabel_p);
        professeurPanel.add(idLabel_p);
        professeurPanel.add(moduleLabel_p);

        // regrouper les deux
        JPanel mainPanel = new JPanel();
        mainPanel.add(etudiantPanel);
        mainPanel.add(professeurPanel);


        frame.getContentPane().add(mainPanel);

        // Affichage
        frame.setVisible(true);
    }
}

