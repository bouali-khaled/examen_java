class Etudiant extends Personne {
    private int ID_Etudiant;
    private String niveau_Etudiant;

    public Etudiant(String nom, String prenom, int age, int ID_Etudiant, String niveau_Etudiant) {
        super(nom, prenom,age);

        this.ID_Etudiant = ID_Etudiant;
        this.niveau_Etudiant = niveau_Etudiant;
    }

    public void AfficherEtudiants(){
        super.AfficherInfos();
        System.out.println(" l id de l etudiant est :" +this.ID_Etudiant );
        System.out.println(" l NIVEAU de l etudiant est :" +this.niveau_Etudiant );
    }

    public int getID() {
        return ID_Etudiant;
    }

    public String getNiveau() {
        return niveau_Etudiant;
    }




    public void setID(int ID_Etudiant) {
        this.ID_Etudiant = ID_Etudiant;

    }

    public void setNiveau_Etudiant(String niveau_Etudiant) {
        this.niveau_Etudiant = niveau_Etudiant;

    }




}
