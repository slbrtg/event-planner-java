public class Event {
  private int mNumOfGuests;
  private String mFoodSelection;
  private String mBevySelection;
  private String mEntertainmentSelection;
  private int mCost;

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

  public void setBevySelection(String bevySelection){
    mBevySelection = bevySelection;
  }
  public String getBevySelection(){
    return mBevySelection;
  }

  public void setEntertainmentSelection(String entertainmentSelection){
    mEntertainmentSelection = entertainmentSelection;
  }
  public String getEntertainmentSelection(){
    return mEntertainmentSelection;
  }

  public void addToCost(int price){
    mCost += price;
  }
}
