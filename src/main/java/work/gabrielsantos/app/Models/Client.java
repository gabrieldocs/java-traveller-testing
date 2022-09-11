package work.gabrielsantos.app.Models;

import java.util.Date;

public class Client {
    protected long id;
    protected String name;
    protected Date birthday;
    protected String username;
    protected String email;
    protected String phone;
    protected Status status;
    protected Wallet wallet;

    public Client(String name, Date birthday, String username, String email, String phone) throws Exception{
        try {
            this.name = name;
            this.birthday = birthday;
            this.username = username;
            this.email = email;
            this.phone = phone;
            if(email == null || phone == null) {
                this.status = Status.INACTIVE;
                throw new Exception("Cannot stat client status before email and phone equals null");
            } else {
                this.status = Status.ACTIVE;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Client(long id, String name, Date birthday, String username, String email, String phone, Status status, Wallet wallet) {
        try {
            this.id = id;
            this.name = name;
            this.birthday = birthday;
            this.username = username;
            this.email = email;
            this.phone = phone;
            this.wallet = wallet;
            if(email == null || phone == null) {
                this.status = Status.INACTIVE;
                throw new Exception("Cannot stat client status before email and phone equals null");
            } else {
                this.status = status;
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                ", wallet=" + wallet +
                '}';
    }
}
