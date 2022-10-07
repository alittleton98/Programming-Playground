public class Gum{
    public String name;
    public double price;
    public int numAvail;
    
    public Gum (String n, double p){
        name = n;
        price = p;
    }
    public void setName (String newName){
        name = newName;
    }
    public void setPrice (double newPrice){
        price = newPrice;
    }
    public void vendItem (int numGum){
        numAvail--;
    }
    public void restock (int numGum){
        numAvail++;
    }
}