package addressbook;

import java.time.LocalDate;

/**
 * class Contact.
 */
public class Contact {

  private String firstName;
  private String lastName;
  private String phone;
  private LocalDate birthday;
  private int coffeesPerDay;

  public Contact(String firstName, String lastName, String phone, LocalDate birthday,
      int coffeesPerDay) {
    if(firstName == null || firstName.trim().length() == 0){
      throw new IllegalArgumentException("firstName invalid.");
    }
    if(lastName == null || lastName.trim().length() == 0){
      throw new IllegalArgumentException("lastName invalid.");
    }
    if(phone == null || phone.trim().length() == 0){
      throw new IllegalArgumentException("phone invalid.");
    }
    if(birthday == null){
      throw new IllegalArgumentException("birthday invalid.");
    }
    if(coffeesPerDay < 0){
      throw new IllegalArgumentException("coffeesPerDay invalid.");
    }

    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
    this.birthday = birthday;
    this.coffeesPerDay = coffeesPerDay;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public int getCoffeesPerDay() {
    return coffeesPerDay;
  }

  public void setCoffeesPerDay(int coffeesPerDay) {
    this.coffeesPerDay = coffeesPerDay;
  }

  public static Contact fromCSV(String csvString){
    //TODO: implement public static Contact fromCSV(String csvString)
    // Pattern: firstName;lastName;phone;YYYY-MM-DD;coffeesPerDay
    throw new UnsupportedOperationException("public static Contact fromCSV(String csvString) not implemented.");
  }
}
