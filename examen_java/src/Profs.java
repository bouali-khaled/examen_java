class Profs extends Personne {
    private int ID_prof;
    private String module;

    public Profs(String nom, String prenom, int age,int ID_prof, String module) {
        super(nom, prenom,age);

        this.ID_prof = ID_prof;
        this.module = module;
    }

    public void AfficherProfs(){
        super.AfficherInfos();
        System.out.println(" l id du prof  est :" +this.ID_prof );
        System.out.println(" le module du profs  est :" +this.module );
    }

    public int getID_prof() {
        return ID_prof;
    }

    public String getModule() {
        return module;
    }
}