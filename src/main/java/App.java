import java.io.Console;

public class App {
  public static void main(String[] args) {
    Event entertainment720 = new Event();
    Console listener = System.console();
    System.out.println("Welcome to Entertainment 720");
    System.out.println("Care to see what's on the menu?");
    System.out.println("Yes : No");
    String yesOrNo = listener.readLine();
    entertainment720.breakOrGo(yesOrNo);

    System.out.println("First things first, how many guests are you expecting?");
    String numOfGuests = listener.readLine();
    entertainment720.setNumOfGuests(Integer.parseInt(numOfGuests));
    entertainment720.addGuestsPriceToCost();

    System.out.println("Excellent, up next is food");
    System.out.println("In N Out Truck, 500");
    System.out.println("Taco Truck, 1000");
    System.out.println("Please select one of the below");
    System.out.println("In N Out Truck  :  Taco Truck");
    String foodSelection  = listener.readLine();
    entertainment720.setFoodSelection(foodSelection);
    entertainment720.addFoodPriceToCost();

    System.out.println("Yes, yes, good, good. Up next is drinks");
    System.out.println("Peach Tea, 700");
    System.out.println("Horchata, 1200");
    System.out.println("Please select one of the below");
    System.out.println("Peach Tea  :  Horchata");
    String bevySelection  = listener.readLine();
    entertainment720.setBevySelection(bevySelection);
    entertainment720.addBevyPriceToCost();

    System.out.println("Now for the Entertainment");
    System.out.println("Detlef Shrempf hooping, 20");
    System.out.println("MouseRat, 35");
    System.out.println("Mariachi, 75");
    System.out.println("Mariachi  :  MouseRat  :  Detlef Shrempf");
    String entertainmentSelection = listener.readLine();
    entertainment720.setEntertainmentSelection(entertainmentSelection);
    entertainment720.addEntertainmentPriceToCost();


    System.out.println(entertainment720.applyDiscounts());
    System.out.println("Your total is " + entertainment720.getCost());
  }
}
