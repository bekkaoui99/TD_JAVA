import lombok.*;

import java.util.ArrayList;
import java.util.List;

/*Maven est un outil de gestion de projet qui facilite le processus de construction,
de test et de déploiement de logiciels.

Lombok est une bibliothèque Java qui simplifie le développement en automatisant la génération de code.
Elle fournit des annotations qui permettent de générer automatiquement du code
*/

/*@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter*/
public class Individu {


    private static int compte ;
    private String nom ;
    private String adrese ;
    private String telephone ;

    private static List<Individu> individuList = new ArrayList<>();

    public Individu(){
        compte++;
        individuList.add(this);
    }
    public Individu(String nom, String adrese, String telephone) {
        this.nom = nom;
        this.adrese = adrese;
        this.telephone = telephone;
        compte++;
        individuList.add(this);
    }

    public static void setCompte(int compte) {
        Individu.compte = compte;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdrese(String adrese) {
        this.adrese = adrese;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static int getCompte() {
        return compte;
    }

    public String getNom() {
        return nom;
    }

    public String getAdrese() {
        return adrese;
    }

    public String getTelephone() {
        return telephone;
    }

    public void afiche(){
        System.out.println("===============================");
        System.out.println("nom :" + this.nom);
        System.out.println("adresse :" + this.adrese);
        System.out.println("telephone :" + this.telephone);
        System.out.println("===============================");
    }

    public static void afficher_nombre_objets(){
        System.out.println("===============================");
        System.out.println("le nombre d'objects est : " + compte);
        System.out.println("===============================");
    }

    public static void liste_des_individus(){
        for(Individu individu : individuList){
            individu.afiche();
        }
    }

}
