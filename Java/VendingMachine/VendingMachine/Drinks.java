public class Drinks{
    public String name;
    public double price;
    public int numAvail;
    
    public Drinks (String n, double p){
        name = n;
        price = p;
    }
    public void setName (String newName){
        name = newName;
    }
    public void setPrice (double newPrice){
        price = newPrice;
    }
    public void vendItem (int numDrinks){
        numAvail--;
    }
    public void restock (int numDrinks){
        numAvail++;
    }
}