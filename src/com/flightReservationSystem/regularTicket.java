package com.flightReservationSystem;

public class regularTicket {
    private String food;
    private boolean water;
    private String snacks;

    public regularTicket(String food, boolean water, String snacks){
        this.food=food;
        this.water=water;
        this.snacks=snacks;
    }

    public void getFood(){
        System.out.println("Food: "+food);
    }
    public void setFood(String food){
        this.food=food;
    }
    public void getWater(){
        System.out.println("Water: "+water);
    }
    public void setWater(boolean water){
        this.water=water;
    }
    public void getSnacks(){
        System.out.println("Snacks: "+snacks);
    }

    public void setSnacks(String snacks){
        this.snacks=snacks;
    }
}
