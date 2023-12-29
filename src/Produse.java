import java.util.LinkedList;
import java.util.List;

public class Produse {

    private String numeProdus;
    private int priceProdus;



    public Produse(String numeProdus, int priceProdus){
        this.numeProdus = numeProdus;
        this.priceProdus = priceProdus;
    }
    public Produse(String numeProdus){
        this.numeProdus = numeProdus;
    }

    public String getNumeProdus(){
        return numeProdus;
    }
    public int getPriceProdus(){
        return priceProdus;
    }

    @Override
    public String toString() {
        return "Produse{" +
                "numeProdus='" + numeProdus + '\'' +
                ", priceProdus=" + priceProdus +
                '}';
    }
}
