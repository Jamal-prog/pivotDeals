package com.pivot.pivotDeals;

import java.util.ArrayList;

public class Restaurant {
    public int id;
    public String name;
    public ArrayList<Deal> deals = new ArrayList<>();
    public Location location;

    public Restaurant(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.deals = deals;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Deal> getDeals() {
        return deals;
    }

    public void setDeals(ArrayList<Deal> deals) {
        this.deals = deals;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public void addDeal(Deal deal){
        this.deals.add(deal);
    }
    public void removeDeal(Deal deal){
        this.deals.remove(deal);
    }
}
