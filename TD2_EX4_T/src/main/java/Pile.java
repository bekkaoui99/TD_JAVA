public class Pile {
    private int[] elements;
    private int sommet;

    public Pile(int tailleMax) {
        elements = new int[tailleMax];
        sommet = -1;
    }

    public void empiler(int valeur) {
        if (estPleine()) {
            System.out.println("Erreur : la pile est pleine");
            return;
        }
        sommet++;
        elements[sommet] = valeur;
    }

    public int depiler() {
        if (estVide()) {
            System.out.println("Erreur : la pile est vide");
            return -1;
        }
        int valeurDepilee = elements[sommet];
        sommet--;
        return valeurDepilee;
    }

    public boolean estVide() {

        return sommet == -1;
    }

    public boolean estPleine() {

        return sommet == elements.length - 1;
    }

    public int taille() {
        return sommet + 1;
    }

    public int sommet() {
        if (estVide()) {
            System.out.println("Erreur : la pile est vide");
            return -1;
        }
        return elements[sommet];
    }

    public void afficher() {
        System.out.print("Contenu de la pile : [");
        for (int i = sommet; i >= 0; i--) {
            System.out.print(elements[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
