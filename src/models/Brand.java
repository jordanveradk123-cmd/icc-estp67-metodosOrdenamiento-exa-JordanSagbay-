package models;

import java.util.Arrays;


public class Brand {
  private String brandName;
  private CarModel[] models;
  //Contructor
  public Brand(String brandName, CarModel[] models) {
    this.brandName = brandName;
    this.models = models;
  }
  // Getters y Setters
  public String getBrandName() {
    return brandName;
  }
  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }
  public CarModel[] getModels() {
    return models;
  }
  public void setModels(CarModel[] models) {
    this.models = models;
  }
  public int getTotalValidYears() {
    int n=0;
    for (CarModel model: models) {
      for(CarYear year:model.getYears()){
        if(year.isValid()){
          n++;
        }
      }
      
    }
    return n;
  }
 
  @Override
  public String toString() {
    return "Brand [brandName=" + brandName + ", models=" + Arrays.toString(models) + "]";
  }
  
  
   
} 


  

