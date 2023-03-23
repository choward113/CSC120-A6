import java.util.ArrayList;

import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

  public String toString(){
    String description = super.toString();
    description += ". This house currently has " + this.residents.size() + " residents.";
    description += " It ";
    if (this.hasDiningRoom){
      description += "has";
    } else {
      description += "does not have";
    }
    description += " a dining room.";
    return description;
  }

  public ArrayList getResidents(){
    return this.residents;
  }

  public boolean getHasDiningRoom(){
    return hasDiningRoom;
  }

  public void moveIn(String name){
    if (!isResident(name)){
      System.out.println("Added "+ name + " to " + this.getName());
      this.residents.add(name);
    } else {
      System.out.println(name + " is already in "+ this.getName());
    }
  }

  public String moveOut(String name){
    if (isResident(name)){
      this.residents.remove(name);
    } else {
      System.out.println(name + " is not in "+ this.getName());
    }
    return name;
  }

  public boolean isResident(String person){
    return this.residents.contains(person);
  }

  public static void main(String[] args) {
    House ziskind = new House("Ziskind", "1 Henshaw Ave", 3, true);
    House capen = new House("Capen", "26 prospect st", 3, false);
    capen.moveOut("Person1");
    capen.moveIn("Person1");
    capen.moveIn("Person1");
    capen.moveOut("Person1");
  }

}