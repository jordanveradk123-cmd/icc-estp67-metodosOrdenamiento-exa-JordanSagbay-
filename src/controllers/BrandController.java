package controllers;

import models.Brand;

public class BrandController {
    public Brand[] sortSelectionDesc(Brand[] brands) {
        int n = brands.length;
        for(int i =0;i<n-1;i++){
            int num =i;
            for(int j=i+1;j<n;j++){
                if(brands[num].getTotalValidYears()<brands[j].getTotalValidYears()){
                    num=j;
                }
            }
            
            Brand aux =brands[num];
            brands[num]=brands[i];
            brands[i]=aux;
            
        }
        return brands;
}
    public Brand[] sortSelectionAsc(Brand[] brands) {
        int n = brands.length;
        for(int i =0;i<n-1;i++){
            int num =i;
            for(int j=i+1;j<n;j++){
                if(brands[num].getTotalValidYears()>brands[j].getTotalValidYears()){
                    num=j;
                }
            }
            
            Brand aux =brands[num];
            brands[num]=brands[i];
            brands[i]=aux;
            
        }
        return brands;
}

    public Brand[]  sortBubbleDesc(Brand[] brands){
        int n = brands.length;
        boolean hinter;
        for(int i=0;i<n-1;i++){
            hinter=false;
            for(int j=0;j<n-1-i;j++){
                if(brands[j].getTotalValidYears()<brands[j+1].getTotalValidYears()){
                        Brand aux = brands[j];
                        brands[j]=brands[j+1];
                        brands[j+1]=aux;

                        hinter = true;
                }
            }
            if(!hinter){
                break;
            }

        }
        return brands;


    }

    public Brand[] sortInsertionDesc(Brand[] brands) {
        for(int i=1;i<brands.length;i++){
            Brand min=brands[i];
            int minimo= min.getTotalValidYears();
            int j =i-1;
            while(j>=0 &&brands[j].getTotalValidYears()<minimo){
            brands[j+1]=brands[j];
            j--;
            }
        
        brands[j+1]=min;
        }
        return brands;
    }
    public Brand binarySearchByValidYears(Brand[] brands, int validYears,boolean isAscending) {
        int inicio = 0;
        int fin=brands.length-1;
        while(inicio<=fin){
            int medio=inicio+(fin-inicio)/2;
            int aniosMedio = brands[medio].getTotalValidYears();
            if(aniosMedio==validYears){
                return brands[medio];
            }
            if(isAscending){
                if(aniosMedio<validYears){
                    inicio=medio+1;
                }else
                    fin=medio-1;
            }else{
                if(aniosMedio<validYears){
                    fin =medio-1;
                }else
                    inicio=medio+1;
                    
            }
        }
        return null;
  
    }

}


   

  