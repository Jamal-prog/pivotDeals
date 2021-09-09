package com.pivot.pivotDeals;

public class Location {
    private double latitude = 0;
    private double longitude = 0;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getX() {
        return latitude;
    }

    public void setX(double x) {
        this.latitude = latitude;
    }

    public double getY() {
        return longitude;
    }

    public void setY(double y) {
        this.longitude = longitude;
    }
    public void setXY(double x, double y){
        this.latitude = latitude;
        this.longitude = longitude;
    }
    static double haversine(double lat1,double lon1, double lat2, double lon2){
        double dLat = Math.toRadians(lat2-lat1);
        double dLon = Math.toRadians(lon2-lon1);

        //convert to radians
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        //Apply formula
        double a = Math.pow(Math.sin(dLat/2),2) + Math.pow(Math.sin(dLon/2),2)*Math.cos(lat1)*Math.cos(lat2);
        double rad = 6371;
        double c = 2* Math.asin(Math.sqrt(a));
        return rad*c;

    }


}
