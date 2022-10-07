import java.util.Scanner;
public class VendingMachine{
    /*
    
    */
    public static void main (String [] args){
        Scanner user = new Scanner(System.in);
        double money = 10.00;
        double remaining;
        String l;
        int n;
        
        while (money >= 0.50 ){
        System.out.println();
        System.out.println();
        System.out.println ("Welcome to the Vending Machine! You have $" + money + " to spend.");
        System.out.println("Enter the word BREAK to close the program.");
        System.out.println();
        System.out.println ("Chips \t \t $1.50 \t \t \t \t \t \t Mixed Snacks \t $1.00");
            System.out.println ("\t Better Made BBQ Chips \t \t \t A1 \t \t \t Planters Honey Roasted Peanuts \t B1");
            System.out.println ("\t Better Made Regular Chips \t \t A2 \t \t \t Planters Regular Peanuts \t \t B2");    
            System.out.println ("\t Fritos Regular \t \t \t A3 \t \t \t Nature Valley Sweet & Salty \t \t B3");            
            System.out.println ("\t Fritos BBQ Twists \t \t \t A4 \t \t \t Goldfish Regular \t \t \t B4");
            System.out.println ("\t Nacho Cheese Doritos \t \t \t A5 \t \t \t Goldfish XtraCheddar \t \t  \t B5");
            System.out.println ("\t Cool Ranch Doritos \t \t \t A6 \t \t \t Oreos \t \t \t \t \t B6");
        System.out.println();
        System.out.println ("Gummy Candies \t $1.75 \t \t \t \t \t \t Candy \t \t $1.50");
            System.out.println ("\t Welch's Fruit Snacks \t \t \t C1 \t \t \t Skittles \t \t \t \t D1");
            System.out.println ("\t Life Savers Gummies \t \t \t C2 \t \t \t Sour Skittles \t \t \t \t D2");    
            System.out.println ("\t Sour Patch Kids \t \t \t C3 \t \t \t Resse's Peanut Butter Cups \t \t D3");            
            System.out.println ("\t Sour Patch Watermelon \t \t \t C4 \t \t \t Snickers \t \t \t \t D4");
            System.out.println ("\t Swedish Fish \t \t \t \t C5 \t \t \t Milkyway \t \t \t \t D5");
            System.out.println ("\t Starburst \t \t \t \t C6 \t \t \t Twizzlers \t \t \t \t D6");
        System.out.println();
        System.out.println ("Gum \t  \t $0.50 \t \t \t \t \t \t Drinks \t $2.00");
            System.out.println ("\t Extra Spearmint \t \t \t E1 \t \t \t Faygo Cream Soda \t \t \t F1");
            System.out.println ("\t Extra Peppermint \t \t \t E2 \t \t \t Faygo Rock and Rye \t \t \t F2");    
            System.out.println ("\t Extra Spearmint Sugar Free \t \t E3 \t \t \t Faygo Grape \t \t \t \t F3");            
            System.out.println ("\t Extra Peppermint Sugar Free \t \t E4 \t \t \t Vernors \t \t \t \t F4");
            System.out.println ("\t Trident Tropical Twist Sugar Free \t E5 \t \t \t Coke \t \t \t \t \t F5");
            System.out.println ("\t Five Gum React Mint \t \t \t E6 \t \t \t Diet Coke \t \t \t \t F6");
        System.out.println();
        System.out.println ("Select the letter of the item you would like ");
        l = user.nextLine();
      
        if (l.equals("A") || l.equals("a")){
            System.out.println ("Now select the number of the the item ");
            n = user.nextInt();
            user.nextLine();
         if (vendChips(n, money) == null){
                System.out.println ("That is not an option");
            }
            remaining = money - vendChips(n, money).price;
            System.out.println("Here is your item: " + vendChips(n, money).name);
            System.out.println ("You have $" + remaining + " remaining");
            money -= vendChips(n, money).price; 
            
        }
        else if (l.equals("B") || l.equals("b")){
            System.out.println ("Now select the number of the the item ");
            n = user.nextInt();
            user.nextLine();
            if (vendSnacks(n, money) == null){
                System.out.println ("That is not an option");
            }
            remaining = money - vendSnacks(n, money).price;
            System.out.println("Here is your item: " + vendSnacks(n, money).name);
            System.out.println ("You have $" + remaining + " remaining");
            money -= vendSnacks(n, money).price; 
            
        }
        else if (l.equals("C") || l.equals("c")){
            System.out.println ("Now select the number of the the item ");
            n = user.nextInt();
            user.nextLine();
            if (vendGummy(n, money) == null){
                System.out.println ("That is not an option");
            }
            remaining = money - vendGummy(n, money).price;
            System.out.println("Here is your item: " + vendGummy(n, money).name);
            System.out.println ("You have $" + remaining + " remaining");
            money -= vendGummy(n, money).price; 
            
        }
        else if (l.equals("D") || l.equals("d")){
            System.out.println ("Now select the number of the the item ");
            n = user.nextInt();
            user.nextLine();
            if (vendCandy(n, money) == null){
                System.out.println ("That is not an option");
            }
            remaining = money - vendCandy(n, money).price;
            System.out.println("Here is your item: " + vendCandy(n, money).name);
            System.out.println ("You have $" + remaining + " remaining");
            money -= vendCandy(n, money).price; 
            
        }
        else if (l.equals("E") || l.equals("e")){
            System.out.println ("Now select the number of the the item ");
            n = user.nextInt();
            user.nextLine();
            if (vendGum(n, money) == null){
                System.out.println ("That is not an option");
            }
            remaining = money - vendGum(n, money).price;
            System.out.println("Here is your item: " + vendGum(n, money).name);
            System.out.println ("You have $" + remaining + " remaining");
            money -= vendGum(n, money).price; 
            
        }
        else if (l.equals("F") || l.equals("f")){
            System.out.println ("Now select the number of the the item ");
            n = user.nextInt();
            user.nextLine();
            if (vendDrinks(n, money) == null){
                System.out.println ("That is not an option");
            }
            remaining = money - vendDrinks(n, money).price;
            System.out.println("Here is your item: " + vendDrinks(n, money).name);
            System.out.println ("You have $" + remaining + " remaining");
            money -= vendDrinks(n, money).price; 
            
        }
        else {
            break;
            }
        } 
    }
    
    public static Chips vendChips (int n, double money){
        Chips item;
        Chips chipsArray[] = new Chips[6];
        Chips BetterMadeBBQ = new Chips("Better Made BBQ", 1.50);
        Chips BetterMadeReg = new Chips("Better Made Reg", 1.50);
        Chips FritosRegular = new Chips("Fritos Regular", 1.50);
        Chips FritosBBQ = new Chips("Fritos BBQ Twists", 1.50);
        Chips DoritosNacho = new Chips("Nacho Cheese Doritos", 1.50);
        Chips DoritosRanch = new Chips("Cool Ranch Doritos", 1.50);
        chipsArray[0] = BetterMadeBBQ;
        chipsArray[1] = BetterMadeReg;
        chipsArray[2] = FritosRegular;
        chipsArray[3] = FritosBBQ;
        chipsArray[4] = DoritosNacho;
        chipsArray[5] = DoritosRanch;
        item = chipsArray[n-1];
        if (money < chipsArray[n-1].price){
            System.out.println ("INNADEQUATE FUNDS");
            return null;
        }
        else if (n > chipsArray.length){
            return null;
        }
        else{
            return item;
        }
    }
    public static MixedSnacks vendSnacks (int n, double money){
        MixedSnacks item;
        MixedSnacks snacksArray[] = new MixedSnacks[6];
        MixedSnacks PlantersHoneyRoasted = new MixedSnacks("Planters Honey Roasted Peanuts", 1.00);
        MixedSnacks PlantersReg = new MixedSnacks("Planters Regular Peanuts", 1.00);
        MixedSnacks NatureValleySS = new MixedSnacks("Nature Valley Sweet & Salty", 1.00);
        MixedSnacks GoldfishReg = new MixedSnacks("Goldfish Regular", 1.00);
        MixedSnacks GoldfishXtraCheddar = new MixedSnacks("Goldfish XtraCheddar", 1.00);
        MixedSnacks Oreos = new MixedSnacks("Oreos", 1.00);
        snacksArray[0] = PlantersHoneyRoasted;
        snacksArray[1] = PlantersReg;
        snacksArray[2] = NatureValleySS;
        snacksArray[3] = GoldfishReg;
        snacksArray[4] = GoldfishXtraCheddar;
        snacksArray[5] = Oreos;
        item = snacksArray[n-1];
        if (money < snacksArray[n-1].price){
            System.out.println ("INNADEQUATE FUNDS");
            return null;
        }
        else if (n > snacksArray.length){
            return null;
        }
        else{
            return item;
        }
    } 
    public static Gummy vendGummy (int n, double money){
        Gummy item;
        Gummy gummyArray[] = new Gummy[6];
        Gummy WelchsFruitSnacks = new Gummy("Welch's Fruit Snacks", 1.75);
        Gummy LifeSaversGummies = new Gummy("Life Savers Gummies", 1.75);
        Gummy SourPatchKids = new Gummy("Sour Patch Kids", 1.75);
        Gummy SourPatchWatermelon = new Gummy("Sour Patch Watermelon", 1.75);
        Gummy SwedishFish = new Gummy("Swedish Fish", 1.75);
        Gummy Starburst = new Gummy("Starburst", 1.75);
        gummyArray[0] = WelchsFruitSnacks;
        gummyArray[1] = LifeSaversGummies;
        gummyArray[2] = SourPatchKids;
        gummyArray[3] = SourPatchWatermelon;
        gummyArray[4] = SwedishFish;
        gummyArray[5] = Starburst;
        item = gummyArray[n-1];
        if (money < gummyArray[n-1].price){
            System.out.println ("INNADEQUATE FUNDS");
            return null;
        }
        else if (n > gummyArray.length){
            return null;
        }
        else{
            return item;
        }
    }
    public static Candy vendCandy (int n, double money){
        Candy item;
        Candy candyArray[] = new Candy[6];
        Candy Skittles = new Candy("Skittles", 1.50);
        Candy SourSkittles = new Candy("Sour Skittles", 1.50);
        Candy RessesPBCups = new Candy("Resse's Peanut Butter Cups", 1.50);
        Candy Snickers = new Candy("Snickers", 1.50);
        Candy Milkyway = new Candy("Milkyway", 1.50);
        Candy Twizzlers = new Candy("Twizzlers", 1.50);
        candyArray[0] = Skittles;
        candyArray[1] = SourSkittles;
        candyArray[2] = RessesPBCups;
        candyArray[3] = Snickers;
        candyArray[4] = Milkyway;
        candyArray[5] = Twizzlers;
        item = candyArray[n-1];
        if (money < candyArray[n-1].price){
            System.out.println ("INNADEQUATE FUNDS");
            return null;
        }
        else if (n > candyArray.length){
            return null;
        }
        else{
            return item;
        }
    }
    public static Gum vendGum (int n, double money){
        Gum item;
        Gum gumArray[] = new Gum[6];
        Gum ExtraSpearmint = new Gum("Extra Spearmint", 0.50);
        Gum ExtraPeppermint = new Gum("Extra Peppermint", 0.50);
        Gum ExtraSpearmintSF = new Gum("Extra Spearmint Sugar Free", 0.50);
        Gum ExtraPeppermintSF = new Gum("Extra Peppermint Sugar Free", 0.50);
        Gum TridentTropicalTwistSF = new Gum("Trident Tropical Twist Sugar Free", 0.50);
        Gum FiveGumReactMint = new Gum("Five Gum React Mint", 0.50);
        gumArray[0] = ExtraSpearmint;
        gumArray[1] = ExtraPeppermint;
        gumArray[2] = ExtraSpearmintSF;
        gumArray[3] = ExtraPeppermintSF;
        gumArray[4] = TridentTropicalTwistSF;
        gumArray[5] = FiveGumReactMint;
        item = gumArray[n-1];
        if (money < gumArray[n-1].price){
            System.out.println ("INNADEQUATE FUNDS");
            return null;
        }
        else if (n > gumArray.length){
            return null;
        }
        else{
            return item;
        }
    }
    public static Drinks vendDrinks (int n, double money){
        Drinks item;
        Drinks drinksArray[] = new Drinks[6];
        Drinks FaygoCS = new Drinks("Faygo Cream Soda", 2.00);
        Drinks FaygoRR = new Drinks("Faygo Rock and Rye", 2.00);
        Drinks FaygoGrape = new Drinks("Faygo Grape", 2.00);
        Drinks Vernors = new Drinks("Vernors", 2.00);
        Drinks Coke = new Drinks("Coke", 2.00);
        Drinks DietCoke = new Drinks("Diet Coke", 2.00);
        drinksArray[0] = FaygoCS;
        drinksArray[1] = FaygoRR;
        drinksArray[2] = FaygoGrape;
        drinksArray[3] = Vernors;
        drinksArray[4] = Coke;
        drinksArray[5] = DietCoke;
        item = drinksArray[n-1];
        if (money < drinksArray[n-1].price){
            System.out.println ("INNADEQUATE FUNDS");
            return null;
        }
        else if (n > drinksArray.length){
            return null;
        }
        else{
            return item;
        }
    }
}
