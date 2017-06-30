import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void setgetNumOfGuests_returnNumOfGuests_17(){
    int expectedOutput = 17;
    Event testEvent = new Event();
    testEvent.setNumOfGuests(17);
    assertEquals(expectedOutput, testEvent.getNumOfGuests());
  }

  @Test
  public void setgetFoodSelection_returnFoodSelection_InNOut(){
    String expectedOutput = "In N Out";
    Event testEvent = new Event();
    testEvent.setFoodSelection("In N Out");
    assertEquals(expectedOutput, testEvent.getFoodSelection());
  }

  @Test
  public void setgetBevySelection_returnBevySelection_PeachTea(){
    String expectedOutput = "Peach Tea";
    Event testEvent = new Event();
    testEvent.setBevySelection("Peach Tea");
    assertEquals(expectedOutput, testEvent.getBevySelection());
  }

  @Test
  public void setgetEntertainmentSelection_returnEntertainmentSelection_Music(){
    String expectedOutput = "Music";
    Event testEvent = new Event();
    testEvent.setEntertainmentSelection("Music");
    assertEquals(expectedOutput, testEvent.getEntertainmentSelection());
  }

  @Test
  public void addgetCost_returnCost_10(){
    int expectedOutput = 10;
    Event testEvent = new Event();
    testEvent.addToCost(10);
    assertEquals(expectedOutput, testEvent.getCost());
  }

  @Test
  public void addFoodPriceToCost_ReturnsCost_5(){
    int expectedOutput = 500;
    Event testEvent = new Event();
    testEvent.setFoodSelection("In N Out");
    testEvent.addFoodPriceToCost();
    assertEquals(expectedOutput, testEvent.getCost());
  }

  @Test
  public void addFoodPriceToCost_ReturnsCost_10(){
    int expectedOutput = 1000;
    Event testEvent = new Event();
    testEvent.setFoodSelection("Taco truck");
    testEvent.addFoodPriceToCost();
    assertEquals(expectedOutput, testEvent.getCost());
  }

}
