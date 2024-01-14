package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private final int[] priceArray = new int[4];
    private int cheeseCounter = 0 , toppingCounter = 0 , takeAwayCounter = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        //PriceArray[0] is Base Price
        if(isVeg){
            priceArray[0] = 300;
            price=300;
        }if(!isVeg){
            priceArray[0] = 400;
            price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        //PriceArray[1] is ExtraCheese
        if(cheeseCounter==0)price+=80;
        cheeseCounter++;
        priceArray[1] = 80; //*cheeseCounter;
    }

    public void addExtraToppings(){
        //PriceArray[2] is ExtraToppings
        //toppingCounter++;
        if(isVeg){
            if(toppingCounter==0)price+=70;
            priceArray[2] =70;//*toppingCounter;
        }
        if(!isVeg){
            if(toppingCounter==0)price+=120;
            priceArray[2] = 120;//*toppingCounter;
        }
    }

    public void addTakeaway(){
        //PriceArray[3] is Paper Bag
        priceArray[3] = 20;
        if(takeAwayCounter==0)price+=20;
        takeAwayCounter++;
    }

    public String getBill(){
        for(int i = 0 ; i<priceArray.length ; ++i){
            switch (i) {
                default:
                    break;
                case 0:
                    if (priceArray[i] != 0) bill = "Base Price Of The Pizza: " + priceArray[0] + "\n";
                    break;
                case 1:
                    if(priceArray[i] != 0) bill += "Extra Cheese Added: " + priceArray[1] + "\n";
                    break;
                case 2:
                    if(priceArray[i] != 0) bill += "Extra Toppings Added: " + priceArray[2] + "\n";
                    break;
                case 3:
                    if(priceArray[i] != 0)bill += "Paperbag Added: " + priceArray[3] + "\n";
                    break;
            }
        }
        bill+= "Total Price: " + price + "\n";
        return this.bill;
    }
}
