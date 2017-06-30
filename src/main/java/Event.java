public class Event {
  private int mNumOfGuests;
  private String mFoodSelection;
  private String mBevySelection;
  private String mEntertainmentSelection;

  public void setNumOfGuests(int numOfGuests){
    mNumOfGuests = numOfGuests;
  }
  public int getNumOfGuests(){
    return mNumOfGuests;
  }

  public void setFoodSelection(String foodSelection){
    mFoodSelection = foodSelection;
  }
  public String getFoodSelection(){
    return mFoodSelection;
  }
}
