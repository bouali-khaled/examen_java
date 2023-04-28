public class Main {
    public static void main(String[] args) {

        Etudiant E1 = new Etudiant("hakim","khemisti", 22,12345,"M1");
        Etudiant E2 = new Etudiant("stef","toto", 29,54321,"M2");
        E1.AfficherEtudiants();
        E2.AfficherEtudiants();
        E1.getID();
        E2.getNiveau();


        Profs P1 =  new Profs("tata","kiki",56,127,"MATH");
        P1.AfficherProfs();
        P1.getID_prof();
        P1.getModule();













    }
}