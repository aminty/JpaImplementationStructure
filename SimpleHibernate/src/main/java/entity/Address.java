package entity;

import base.entity.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address extends BaseEntity<Long> {

    private Integer plaque;

    private String street;

    private String home;

    @ManyToOne
    private User user;

    public Address() {
    }


    public Address(Integer plaque, String street, String home, User user) {
        this.plaque = plaque;
        this.street = street;
        this.home = home;
        this.user = user;
    }
    public Address(Integer plaque, String street, String home) {
        this.plaque = plaque;
        this.street = street;
        this.home = home;
    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getPlaque() {
        return plaque;
    }

    public void setPlaque(Integer plaque) {
        this.plaque = plaque;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
