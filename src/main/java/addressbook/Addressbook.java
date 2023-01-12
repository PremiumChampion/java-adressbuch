package addressbook;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * class Addressbook.
 */
public class Addressbook {
  private Random random = new Random();
  private ChangeSupport changeSupport = new ChangeSupport();
  private HashMap<Integer, Contact> contacts = new HashMap<>();

  public int create(Contact contact) {
    if (contact == null) {
      throw new IllegalArgumentException("Contact is null.");
    }
    int id = random.nextInt();
    while(contacts.containsKey(id)){
      id = random.nextInt();
    }
    contacts.put(id, contact);
    changeSupport.fire();
    return id;
  }

  public Contact read(int id) {
    if (!contacts.containsKey(id)) {
      throw new IllegalArgumentException("Id unknown.");
    }
    return contacts.get(id);
  }

  public void update(int id, ContactUpdater updater) {
    if (!contacts.containsKey(id)) {
      throw new IllegalArgumentException("Id unknown.");
    }
    updater.update(contacts.get(id));
    changeSupport.fire();
  }

  public void delete(int id) {
    if (!contacts.containsKey(id)) {
      throw new IllegalArgumentException("Id unknown.");
    }
    contacts.remove(id);
    changeSupport.fire();
  }

  public List<Integer> getContacts(){
    return contacts.keySet().stream().sorted().collect(Collectors.toList());
  }

  public Change addOnChange(Change c){
    return this.changeSupport.addOnChange(c);
  }

  public void removeOnChange(Change c){
    this.changeSupport.removeOnChange(c);
  }
}
