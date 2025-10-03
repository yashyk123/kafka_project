package com.consumer.consumer.Controller;

public class RiderLocation {
    private String riderId;
    private double latitude;
    private  double longitude;

    public RiderLocation() {
    }

    public RiderLocation(String riderId, double latitude, double longitude) {
        this.riderId = riderId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
