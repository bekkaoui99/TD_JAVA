public class Main {


    public static void main(String[] args){


        Pile pile = new Pile();

        pile.empiler(2);
        pile.empiler(4);
        pile.empiler(6);
        pile.empiler(8);

        System.out.println( pile.estVide());
        pile.depiler();
        pile.sommet();
        pile.afiche();



    }

}
