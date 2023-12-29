import java.util.ArrayList;
import java.util.List;

public class Cafe {

    private List<Produse> produseList = new ArrayList<>();

    private int totalBon = 0;


    public Cafe() {

    }

    public void addProduse(Produse produs) {
        produseList.add(produs);


    }

    public List<Produse> afisareListProduse() {
        System.out.println("Lista produselo disponibile este: ");

        return produseList;

    }

    public Produse selectProdus(Produse produs) throws  Exception{
        if (produseList.contains(produs)){
            return produs;
        }else {
            throw  new Exception("Nu am gasit asa produs");
        }
    }

   /* public void selectProdus(String produs) throws Exception {
        for (Produse produse : produseList) {
            if (produseList.contains(produs)) {
                System.out.println("Ati selectat produsul: " + produs);
                totalBon += produse.getPriceProdus();
                System.out.println("Total de achitat aveti: " + totalBon);
                break;
            }
        }
        if (!produseList.contains(produs)) {
            throw new Exception("Nu exista sa produs!");
        }
    } */


        public void achitareProdus ( int suma) throws Exception{
            if (suma == totalBon) {
                System.out.println("Comanda a fost achitata cu succes!");
                totalBon = 0;
            } else {
                throw new Exception("Achitare incorecta.Suma nu corespunde cecului");
            }
        }

    @Override
    public String toString() {
        return "Cafe{" +
                "produseList=" + produseList +
                ", totalBon=" + totalBon +
                '}';
    }
}
