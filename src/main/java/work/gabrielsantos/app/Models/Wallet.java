package work.gabrielsantos.app.Models;

import java.util.Objects;

public class Wallet {
    public String name;
    public double amount;
    public double credit;
    public double debit;

    public Wallet(double amount, double credit, double debit) {
        this.amount = amount;
        this.credit = credit;
        this.debit = debit;
    }

    public Wallet(String name, double amount, double credit, double debit) {
        this.name = name;
        this.amount = amount;
        this.credit = credit;
        this.debit = debit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wallet)) return false;
        Wallet wallet = (Wallet) o;
        return Double.compare(wallet.getAmount(), getAmount()) == 0 && Double.compare(wallet.getCredit(), getCredit()) == 0 && Double.compare(wallet.getDebit(), getDebit()) == 0 && Objects.equals(getName(), wallet.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAmount(), getCredit(), getDebit());
    }
}
