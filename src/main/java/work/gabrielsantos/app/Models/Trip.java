package work.gabrielsantos.app.Models;

import java.util.Date;

public class Trip {
    protected Client client;
    protected Date travel_ini;
    protected Date travel_end;
    protected City city_ini;
    protected City city_dest;
    protected double price;

    public Trip(Client client, Date travel_ini, Date travel_end, City city_ini, City city_dest) {
        this.client = client;
        this.travel_ini = travel_ini;
        this.travel_end = travel_end;
        this.city_ini = city_ini;
        this.city_dest = city_dest;
    }

    public Trip(Client client, Date travel_ini, Date travel_end, City city_ini, City city_dest, double price) {
        this.client = client;
        this.travel_ini = travel_ini;
        this.travel_end = travel_end;
        this.city_ini = city_ini;
        this.city_dest = city_dest;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
