package fr.eni.demoSpring.bo;

public class Personne {
        private  String prenom;

        //Attention, norme javabea demande constructeur vide
        public Personne(){

        }

        public Personne(String prenom){
            super();
            this.prenom = prenom;
        }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "prenom='" + prenom + '\'' +
                '}';
    }
}
