
public class Shirt {
  public int shirtID = 24; // стандартне значення номера моделі сорочки
  public String description = "полосата"; // стандартний опис сорочки
  // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public String shirtColor = "red";
  public double price = 2.4; // стандартна вартість сорочки
  public int quantityInStock = 5; // стандартна кількість на складі
  // цей метод просто виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Shirt Color: " + shirtColor);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класу