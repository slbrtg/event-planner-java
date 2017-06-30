public class Event {
  private int mNumOfGuests;
  private String mFoodSelection;
  private String mBevySelection;
  private String mEntertainmentSelection;
  private int mCost;
  private int mDiscounts;

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
  public void subFromCost(int price){
    mCost += price;
  }
  public int getCost(){
    return mCost;
  }

  public int getDiscounts(){
    return mDiscounts;
  }


  public void addGuestsPriceToCost(){
    if (mNumOfGuests > 720){
      addToCost(500);
    } else if (mNumOfGuests > 300){
      addToCost(1000);
    } else {
      addToCost(100);
    }
  }

  public void addFoodPriceToCost(){
    if (mFoodSelection.equals("In N Out")){
      addToCost(500);
    } else if (mFoodSelection.equals("Taco truck")){
      addToCost(1000);
    }
  }

  public void addBevyPriceToCost(){
    if (mBevySelection.equals("Peach Tea")){
      addToCost(700);
    } else if (mBevySelection.equals("Horchata")){
      addToCost(1200);
    }
  }

  public void addEntertainmentPriceToCost(){
    if (mEntertainmentSelection.equals("NBA Star Detlef Shrempf")){
      addToCost(20);
    } else if (mEntertainmentSelection.equals("MouseRat")){
      addToCost(35);
    } else if (mEntertainmentSelection.equals("Mariachi")){
      addToCost(75);
    }
  }

  public void applyDiscounts(){
    if (mNumOfGuests > 1000 && mEntertainmentSelection.equals("MouseRat")){
      subFromCost(100);
      mDiscounts = 100;
    } else if (mFoodSelection.equals("Taco truck") && mBevySelection.equals("Horchata") && mEntertainmentSelection.equals("Mariachi")){
      subFromCost(500);
      mDiscounts = 500;
    }
  }

  public void breakOrGo(String yesOrNo){
    if (yesOrNo.equals("No")){
      System.out.println("We'll see you next time :]");
      System.exit(0);
    }
  }

}
