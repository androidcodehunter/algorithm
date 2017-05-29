package warmup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sharif-PC on 5/23/2017.
 */
public class ListTest {

   static class Contact{
        String id;
        String name;
   }

    public static void main(String[] args) {


        List<Contact>contacts = new ArrayList<>();
        Contact contact = new Contact();
        contact.id = "1";
        contact.name = "Abir";
        contacts.add(contact);

        Contact contact1 = new Contact();
        contact1.id = "2";
        contact1.name = "Abir 2";
        contacts.add(contact1);

        Map<String, Contact>map = new HashMap<>();
        map.put(contact.id, contact);
        map.put(contact1.id, contact1);

        Contact contact2 = new Contact();
        contact2.id = "1";
        contact2.name = "Sharif";

        if (map.containsKey(contact2.id)){
            Contact value = map.get(contact2.id);
            value.name = "updated";
            map.put(contact2.id, value);
            System.out.println("containsKey");
        }else {
            map.put(contact2.id, contact2);
            System.out.println("not contains key");
        }


        System.out.println(map.get("erere"));

    }

}
