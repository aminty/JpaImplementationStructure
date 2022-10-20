package entity;

import base.entity.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_table")
public class User extends BaseEntity<Long> {

    private String firstname;

    private String lastname;

    private String username;

    private String password;
    @CreationTimestamp
    private LocalDate createAt;
    @UpdateTimestamp
    protected LocalDate updateAt;

    @OneToMany(mappedBy = "user",cascade = CascadeType.PERSIST)
    private List<Address> addresses=new ArrayList<>();



    public User() {
    }

    public User(String firstname, String lastname, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    public User(String firstname, String lastname, String username, String password,List<Address> addresses) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.addresses = addresses;
    }

    public void addAddress(Address address){
        this.addresses.add(address);
        address.setUser(this);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", addresses=" + addresses +
                '}';
    }
}
