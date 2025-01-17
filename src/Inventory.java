public class Inventory {
    // antal objekt i spelarens inventory
    private String bag;

    // antalet pengar användaren har. Visar hur mycket pengar spelaren kan använda tills spelet tar slut
    private double cash;

    private int amount;

    private double cost;



    // konstruktor
    Inventory(String bag, double cost, double cash, int amount){
        this.setBag(bag);
        this.setCash(cash);
        this.setAmount(amount);
        this.setCost(cost);

    }

    //getters setters
    public String getBag(){

        return bag;
    }
    public double getCash(){

        return cash;
    }
    public int getAmount(){

        return amount;
    }
    public double getCost(){
        return cost;
    }

    public void setBag(String bag){

        this.bag =  bag;
    }
    public void setCash(double cash){

        this.cash = cash;
    }
    public void setAmount(int amount){

        this.amount = amount;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    //
    /*Metod som uppdaterar vad som är köpt och hur mycket som är spenderat.
    Lägger in klassen Food i parametrarna så att jag kan addera objekten från klassen.
     */
    public void updateBag(Food food){
        bag += food.getName();
        cash -= food.getPrice();
        cost -= food.getPrice();
        System.out.println("In bag: (" + getBag() + " SEK spent ( " + getCost() + "). SEK remaining (" + getCash() + ")");
    };

    // Metod som skriver ut all info om spelaren
    public void inBag(){
        System.out.println("In bag: (Nothing) " + " SEK spent ( " + getCost() + " ) SEK remaining (" + getCash() + ")" );
        };

    // Metod som lägger på antal varor köpta
    public void amountBought(){
        amount ++;
    }


    }



