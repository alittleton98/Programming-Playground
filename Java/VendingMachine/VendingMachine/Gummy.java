public class Gummy{
    public String name;
    public double price;
    public int numAvail;
    
    public Gummy (String n, double p){
        name = n;
        price = p;
    }
    public void setName (String newName){
        name = newName;
    }
    public void setPrice (double newPrice){
        price = newPrice;
    }
    public void vendItem (int numGummy){
        numAvail--;
    }
    public void restock (int numGummy){
        numAvail++;
    }
}