public class MixedSnacks{
    public String name;
    public double price;
    public int numAvail;
    
    public MixedSnacks (String n, double p){
        name = n;
        price = p;
    }
    public void setName (String newName){
        name = newName;
    }
    public void setPrice (double newPrice){
        price = newPrice;
    }
    public void vendItem (int numSnacks){
        numAvail--;
    }
    public void restock (int numSnacks){
        numAvail++;
    }
}