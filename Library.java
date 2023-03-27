import java.util.Hashtable;
import java.util.Enumeration;

/* This is a stub for the Library class */
public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
    }
  
  public void addTitle(String title){
    this.collection.put(title, true);
  }

  public String removeTitle(String title){
    //add try catch if book is checked out
    this.collection.remove(title, true);
    return title;
  }

  public void checkOut(String title){
    if (this.collection.get(title)) {
      this.collection.put(title, false);
    }else{
      throw new RuntimeException(title + " is not in the library right now.");
    }
  }

  public void returnBook(String title){
    this.collection.replace(title, false, true);
  }

  public boolean containsTitle(String title){
    return this.collection.getOrDefault(title, false);
  }
  
  public boolean isAvailable(String title){
    return this.collection.getOrDefault(title, false);
  }
  
  public void printCollection(){
    String entireCollection = "";
    Enumeration<String> keys = this.collection.keys();
    while (keys.hasMoreElements()) {
      String title = keys.nextElement();
      Boolean inStock = this.collection.get(title);
      String isCheckedOut = "Available";
      if (!inStock){
        isCheckedOut = "Checked out";
      }
      System.out.println("Title: " + title + ", Status: " + isCheckedOut);
    }
    System.out.println(entireCollection);
  }
  /*3. For good measure, we'll also write a couple of methods to support browsing the collection:
```
public void printCollection(); // prints out the entire collection in an easy-to-read way (including checkout status)
```*/
    public static void main(String[] args) {
      Library lib = new Library("name", "address", 2);
      lib.addTitle("Fish");
      lib.addTitle("Cat");
      System.out.println(lib.isAvailable("Fish"));
      lib.checkOut("Fish");
      lib.printCollection();
    }

  }