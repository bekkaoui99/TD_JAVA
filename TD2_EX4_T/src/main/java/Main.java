public class Main {


    public static void main(String[] args){

        Pile pile = new Pile(20);
        System.out.println(pile.estVide());

        pile.empiler(10);
        pile.empiler(15);
        pile.empiler(20);
        pile.empiler(50);
        pile.empiler(7);

        System.out.println(pile.estPleine());
        System.out.println(pile.sommet());
        System.out.println(pile.depiler());
        System.out.println(pile.estVide());
        pile.afficher();
    }
}
