package work.gabrielsantos.app.Models;

import java.util.ArrayList;

public class Agency {
    protected String name;
    protected ArrayList<Client> clients;
    protected double promotions;
    protected Seasons season;

    public Agency(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
    }

    public Agency(String name, double promotions, Seasons season) {
        this.name = name;
        this.promotions = promotions;
        this.season = season;
        this.clients = new ArrayList<Client>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    /**
     * @param clients
     */
    public void setClients(ArrayList<Client> clients) {
        for (Client c: clients) {
            addClient(c);
        }
    }

    public void addClient(Client c) {
        this.clients.add(c);
    }

    public double getPromotions() {
        return promotions;
    }

    public void setPromotions(double promotions) {
        this.promotions = promotions;
    }

    public Seasons getSeason() {
        return season;
    }

    public void setSeason(Seasons season) {
        this.season = season;
    }
}
