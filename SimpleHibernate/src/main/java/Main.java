import entity.Address;
import entity.User;
import entity.dto.SimpleUser;
import util.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        User newUser1 = new User("amin", "tavakkoli", "aminty", "aminty1010");



       Address address1=new Address(125,"besat","niloofar");


        newUser1.addAddress(address1);



        ApplicationContext.getUserService().save(newUser1);



    }
}
