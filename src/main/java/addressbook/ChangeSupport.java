package addressbook;

import java.util.HashSet;
import java.util.Set;

/**
 * class ChangeSupport.
 */
public class ChangeSupport {

  private Set<Change> changeListener = new HashSet<>();
  public void fire(){
    changeListener.forEach(Change::change);
  }
  public Change addOnChange(Change c) {
    changeListener.add(c);
    return c;
  }

  public void removeOnChange(Change c) {
    changeListener.remove(c);
  }
}
