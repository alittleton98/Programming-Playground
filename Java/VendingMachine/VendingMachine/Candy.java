public class Candy{
    public String name;
    public double price;
    public int numAvail;
    
    public Candy (String n, double p){
        name = n;
        price = p;
        
    }
    public void setName (String newName){
        name = newName;
    }
    public void setPrice (double newPrice){
        price = newPrice;
    }
    public void vendItem (int numCandy){
        numAvail--;
        
    }
    public void restock (int numCandy){
        numAvail++;
    }
}