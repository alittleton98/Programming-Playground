public class Chips{
    public String name;
    public double price;
    public int numAvail;
    
    public Chips (String n, double p){
        name = n;
        price = p;
        
    }
    public void setName (String newName){
        name = newName;
    }
    public void setPrice (double newPrice){
        price = newPrice;
    }
    public void vendItem (int n, Chips[] chipsArray){
        numAvail--;
        
    }
    public void restock (int numChips){
        numAvail++;
    }
}