import java.awt.peer.ListPeer;
import java.util.ArrayList;
import java.util.List;

public class Pile {

    private  List<Integer> listPile;

    public  Pile(){
        listPile = new ArrayList<>();
    }

    // il y a deja une methode pour faire ce travail => | nom de list . isEmpty()
    public boolean estVide(){
        return listPile.isEmpty();
    }


    public void empiler(int p){
        listPile.add(p);
    }

    public int depiler(){
        if(estVide()){
            System.out.println("la list est vide .");
            return -1;
        }

        Integer remove = listPile.remove(listPile.size() - 1);

        return remove;

    }

    public int sommet(){
        if(estVide()){
            System.out.println("la list est vide .");
            return -1;
        }

        return listPile.get(listPile.size() - 1);
    }



    public void afiche(){
        System.out.println("=====================================");
        System.out.print("[ ");
        for (int i = listPile.size() - 1  ; i >= 0 ; i--) {

            System.out.print(listPile.get(i));
            if(i > 0){
                System.out.print(" - ");
            }

        }
        System.out.println(" ]");
        System.out.println("=====================================");
    }

}
