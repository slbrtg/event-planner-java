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

}
