public class Job{
  private String mTitle;
  private String mCompany;
  private String mCity;
  private String mState;
  private String mDescriptionOne;
  private String mDescriptionTwo;
  private String mDescriptionThree;
  private String mStartDate;
  private String mEndDate;

  public Job(String title, String company, String city, String state, String description1, String description2, String description3, String start, String end){
    mTitle = title;
    mCompany = company;
    mCity = city;
    mState = state;
    mDescriptionOne = description1;
    mDescriptionTwo = description2;
    mDescriptionThree = description3;
    mStartDate = start;
    mEndDate = end;
  }

  public String getTitle(){
    return mTitle;
  }
  public String getCompany(){
    return mCompany;
  }
  public String getCity(){
    return mCity;
  }
  public String getState(){
    return mState;
  }
  public String getDescription1(){
    return mDescriptionOne;
  }
  public String getDescription2(){
    return mDescriptionTwo;
  }
  public String getDescription3(){
    return mDescriptionThree;
  }
  public String getStartDate(){
    return mStartDate;
  }
  public String getEndDate(){
    return mEndDate;
  }
}
