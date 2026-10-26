package com.pluralsight;

public class Vehicle {
    //declaration outside of method
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

//    public Vehicle(){

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, double price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    ////     constructor
//        vehicleId = 0;//initialize, assignment
//        makeModel = "";
//        color = "";
//        odometerReading = 0;
//        price = 0.0;
//    }



    public long getVehicleId(){
        return vehicleId;
    }

    public void setVehicleId(long vehicleId){
        this.vehicleId = vehicleId;
    }
// generate getter and setter for other variables
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
// \n works in strings
//%n works in String inside a format method
    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +"\n"+
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", odometerReading=" + odometerReading +
                ", price=" + price +
                '}';
    }
}
