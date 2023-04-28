public abstract class Personne {
    private String nom;
    private String prenom;
    private int age;


    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;

    }
    public void AfficherInfos(){
        System.out.println("le nom est :" + this.nom);
        System.out.println("le prenom est :" + this.prenom);
        System.out.println("l age est :" + this.age);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
